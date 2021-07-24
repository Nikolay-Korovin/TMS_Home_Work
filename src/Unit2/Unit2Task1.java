package Unit2;//1)Начав тренировки, спортсмен в первый день пробежал 10 км.
//Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. 
//Какой суммарный путь пробежит спортсмен за 7 дней? 


public class Unit2Task1 {
    public static void main(String[] args) {
        double range = 10;
        double finalRange = range;
        double modifier = 1.1;

        for(int i = 0; i < 6; i++){
            finalRange += range * modifier;
            range *= modifier;
        }

        System.out.println("Суммарный путь за 7 дней = " + finalRange + " км.");

    }
}
