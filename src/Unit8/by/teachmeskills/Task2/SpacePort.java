package Unit8.by.teachmeskills.Task2;

import Unit8.by.teachmeskills.Task2.Ships.FalconHeavy;
import Unit8.by.teachmeskills.Task2.Ships.IStart;
import Unit8.by.teachmeskills.Task2.Ships.Shuttle;

public class SpacePort {
    void launch(IStart ship) {
        if (!ship.systemCheck()) {
            System.out.println("pre-launch check failed");
        } else {
            ship.engineLaunch();
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ship.start();
        }
    }

    public static void main(String[] args) {
        SpacePort spacePort = new SpacePort();
        spacePort.launch(new Shuttle());
        spacePort.launch(new FalconHeavy());
    }
}
