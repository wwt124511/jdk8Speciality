package com.wwt;

/**
 * @author : wangwentao
 * @Description: TODO
 * @date Date : 2019年04月03日 18:08
 */
public class UserStrategyName implements UserStrategy {
    @Override
    public boolean strategy(User u) {
        return u.getName().startsWith("王");
    }
}
