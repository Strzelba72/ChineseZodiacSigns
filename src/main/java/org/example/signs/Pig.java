package org.example.signs;

public class Pig implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : compassionate, generous, diligent");
    }
}
