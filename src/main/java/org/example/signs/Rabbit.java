package org.example.signs;

public class Rabbit implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : quiet, elegant, kind, responsible");
    }
}
