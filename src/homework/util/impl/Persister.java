package homework.util.impl;

import homework.util.Persistereble;
import homework.model.User;

public class Persister implements Persistereble {

    @Override

    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
