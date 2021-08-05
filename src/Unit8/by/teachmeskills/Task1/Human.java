package Unit8.by.teachmeskills.Task1;

import Unit8.by.teachmeskills.Task1.IClothes.IClothes;
import Unit8.by.teachmeskills.Task1.IClothes.IBoots;
import Unit8.by.teachmeskills.Task1.IClothes.IJacket;
import Unit8.by.teachmeskills.Task1.IClothes.IPants;

public class Human {
    final private String name;
    private IJacket jacket;
    private IPants pants;
    private IBoots boots;
    final private IClothes[] clothes;
    private boolean isDressed;

    public String getName() {
        return name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public IBoots getBoots() {
        return boots;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public void setBoots(IBoots boots) {
        this.boots = boots;
    }

    public Human(String name) {
        this.name = name;
        this.isDressed = false;
        clothes = new IClothes[3];
    }

    public Human(String name, IJacket jacket, IPants pants, IBoots boots) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.boots = boots;
        this.isDressed = false;
        clothes = new IClothes[]{this.jacket, this.pants, this.boots};
    }

    //Надевает все доступные вещи, если уже одет то сообщает об этом. Если уже одет но поменяли любую вещь, то
    //снова надевается, но с учётом новых вещей.
    public void putOnAllClothes() {
        if (isDressed) {
            if (isSomethingChanged()) {
                for (int i = 0; i < clothes.length; i++) {
                    if (thereIsNoClothes(i)) continue;
                    clothes[i].putOn();
                }
                return;
            }
            System.out.println(getName() + " уже одет/а");
            return;
        }

        for (int i = 0; i < clothes.length; i++) {
            if (thereIsNoClothes(i)) continue;
            clothes[i].putOn();
        }
        isDressed = true;
    }

    public void takeOffAllClothes() {
        if (!isDressed) {
            System.out.println("Я уже раздет");
            return;
        }

        for (int i = 0; i < clothes.length; i++) {
            if (thereIsNoClothes(i)) continue;
            clothes[i].takeOff();
        }
        isDressed = false;
    }

    private boolean thereIsNoClothes(int i) {
        if (clothes[i] == null) {
            if (i == 0) {
                System.out.println("куртки у человека нет");
            } else if (i == 1) {
                System.out.println("штанов у человека нет");
            } else {
                System.out.println("ботинок у человека нет");
            }
            return true;
        }
        System.out.print(getName() + " ");
        return false;
    }

    private boolean isSomethingChanged() {
        if (clothes[0] != getJacket()) {
            clothes[0] = jacket;
            return true;
        } else if (clothes[1] != getPants()) {
            clothes[1] = pants;
            return true;
        } else if (clothes[2] != getBoots()) {
            clothes[2] = boots;
            return true;
        }
        return false;
    }
}

