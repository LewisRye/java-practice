package com.Lewis;
import java.util.*;
public class LoveCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Person 1: ");
        String Person1 = sc.nextLine();

        System.out.print("Person 2: ");
        String Person2 = sc.nextLine();

        System.out.println();

        int Minimum = 0;
        int Maximum = 100;
        int LovePercent = (int) (Minimum + Math.random() * (Maximum - Minimum));

        System.out.println(Person1 + " is only " + LovePercent + "% compatible with " + Person2);
    }
}
