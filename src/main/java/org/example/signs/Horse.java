package org.example.signs;

public class Horse implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : animated, active, energetic");
    }
}
