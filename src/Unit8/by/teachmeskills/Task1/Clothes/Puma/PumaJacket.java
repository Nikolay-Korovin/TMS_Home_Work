package Unit8.by.teachmeskills.Task1.Clothes.Puma;

import Unit8.by.teachmeskills.Task1.IClothes.IJacket;

public class PumaJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("надевает куртку Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает куртку Puma");
    }
}
