package Unit8.by.teachmeskills.Task1.Clothes.Puma;

import Unit8.by.teachmeskills.Task1.IClothes.IBoots;

public class PumaBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("надевает ботинки Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает ботинки Puma");
    }
}
