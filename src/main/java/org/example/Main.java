package org.example;

import org.example.years.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Year y = null;

        int year=inputFunction();
        //use modulo to create year of animal
        switch (year%12) {
            case 0: {
                y=new MonkeyYear();
                break;
            }
            case 1: {
                y=new RoosterYear();
                break;
            }
            case 2: {
                y=new DogYear();
                break;
            }
            case 3: {
                y=new PigYear();
                break;
            }
            case 4: {
                y=new RatYear();
                break;
            }
            case 5: {
                y=new OxYear();
                break;
            }
            case 6: {
                y=new TigerYear();
                break;
            }
            case 7: {
                y=new RabbitYear();
                break;
            }
            case 8: {
                y=new DragonYear();
                break;
            }
            case 9: {
                y=new SnakeYear();
                break;
            }
            case 10: {
                y=new HorseYear();
                break;
            }
            case 11: {
                y=new GoatYear();
                break;
            }
            default:
            {
                System.out.println("Incorrect input");
            }
        }
        if(y!=null)
        {
            y.characteristic();
            displayRecentYears(year);
        }



    }
    //input method
    public static int inputFunction()
    {
        System.out.println("Enter the year :");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
    //method to display years with the same animal
    public static void displayRecentYears(int year)
    {
        int start=2028;
        start+=(year%12);
        String output="";
        for(int i=0;i<8;i++)
        {
            output=start+", "+output;
            start-=12;
        }
        System.out.println("Recent Years :");
        System.out.println(output.subSequence(0,output.length()-2));

    }
}