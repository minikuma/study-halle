package me.minikuma.week1;

import java.util.HashMap;

/**
 * Created by wminikuma@gmail.com on 2020/12/29
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class UserAdmin {

    HashMap<String, User> userMap = new HashMap<>();

    public User addUser(String userName) {
        User user = new User(userName);
        User prevUser = userMap.put(userName, user);
        return prevUser;
    }

    public User getUserName(String userName) {
        return userMap.get(userName);
    }
}
