package org.example.signs;

import org.example.signs.ZodiacSign;

public class Ox implements ZodiacSign {
    @Override
    public void describe() {
        System.out.println("Zodiac Sign : "+this.getClass().getSimpleName());
        System.out.println("Personality Traits : diligent, dependable, strong, determined");
    }
}
