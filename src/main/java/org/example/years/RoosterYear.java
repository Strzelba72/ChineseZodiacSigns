package org.example.years;

import org.example.signs.Rooster;
import org.example.signs.ZodiacSign;

public class RoosterYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Rooster();
    }
}
