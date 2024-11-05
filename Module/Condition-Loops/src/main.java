import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //? Area Of Circle Java Program
        System.out.println("Enter circle radius here: ");
        double radius = input.nextDouble();
        System.out.println("Area of Circle is = " + (float)(Math.PI * Math.pow(radius, 2)));


        //? Area Of Triangle
        System.out.print("Enter base here: ");
        int base = input.nextInt();
        System.out.print("Enter height here:");
        int height = input.nextInt();
        System.out.print("Area of Triangle is: " + (.5 * base * height));


        //? Area Of Rectangle Program [Area=length×width]
        System.out.print("Enter height: ");
        float height1 = input.nextFloat();
        System.out.print("Enter width: ");
        float width = input.nextFloat();
        System.out.println("Area Of Rectangle: " + Math.ceil((int)(height1 * width)));


        //? Area Of Parallelogram
        int digit = 234;
        int productOfDigit = 1;
        int sumOfDigit = 0;

        while(digit > 0){
            int lastDigit = digit % 10;
            productOfDigit *= lastDigit;
            sumOfDigit += lastDigit;
            digit = digit / 10;
        }
        System.out.println(productOfDigit - sumOfDigit); 

        //? Take integer inputs till the user enters 0 and print the sum of all numbers
        int i = 0;
        int sum = 0;
        do{
            sum += i;
            System.out.println(sum);
            System.out.println("number: ");
            int number = input.nextInt();
            i = number;
        }while(i != 0);

        //?Take integer inputs till the user enters 0 and print the largest number from all.
        int biggestNumber = 0;
        int initial = 0;
        do{
            System.out.println(initial > biggestNumber ? initial : biggestNumber);
            System.out.println("number: ");
            int number = input.nextInt();
            biggestNumber = initial > biggestNumber ? initial : biggestNumber;
            initial = number;
        }while(initial != 0);

    }
}
