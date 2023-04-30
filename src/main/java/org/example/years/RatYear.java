package org.example.years;


import org.example.signs.*;

public class RatYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Rat();
    }
}
