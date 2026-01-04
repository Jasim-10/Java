/*

import java.util.*;
public class breakContinue {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
    }
}


*/


/*

import java.util.*;
public class breakContinue {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}

*/


//keep entering the number till user enters a multiple of 10
/*

import java.util.*;
public class breakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
        System.out.print("out of the loop");
    }
}

*/


//display all number enter by user except multiples of 10
/*

import java.util.*;
public class breakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}

*/


//check number is prime or not
/*

import java.util.*;
public class breakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n +" is prime");
        }else{
            System.out.println(n + " is not prime");
        }
    }
}


*/