package com.duel.infrastructure.log.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserOperateLogAspect {

    @Pointcut("@annotation(com.duel.infrastructure.log.model.annotation.LogUserOperate)")
    public void UserOperateLog(){
    }

    @After("UserOperateLog()")
    public void before(JoinPoint point) throws Throwable{
        //System.out.println(11);
        //System.out.println("11".substring(8, 9));
    }

}
