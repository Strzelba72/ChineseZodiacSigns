package org.example.years;

import org.example.signs.Dog;
import org.example.signs.ZodiacSign;

public class DogYear extends Year{
    @Override
    public ZodiacSign createZodiacSign() {
        return new Dog();
    }
}
