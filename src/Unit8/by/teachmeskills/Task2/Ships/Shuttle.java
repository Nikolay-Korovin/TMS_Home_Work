package Unit8.by.teachmeskills.Task2.Ships;

import java.util.Random;

public class Shuttle implements IStart {
    String name = "Shuttle";
    Random rd = new Random();
    int condition;

    public String getName() {
        return name;
    }

    @Override
    public boolean systemCheck() {
        condition = rd.nextInt(11);
        if (condition > 3) {
            System.out.println("The system check was successful!");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineLaunch() {
        System.out.println(this.getName() + " engines is on, all systems are functioning normally");
    }

    @Override
    public void start() {
        System.out.println(this.getName() + " starts!!");
    }
}
