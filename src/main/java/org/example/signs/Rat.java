package org.example.signs;

import org.example.signs.ZodiacSign;

public class Rat implements ZodiacSign {
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : quick-witted, resourceful, versatile, kind");

    }
}
