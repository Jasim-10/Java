/*

import java.util.*;

public class forLoop{
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}

*/


/*

import java.util.*;

public class forLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(i+ " ");
        }
    }
}

*/


/*
import java.util.*;

public class forLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

*/



/*

import java.util.*;
public class forLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}

*/






// print * pattern 4*4 square pattern

/*
import java.util.*;
public class forLoop{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            System.out.println("****");
        }
    }
}


*/



//Print reverse of a number

/*
import java.util.*;
public class forLoop{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = sc.nextInt();
       for(; num>0;num=num/10){
        int lastDigit = num%10;
        System.out.print(lastDigit);
       }
    }
}


*/



//Print reverse of a number also store the reverse

import java.util.*;
public class forLoop{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = sc.nextInt();
       int rev = 0;
       for(; num>0;num=num/10){
        int lastDigit = num%10;
        rev = (rev * 10) + lastDigit;
       }
       System.out.print(rev);
    }
}