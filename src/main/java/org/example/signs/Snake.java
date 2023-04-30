package org.example.signs;

public class Snake implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : enigmatic, intelligent, wise");
    }
}
