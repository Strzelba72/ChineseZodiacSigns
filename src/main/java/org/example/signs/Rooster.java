package org.example.signs;

public class Rooster implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : observant, hardworking, courageous");
    }
}
