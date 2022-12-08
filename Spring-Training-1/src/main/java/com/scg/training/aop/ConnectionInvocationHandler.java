package com.scg.training.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConnectionInvocationHandler implements InvocationHandler {
	private Connection connection;

	public ConnectionInvocationHandler(final Connection connection) {
		this.connection = connection;
	}

	@Override
	public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if (method.getName().contains("commit") || method.getName().contains("rollback")
				|| method.getName().contains("close")) {
			log.info("connection trace: " + method.toGenericString());
		}
		final Object returnValue = method.invoke(connection, args);
		return returnValue;
	}

}
