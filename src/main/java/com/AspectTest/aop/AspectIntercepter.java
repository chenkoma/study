package com.AspectTest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author koma 20:27 2019-09-19
 * @desc
 */
@Aspect // 申请切面
@Component
public class AspectIntercepter {
    @Pointcut(value = "execution(* com.AspectTest.service.personServerImpl.*(..))")
    private void pointCut() {
        // 定义一个切入点 后面的通知直接引入切入点方法pointCut即可 personServerImpl下面的所有方法
    }

    // 环绕通知(连接到切入点开始执行 下一步进入前置通知 在下一步才执行操作方法)
    @Around(value = "pointCut()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("@Around进入环绕通知..");
        Object object = pjp.proceed();
        System.out.println(pjp.getThis() + " 操作结束，退出方法;环绕[@Around]结束!...");
        return object;
    }

    // 前置通知(出错时执行)
    @Before(value = "pointCut()")
    public void doAccessCheck(JoinPoint joinPoint) {
        System.out.println("@Before前置通知:" + Arrays.toString(joinPoint.getArgs()));
    }

    // 异常通知(出错时执行)
    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void doAfterThrow(JoinPoint joinPoint, Throwable ex) {
        System.out.println("@AfterThrowing例外通知(异常通知)" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@AfterThrowing异常信息:" + ex);
    }

    // 后置通知(返回前执行)
    @After(value = "pointCut()")
    public void after() {
        System.out.println("@After后置通知...");
    }

    // 最终通知(正常返回通知 最后执行)
    @AfterReturning(value = "pointCut()")
    public void doAfter() {
        System.out.println("@AfterReturning最终通知");
    }

}