package org.example.years;

import org.example.signs.ZodiacSign;
//abstract class represent year
public abstract class Year {
    //method to create new instance of animal from signs package based on interface ZodiacSign
    public abstract ZodiacSign createZodiacSign();
    //method to execute method describe from animals in package signs
    public void characteristic(){
        ZodiacSign z=createZodiacSign();
        z.describe();
    }
}
