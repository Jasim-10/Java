/*

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        int i = 0;
        while(i<100){
            System.out.println("Hello World! "+i);
            i++;
        }
    }
}


*/


/*

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}

*/


/*

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<n){
            System.out.println(i);
            i++;
        }
    }
}


*/




/*

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(number + "*" + i + "=" + number*i);
            i++;
        }
    }
}

*/




/*

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("Sum is: "+sum);
    }
}


*/



/*

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        int i=1;
        while(i<=n){
            fact *=i;
            i++;
        }
        System.out.println("Factorial of: "+ n +" is " +fact);
    }
}


*/




//print reverse of number

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
           int lastDigit = n%10;
           System.out.print(lastDigit);
           n/=10;
        }
    }
}
