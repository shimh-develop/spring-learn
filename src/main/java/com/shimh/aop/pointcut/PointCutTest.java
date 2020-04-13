package com.shimh.aop.pointcut;

import org.springframework.aop.Pointcut;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class PointCutTest {

    public static void main(String[] args ) {
        /**
         *Pointcut --> ClassFilter and MethodMatcher 哪个类的哪个方法
         *  StaticMethodMatcherPointcut 静态方法切点
         *      NameMatchMethodPointcut 字符串匹配方法签名
         *      AbstractRegexpMethodPointcut 正则表达式匹配
         *  DynamicMethodMatcherPointcut 动态方法切点
         *  AnnotationMatchingPointcut 实现类注解切点
         *  ExpressionPointcut 支持AspectJ切点表示式
         *  ControlFlowPointcut 实现类控制流程切点 一个方法是否由一个方法直接或间接调用
         *  ComposablePointcut 创建多个切点
         */

        Pointcut pointcut = null;



    }

}
