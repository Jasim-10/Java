/*
import java.util.*;
public class doWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("hello "+ i);
            i++;
        }while(i<=10);
    }
    
}


*/


/*

import java.util.*;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}

*/


/*

import java.util.*;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;
        do {
            fact *= i;
            i++;
        }while(i<=n);
        System.out.println(fact);
    }
}

*/


/*

import java.util.*;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        int fact = 1;
        do {
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }while(n>0);
        System.out.println(rev);
    }
}

*/



