package me.minikuma.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/12/29
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
class UserServiceTest {

    @Test
    void user_service_test() {
        // given
        UserService userService = new UserService();

        // when
        userService.add("TEST");

        // then
        assertEquals(userService.findUser("TEST").getUserName(), "TEST");
    }
}