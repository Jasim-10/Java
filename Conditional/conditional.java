/*
//if statement

public class conditional{
    public static void main(String[] args){
        int age = 20;
        if(age>=18){
            System.out.println("Eligible for vote");
        }
    }
}
*/



/* 
//if-else statement

public class conditional{
    public static void main(String[] args){
        int age = 16;
        if(age>=18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not Eligible for vote");
        }
    }
}

*/



//largest of two 
/*
import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater");
        }else{
            System.out.println(num2 + " is greater");
        }
    }
}
*/




/*

//odd even
import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}


*/






//else-if
/*

import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("Grade: A");
        }else if(marks >= 70 && marks <= 89){
            System.out.println("Grade: B");
        }else if(marks >= 50 && marks <= 69){
            System.out.println("Grade: C");
        }else if(marks >= 33 && marks <= 49){
            System.out.println("Grade: Pass");
        }else if(marks>= 00 && marks<=32){
            System.out.println("Grade: fail");
        }else {
            System.out.println("Inavlid number");
        }
    }
}


*/



/*

import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        if(income < 500000){
            System.out.println("Your tax is 0");
        }else if(income>=500000 && income<1000000){
            float tax = income * (0.2f);
            System.out.println("Your tax is: "+ tax);
        }else{
            float tax = income * (0.3f);
            System.out.println("Your tax is: "+tax);
        }
    }
}

*/



/*

import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if((num1>=num2) && (num1>=num3)){
            System.out.println(num1 + " is greater");
        }else if(num2>=num3){
            System.out.println(num2 +" is greatest");
        }else{
            System.out.println(num3 +" is greatest");
        }
    }
}

*/




//Ternary Operator
/*

public class conditional{
    public static void main(String[] args) {
        int a=16; 
        int b=17;
        int max = (a>b)?a:b;
        System.out.println("greatest number is: " +max);
    }
}

*/



/*
public class conditional{
    public static void main(String[] args) {
        int number=11;
        String result = ((number%2)==0)?"even":"odd";
        System.out.println(result);
    }
}
*/


/*

public class conditional{
    public static void main(String[] args) {
        int marks=32;
        String result = (marks>=33)?"pass":"fail";
        System.out.println(result);
    }
}

*/



/*

import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the case from 1 to 7: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}


*/




import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);


        switch(operator){
            case '+': 
                System.out.println(a+b);
                break;
            case '-': 
                System.out.println(a-b);
                break;
            case '*': 
                System.out.println(a*b);
                break;
            case '/': 
                System.out.println(a/b);
                break;
            case '%': 
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}