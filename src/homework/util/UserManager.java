package homework.util;

import homework.model.User;
import homework.util.impl.Persister;
import homework.util.impl.Report;

public class UserManager {
    private User user;
    private Reporeble report;
    private Persistereble persistereble;

    public UserManager(User user) {
        this.user = user;
        this.report = new Report();
        this.persistereble = new Persister();
    }

    public void report(){
        report.report(this.user);
    }

    public void save() {
        persistereble.save(this.user);
    }




}
