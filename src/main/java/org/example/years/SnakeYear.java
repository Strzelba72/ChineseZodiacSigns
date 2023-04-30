package org.example.years;

import org.example.signs.Snake;
import org.example.signs.ZodiacSign;

public class SnakeYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Snake();
    }
}
