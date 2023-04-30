package org.example.years;

import org.example.signs.Pig;
import org.example.signs.ZodiacSign;

public class PigYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Pig();
    }
}
