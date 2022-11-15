package com.scg.training.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class MyAspect {
	@Before("execution(* com.scg.training.service.impl.StudentServiceImpl.*(..))")
	public void before(final JoinPoint joinPoint) {
		log.info("Before....");
		log.info(joinPoint.getSignature().getName());
	}

//	@After("execution(* com.scg.training.service.impl.StudentServiceImpl.*(..))")
//	public void after(final JoinPoint joinPoint) {
//		System.out.print("After....");
//		System.out.println(joinPoint.getSignature().getName());
//	}
	@AfterReturning(pointcut = "execution(* com.scg.training.service.impl.StudentServiceImpl.*(..))", returning = "result")
	public void afteReturning(final JoinPoint joinPoint, final Object result) {
		log.info("After....");
		log.info(joinPoint.getSignature().getName());
		// System.out.println("Result is" + result);
		// final ObjectMapper m = new ObjectMapper();
		// m.writeValueAsString(result)
//		final ObjectMapper mapper = new ObjectMapper();
//
//		try {
//			// Java objects to JSON string
//			final String jsonString = mapper.writeValueAsString(result);
//			log.info(jsonString);
//
//		} catch (final IOException e) {
//			e.printStackTrace();
//		}
		log.info("\nResult is...." + result.toString());
	}

	@Around("@annotation(ExecutionTime)")
	public Object computeExecutionTime(final ProceedingJoinPoint joinPoint) throws Throwable {

		final long start = System.currentTimeMillis();
		final Object proceed = joinPoint.proceed();
		final long executionTime = System.currentTimeMillis() - start;
		final String message = joinPoint.getSignature().getName() + " executed in " + executionTime + " ms";

		log.info(message + "\n");
		return proceed;
	}
}
