package org.example.years;

import org.example.signs.Goat;
import org.example.signs.ZodiacSign;

public class GoatYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Goat();
    }
}
