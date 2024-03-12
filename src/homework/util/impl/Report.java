package homework.util.impl;

import homework.util.Reporeble;
import homework.model.User;

public class Report implements Reporeble {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
