package homework;

import homework.util.UserManager;
import homework.model.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserManager userManager = new UserManager(user);
        userManager.report();
        userManager.save();

    }
}