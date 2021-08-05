package Unit8.by.teachmeskills.Task1.Clothes.Adidas;

import Unit8.by.teachmeskills.Task1.IClothes.IJacket;

public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("надевает куртку Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает куртку Adidas");
    }
}
