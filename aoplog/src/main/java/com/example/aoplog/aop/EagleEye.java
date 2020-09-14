package com.example.aoplog.aop;

import java.lang.annotation.*;

/**
 * @Author lijun
 * @Description
 * @Date 2020-05-26 5:24 下午
 **/


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface EagleEye {

    /**
     * 接口描述
     * @return
     */
    String desc() default "";


}
