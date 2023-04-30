package org.example.years;

import org.example.signs.Dragon;
import org.example.signs.ZodiacSign;

public class DragonYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Dragon();
    }
}
