package com.scg.training.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

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
		log.info("" + returnvalue);
		return returnvalue;
	}

}
