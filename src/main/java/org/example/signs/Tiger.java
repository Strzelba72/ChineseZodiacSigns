package org.example.signs;

public class Tiger implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : brave, confident, competitive");
    }
}
