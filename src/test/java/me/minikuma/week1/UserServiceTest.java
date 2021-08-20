package me.minikuma.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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