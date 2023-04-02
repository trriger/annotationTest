package com.example.annotationtest.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("@annotation(com.example.annotationtest.annotation.Mlog)")
    public void myPointCut(){}

    @Before("myPointCut()")
    public void beforeMlog(JoinPoint joinPoint){
        System.out.println("Name is "+joinPoint.getSignature().getName());
        System.out.println("DeclaringType Name is "+joinPoint.getSignature().getDeclaringType().getName());
        System.out.println("toLongStringis "+joinPoint.getSignature().toLongString());
        System.out.println("toShortString "+joinPoint.getSignature().toShortString());
        System.out.println("Modifiers is "+joinPoint.getSignature().getModifiers());
    }
}
