package com.scg.training.aop;

import java.lang.reflect.Proxy;
import java.sql.Connection;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.ConnectionImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class DataSourceAspect {

	@Around("target(javax.sql.DataSource)")
	public Object computeExecutionTime(final ProceedingJoinPoint joinPoint) throws Throwable {

		final String message = "Data source tracker : " + joinPoint.getSignature().getName();
		final Object returnvalue = joinPoint.proceed();
		log.info(message);
		// log.info("" + returnvalue);
		if (returnvalue instanceof Connection) {
			final Connection con = (Connection) Proxy.newProxyInstance(ConnectionImpl.class.getClassLoader(),
					new Class[] { Connection.class }, new ConnectionInvocationHandler((Connection) returnvalue));
			return con;
		}
		return returnvalue;
	}

}
