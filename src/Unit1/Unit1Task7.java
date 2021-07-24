package Unit1;//(Дополнительно) В переменную записываете количество программистов. В
//зависимости от количества программистов необходимо вывести правильно
//окончание. Например:
//• 2 программиста
//• 1 программиста
//• 10 программистов
//• и т.д.


public class Unit1Task7 {
    public static void main(String[] args) {
        //int programmers = 0;

        for(int programmers = 0; programmers < 1000; programmers++) {

            if(programmers == 0){
                System.out.println("• " + programmers + " программистов");
            }
            else if (programmers > 1 && programmers < 5) {
                System.out.println("• " + programmers + " программиста");
            }
            else if(programmers >= 5 && programmers <= 20){
                System.out.println("• " + programmers + " программистов");
            }
            else if(programmers % 100 >= 11 && programmers % 100 <=14){
                System.out.println("• " + programmers + " программистов");
            }
            else if (programmers % 10 == 1) {
                System.out.println("• " + programmers + " программист");
            }
            else if (programmers % 10 >= 2 && programmers % 10 < 5) {
                System.out.println("• " + programmers + " программиста");
            }
            else
                System.out.println("• " + programmers + " программистов");
        }
    }
}
