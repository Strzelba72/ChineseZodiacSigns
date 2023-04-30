package org.example.years;

import org.example.signs.Monkey;
import org.example.signs.ZodiacSign;

public class MonkeyYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Monkey();
    }
}
