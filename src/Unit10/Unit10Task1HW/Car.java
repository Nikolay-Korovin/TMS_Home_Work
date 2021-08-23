package Unit10.Unit10Task1HW;

import java.util.Random;

public class Car {
    private String brand;
    int speed;
    double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startEngine() throws MyException {
        Random rd = new Random();
        int num = rd.nextInt(21);
        if(num % 2 == 0){
            throw new MyException("Мое исключение");
        }else{
            System.out.println("Автомобиль марки " + this.getBrand() + " завелся");
        }
    }
}
