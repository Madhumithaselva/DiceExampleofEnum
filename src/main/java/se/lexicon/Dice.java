package se.lexicon;
import java.util.Random;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private final int maxValue;

    Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    public int roll(){
        Random random=new Random();
        return random.nextInt(maxValue)+1;
    }
}
