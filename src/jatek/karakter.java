
package jatek;

import java.util.List;
import java.util.Random;

public class karakter {
    int HP;
    int DEX;
    int LUCK;
    List Items;
    public Random roll =new Random();

    public karakter(int HP, int DEX, int LUCK, List Items) {
        this.HP = HP;
        this.DEX = DEX;
        this.LUCK = LUCK;
        this.Items = Items;
    }

    public void setHP(int HP) {
        this.HP = HP = (roll.nextInt(6)+1)+(roll.nextInt(6)+1)+12;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX = (roll.nextInt(6)+1)+6;
    }

    public void setLUCK(int LUCK) {
        this.LUCK = LUCK=(roll.nextInt(6)+1)+6;
    }

    public void setItems(List Items) {
        this.Items = Items;
    }

    public void setRoll(Random roll) {
        this.roll = roll;
    }
    

}
