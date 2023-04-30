package org.example.years;

import org.example.signs.Ox;
import org.example.signs.ZodiacSign;

public class OxYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Ox();
    }
}
