package se.lexicon;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        for (Dice dice:Dice.values()){
            System.out.println("Rolling "+dice+" dice value "+dice.roll());
        }
    }
}