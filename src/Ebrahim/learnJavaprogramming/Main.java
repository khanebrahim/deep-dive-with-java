package Ebrahim.learnJavaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello java");
        int myValue = 8885;
        int myMaxValue =Integer.MAX_VALUE;
        int myMinValue =Integer.MIN_VALUE;
        System.out.println("Int myMaxValue = " + myMaxValue);
        System.out.println("Int myMinValue = " + myMinValue);
        System.out.println("myValue");
	//put a value larger or smaller then we get a result overflow and underflow
        System.out.println("Busted max value = " + (myMaxValue + 2));
	System.out.println("Busted Min Value =" + (myMinValue -1));

    }
}
