package com.company.collect.test.one;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/26 14:48
 * @Description:
 */
public abstract class AbstractUser implements UserService {


    public abstract String getUserName(String idCard);


    abstract Integer getUserAge();


    @Override
    public String setUserName(String userName) {
        return getUserName(userName);
    }
}
