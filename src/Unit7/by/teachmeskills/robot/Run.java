package Unit7.by.teachmeskills.robot;

import Unit7.by.teachmeskills.robot.hands.SamsungHand;
import Unit7.by.teachmeskills.robot.hands.SonyHand;
import Unit7.by.teachmeskills.robot.hands.ToshibaHand;
import Unit7.by.teachmeskills.robot.heads.SamsungHead;
import Unit7.by.teachmeskills.robot.heads.SonyHead;
import Unit7.by.teachmeskills.robot.heads.ToshibaHead;
import Unit7.by.teachmeskills.robot.legs.SamsungLeg;
import Unit7.by.teachmeskills.robot.legs.SonyLeg;
import Unit7.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Run run = new Run();
        Robot robot1 = new Robot(new SonyHead(100), new ToshibaHand(20), new SamsungLeg(100));
        Robot robot2 = new Robot(new SamsungHead(200), new SonyHand(25), new ToshibaLeg(40));
        Robot robot3 = new Robot(new ToshibaHead(80), new SamsungHand(50), new SonyLeg(50));
        robot1.action();
        robot2.action();
        robot3.action();
        run.mostExpensiveRobot(robot1, robot2, robot3);
    }

    public void mostExpensiveRobot(Robot... robots) {
        int minPrice = 0;
        Robot expensiveRobot = null;
        for (int i = 0; i < robots.length; i++) {
            if (robots[i].getPrice() > minPrice) {
                minPrice = robots[i].getPrice();
                expensiveRobot = robots[i];
            }
        }
        System.out.println("Самый дорогой робот стоит " + minPrice + " руб.");
        System.out.println("голова от " + expensiveRobot.getHead().getBrand() + " стоимостью " + expensiveRobot.getHead().getPrice() + " руб.");
        System.out.println("ноги от " + expensiveRobot.getLeg().getBrand() + " стоимостью " + expensiveRobot.getLeg().getPrice() + " руб.");
        System.out.println("руки от " + expensiveRobot.getHand().getBrand() + " стоимостью " + expensiveRobot.getHand().getPrice() + " руб.");
    }
}
