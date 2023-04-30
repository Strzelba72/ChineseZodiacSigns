package org.example.years;

import org.example.signs.Tiger;
import org.example.signs.ZodiacSign;

public class TigerYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Tiger();
    }
}
