package org.example.signs;

public class Dog implements ZodiacSign{
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : lovely, honest, prudent\n");
    }
}
