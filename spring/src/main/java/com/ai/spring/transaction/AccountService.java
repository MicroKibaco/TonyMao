package com.ai.spring.transaction;

/**
 * 转账案例的业务层接口
 */
public interface AccountService {

    public void transfer(String out,String in,Double money);

}
