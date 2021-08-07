package Unit8.by.teachmeskills.Task1.Clothes.Puma;

import Unit8.by.teachmeskills.Task1.IClothes.IPants;

public class PumaPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("надевает штаны Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает штаны Adidas");
    }
}
