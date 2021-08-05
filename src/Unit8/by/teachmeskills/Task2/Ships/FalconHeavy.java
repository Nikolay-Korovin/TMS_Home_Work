package Unit8.by.teachmeskills.Task2.Ships;

import java.util.Random;

public class FalconHeavy implements IStart {
    String name = "FalconHeavy";
    Random rd = new Random();
    int condition;
    boolean boosterOne = false;
    boolean boosterTwo = false;

    public String getName() {
        return name;
    }

    @Override
    public boolean systemCheck() {
        condition = rd.nextInt(21);
        if (condition > 1) {
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
        System.out.println("Waiting for boosters returning in 10 seconds! Look up to the sky!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boostersEntry();
        if (boosterOne && boosterTwo) {
            System.out.println("Both of boosters have successfully returned!!");
        } else if (boosterOne || boosterTwo) {
            System.out.println("One of the boosters have successfully returned!");
        } else {
            System.out.println("We'll do it next time =((");
        }

    }

    public void boostersEntry() {
        if (rd.nextInt(11) > 2) {
            boosterOne = true;
        } else if (rd.nextInt(11) > 2) {
            boosterTwo = true;
        }
    }
}
