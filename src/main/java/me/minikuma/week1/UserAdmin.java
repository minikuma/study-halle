package me.minikuma.week1;

import java.util.HashMap;

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
