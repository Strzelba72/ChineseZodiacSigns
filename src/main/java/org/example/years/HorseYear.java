package org.example.years;

import org.example.signs.Horse;
import org.example.signs.ZodiacSign;

public class HorseYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Horse();
    }
}
