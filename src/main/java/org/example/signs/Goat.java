package org.example.signs;

public class Goat implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : calm, gentle, sympathetic");
    }
}
