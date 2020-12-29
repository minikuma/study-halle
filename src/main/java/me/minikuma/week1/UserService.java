package me.minikuma.week1;

/**
 * Created by wminikuma@gmail.com on 2020/12/29
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class UserService {

    private UserAdmin admin;

    public UserService() {
        admin = new UserAdmin();
    }

    public void add(String userName) {
        admin.addUser(userName);
    }

    public User findUser(String userName) {
        return admin.getUserName(userName);
    }
}
