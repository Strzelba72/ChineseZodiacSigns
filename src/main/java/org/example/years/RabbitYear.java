package org.example.years;

import org.example.signs.Rabbit;
import org.example.signs.ZodiacSign;

public class RabbitYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Rabbit();
    }
}
