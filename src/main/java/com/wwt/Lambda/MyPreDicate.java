package com.wwt.Lambda;

@FunctionalInterface    //函数式接口的特有注解，可以检查是否是函数式接口
public interface MyPreDicate<T> {

    public boolean test(T t);
}
