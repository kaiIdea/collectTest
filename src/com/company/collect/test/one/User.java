package com.company.collect.test.one;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/26 14:51
 * @Description:
 */
public class User extends AbstractUser implements UserService{

    @Override
    public String getUserName(String idCard) {
        return "11111";
    }

    @Override
    Integer getUserAge() {
        return null;
    }

}
