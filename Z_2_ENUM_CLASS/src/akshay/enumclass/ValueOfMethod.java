package akshay.enumclass;

import java.util.Scanner;

public class ValueOfMethod 
{
    enum Color
    {
        BLACK,
        RED,
        BLUE,
        GREEN
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Favorite Colour :- ");
        
        String co = sc.next().toUpperCase();
        
        try 
        {
            Color color = Color.valueOf(co); // Correct method
            System.out.println("Color Name Is :- " + color);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Invalid Color! Please enter a valid enum constant.");
        }
        
        sc.close();
    }
}