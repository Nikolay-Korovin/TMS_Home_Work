package Unit11.Task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Unit11\\Task4\\car.dat"))) {
            Car car1 = new Car("BMW", 180, 15000);
            oos.writeObject(car1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Unit11\\Task4\\car.dat"))) {
            Car car2 = (Car) ois.readObject();
            System.out.println(car2.getBrand());
            System.out.println(car2.getPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
