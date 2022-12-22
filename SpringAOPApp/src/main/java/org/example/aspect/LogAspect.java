package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class LogAspect {
    @Around("execution(* org.example.service..*(..))")
    public Object log (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long t1 = System.currentTimeMillis();
        System.out.println("From Logging Aspects.....Before "+ proceedingJoinPoint.getSignature());
        Object result = proceedingJoinPoint.proceed();
        System.out.println("From Logging Aspects.....Before "+ proceedingJoinPoint.getSignature());
        long t2 = System.currentTimeMillis();
        System.out.println("Duration :"+(t2-t1));
        return result;

    }

}