package com.company;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.Scanner;

import static com.company.Calculator.*;
import static com.company.MagicCalculator.*;

public class Main {

    public static void main(String[] args) {
        calculator();
        //Set Up Scanner and Declare Variables
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        int factNum = 0;
        int selection;

        do {
            //Set Up Menu To Select Function
            System.out.println("-----Please Select A Function-----");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Square");
            System.out.println("6: Square Root ");
            System.out.println("7: Sin");
            System.out.println("8: Cosine");
            System.out.println("9: Tangent");
            System.out.println("10: Factorial");
            System.out.println("11: Quit Calculator");
            selection = input.nextInt();
            if (selection == 11) {
                //This Will Exit Out Of The Program
                System.out.println("Calculator Shutting Down. \nGoodbye.");
                break;
            }else if (selection == 5 || selection == 6) {
                //This Allows For Only One Number To Be Input
                System.out.println("Enter The Number:");
                num1 = input.nextDouble();
            }else if (selection > 6 && selection < 11){
                System.out.println("Enter The Number:");
                factNum = input.nextInt();
            }
            else {
                //This Allows For Two Numbers To Be Input
                System.out.println("Enter First Number:");
                num1 = input.nextDouble();
                System.out.println("Enter Second Number:");
                num2 = input.nextDouble();
            }
            //Output Result
            System.out.println("The total is: ");

            switch (selection) {
                case 1:
                    double result = add(num1, num2);
                    System.out.println(result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println(result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println(result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println(result);
                    break;
                case 5:
                    result = square(num1);
                    System.out.println(result);
                    break;
                case 6:
                    result = squareRoot(num1);
                    System.out.println(result);
                    break;
                case 7:
                    result = sin(factNum);
                    System.out.println(result);
                    break;
                case 8:
                    result = cosine(factNum);
                    System.out.println(result);
                    break;
                case 9:
                    result = tangent(factNum);
                    System.out.println(result);
                    break;
                case 10:
                    BigInteger factResult = factMethod(factNum);
                    System.out.println(factResult);
                    break;
                default:
                    System.out.println("Please Enter A Valid Selection.");
            }
        } while (true);
    }
}
