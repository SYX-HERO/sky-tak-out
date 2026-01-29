package com.sky.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AutoFillAspect {
    @Pointcut("execution(* com.sky.mapper.*.*(..)) && @annotation(com.sky.annotation.AutoFill)")
    public void autoFillPointCut() {

    }
    @Before("autoFillPointCut()")
    public void autoFill(){
        log.info("开始进行公共字段自动填充");
        // TODO
        //获取当前被拦截的数据库类型

        //获取当前实体

        //准备被赋值的数据
    }
}
