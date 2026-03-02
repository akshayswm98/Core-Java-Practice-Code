package akshay.gettersetter;

import java.util.Scanner;

class Product 
{
    private double price;

    public Product(double price) 
    {
        this.price = price;
    }

    public double getPrice() 
    {
        return this.price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    @Override
    public String toString() 
    {
        return "Product [price = " + price + "]";
    }
}


public class ProductDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product price: ");
        double price = sc.nextDouble();

        Product p1 = new Product(price);
        System.out.println(p1);

        System.out.print("Enter the updated product price: ");
        double newPrice = sc.nextDouble();

        p1.setPrice(newPrice);
        System.out.println(p1);

        sc.close();
    }
}