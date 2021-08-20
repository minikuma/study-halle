package me.minikuma.week1;

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
