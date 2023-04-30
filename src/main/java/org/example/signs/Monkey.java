package org.example.signs;

public class Monkey implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : sharp, smart, curiosity");
    }
}
