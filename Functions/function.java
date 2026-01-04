// public class function{
//     public static void printHello(){
//         System.out.println("Hello World! ");
//         System.out.println("Hello World! ");
//         System.out.println("Hello World! ");
//         System.out.println("Hello World! ");
//     }


//     public static void main(String[] args) {
//         printHello();
//     }
// }




// import java.util.*;
// public class function{

//     public static int calculateSum(int a, int b){           //parameters or formal parameter
//         int sum = a+b;
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of b: ");
//         int b = sc.nextInt();
//         int sum = calculateSum(a,b);                        //arguments or actual paramters
//         System.out.println("Sum of a and b: "+ sum);
//     }
// }










// import java.util.*;
// public class function{

//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b =temp;

//         System.out.println("after swap a is: "+ a);
//         System.out.println("after swap b is: "+ b);
//     }


//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         swap(a,b);

       

//     }
// }





// import java.util.*;
// public class function {
//     public static int multiply(int a, int b){
//         int product = a*b;
//         return product;
//     }
//     public static void main(String[] args) {
//         int a = 8;
//         int b = 9;
//         int result = multiply(a, b);
//         System.out.println(result);
//     }
// }




// public class function {
//     public static int factorial(int a){
//         int fact = 1;
//         for (int i=1;i<=a;i++){
//             fact *= i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         double result = factorial(100);
//         System.out.println(result);
//     }
// }








//binomial coefficient

// public class function{
//     public static int binomialCoefficient(int n, int r){
//         int factN = factorial(n);
//         int factR = factorial(r);
//         int factNR = factorial(n-r);

//         int binomial = factN / (factR * factNR);
//         return binomial;
        
//     }

//     public static int factorial(int n){
//         int fact = 1;
//         for (int i=1;i<=n;i++){
//             fact *= i;
//         }
//         return fact;
//     }


//     public static void main(String[] args) {
//         int result = binomialCoefficient(9,4);
//         System.out.println(result);
//     }
// }




//function overloading

// public class function{
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }


//     public static void main(String[] args) {
//         System.out.println(sum(3,5));
//         System.out.println(sum(3,5,7));
//     }
// }



// import java.util.*;
// public class function{
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number to check prime: ");
//         int n = sc.nextInt();
//         System.out.println(isPrime(n));
//     }
// }


//prime number in range
// import java.util.*;
// public class function {
//     public static int primeRange(int n) {
//         int count = 0;
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//                 count++;
//             }
//         }
//         return count;
//     }

//     static boolean isPrime(int n) {
//         if (n <= 1)
//             return false;

//         for (int i = 2; i*i<= n; i++) {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number for prime: ");
//         int n = sc.nextInt();
//         int count = primeRange(n);
//         System.out.println("\nTotal prime numbers = " + count);
//     }
// }





