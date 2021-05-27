package com.company.collect.test.one;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/26 14:52
 * @Description:
 */
public class TestMain {


    public static void main(String[] args) {
        UserService service = new User();
        AbstractUser user = new User();
        System.out.println(user.getUserName(null));
        System.out.println(service.getUserName(null));


        System.out.println(service.setUserName("222"));
        System.out.println(user.setUserName("222"));
    }
}
