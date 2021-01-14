package com.company;
import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;

public class MagicCalculator extends Calculator {
    //Square Root Function
    public static double squareRoot(double num1){
        return Math.sqrt(num1);
    }
    //Sin Function
    public static float sin(double factNum){
        return (float) Math.sin(factNum);
    }
    //Cosine Function
    public static float cosine(double factNum){
        return (float) Math.cos(factNum);
    }
    //Tangent Function
    public static float tangent(double factNum){
        return (float) Math.tan(factNum);
    }
    //Factorial Function
    public static BigInteger factMethod(int factNum){
        return BigIntegerMath.factorial(factNum);
    }
}
