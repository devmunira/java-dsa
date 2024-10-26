import java.util.ArrayList;
import java.util.Scanner;

public class CourseAssignment {

    private boolean isAgree(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(args[0] + "! " + args[1]);
        char in = input.next().charAt(0);
        return in == 'Y' ? true : false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CourseAssignment ca = new CourseAssignment();

        // Take a name as input and print a greeting message for that particular name.
        System.out.print("Hello! Good day, What's your name ");
        String name = input.next();
        System.out.println("Nice to meet you, " + name);

        // Write a program to print whether a number is even or odd, taking input from the user.
        System.out.print("Enter a number to find is it Odd or Even " + name + ": ");
        int number = input.nextInt();
        System.out.println(number + " number you enter is: " + (number % 2 == 0 ? "even" : "odd"));


        // Write a program to input principal, time, and rate (P, T, R) from the user and calculate the Simple Interest using the formula `SI = (P * T * R) / 100`.
        System.out.println("Let's find out simple interest amount of your current savings " + name);
        System.out.print("Enter initial sum of money: ");
        long p = input.nextLong();
        System.out.print("Enter year of savings you want: ");
        int t = input.nextInt();
        System.out.print("Enter interest percentage: ");
        float r = input.nextFloat();
        float interest = (p*t*r) / 100; 
        System.out.println(name + "! After " + t + " year your total amount will be " + (long)(interest + p) + " and interest will be " + (int)(interest));

        // Take two numbers and an operator (`+`, `-`, `*`, `/`) as input, and calculate the result using `if` conditions.
        System.out.println(name + " You can justify our interest result by using our program calculator \n Do you want to calculate? Enter Y for yes or N for trust us. [You can enter two number only for operate]");
        char isAgree = input.next().charAt(0);
        if(isAgree == 'Y'){
            // operate calculation
            System.out.print("Enter first number: ");
            long a = input.nextLong();
            System.out.print("Enter second number: ");
            int b = input.nextInt();
            System.out.print("Enter operator (+, -, *, /): ");
            char i = input.next().charAt(0);

            long result = 0;

            switch (i) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return; 
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    return; 
        }

        System.out.println(a + " " + i + " " + b + " = " + result);
        }else if(isAgree == 'N'){
            System.out.println("Thanks for trusting us! " + name);
        }else{
            System.err.println("Invalid Inputs! Input should be either \"Y\" or \"N\" you enter " + isAgree + " which is invalid");
        }

        // Input two numbers and print the largest one.
        if(ca.isAgree(new String[]{name, "Do you want to find the largest of two numbers? Enter Y for yes or N for No."})){
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int largest = (num1 > num2) ? num1 : num2;
            System.out.println("The largest number between " + num1 + " and " + num2 + " is: " + (num1 == num2 ? "Equal" : largest));
        }

        // Take an amount in INR as input and convert it to USD using a fixed conversion rate.
        if(ca.isAgree(new String[]{name, "Do you want your INR rupee to USD Dollar? Enter Y for yes or N for No."})){
            // current rate should be fetch from api, But for now we use a static value.
            System.out.print("Enter INR rupee amount: ");
            int inr = input.nextInt();
            float rate = 100.10f;
            System.out.println(inr + " INR =" + (inr * rate) + " USD");
            
        }

        // Write a program to calculate and print the Fibonacci series up to `n` numbers, where `n` is provided by the user.
        if(ca.isAgree(new String[]{name, "Do you want print Fibonacci series up to n? Enter Y for yes or N for No."})){
            System.out.print("Enter N value: ");
            int n = input.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            array.add(0);
            array.add(1);
            int i = 2;
            while (i <= n) {
                int add = array.get(i - 1) + array.get(i - 2);
                array.add(add);
                i++;
            }
            System.out.println(array);
        }

        // Determine whether a given string is a palindrome (reads the same backward and forward).
        if(ca.isAgree(new String[]{name, "Do you want check your string is a palindrome? Enter Y for yes or N for No."})){
            System.out.print("Enter string here: ");
            String val = input.next();
            boolean result = true;
            for (int i = 0; i < val.length() / 2; i++) {
                if(val.charAt(i) != val.charAt(val.length() - 1 - i)){
                    result = false;
                    break;
                }
            }
            System.out.println(result);
        }

        //  Write a program to find Armstrong numbers between two given numbers.
        if(ca.isAgree(new String[]{"Munira", "Do you want find Armstrong numbers between two given numbers? Enter Y for yes or N for No."})){
            System.out.print("Enter number one here: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            ArrayList<Integer> result  = new ArrayList<>();
            for (int i = num1; i <= num2; i++) {
                int digit = String.valueOf(i).length();
                int count = 0;

                for (int j = 0; j < digit; j++) {
                    count += Math.pow(Character.getNumericValue((String.valueOf(i).charAt(j))) , digit);
                }
                if(count == i){
                    result.add(i);
                }
            }
            System.out.println(result);
        }

    }
}
