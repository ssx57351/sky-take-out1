package com.sky.annotation;


import com.sky.enumeration.OperationType;

import java.lang.annotation.*;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoFill {
    OperationType value();
}
