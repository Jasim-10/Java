
// 1.Square Pattern
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int b = sc.nextInt();
//         pattern1(a,b);
//     }
//     static void pattern1(int row, int col){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=col;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }






//2.Right half pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern2(a);
//     }
//     static void pattern2(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }






//3. Left half pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern3(a);
//     }
//     static void pattern3(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//4.Pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern4(a);
//     }
//     static void pattern4(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



//5.Reverse half right pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern5(a);
//     }
//     static void pattern5(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//6.Reverse left half pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern6(a);
//     }
//     static void pattern6(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=row;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//7.Rhombus Pattern
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         System.out.print("Enter number of rows: ");
//         int b = sc.nextInt();
//         pattern7(a,b);
//     }
//     static void pattern7(int row, int col){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=col;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//8.Reverse Pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern8(a);
//     }
//     static void pattern8(int row){
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=row;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    // }
// }



//9.Diamond
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern9(a);
//     }
//     static void pattern9(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=2;i<=row;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=row;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



        


//10.Print hour glass
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern10(a);
//     }
//     static void pattern10(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=row;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=2;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }





//11.left Pascal Triangle
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern11(a);
//     }
//     static void pattern11(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=2;i<=row;i++){
//             for(int j=row;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//12.RightPascalTriangle
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern12(a);
//     }
//     static void pattern12(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i=row-1;i>=1;i--) {
//             for(int j=row-i;j>0;j--){
//                 System.err.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//13 k-pattern
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern13(a);
//     }
//     static void pattern13(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=2;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// 14.Double hill
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern14(a);
//     }
//     static void pattern14(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1; j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=row-1;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(j==row){
//                     System.out.print("");
//                 }else{
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//15.Hallow Square
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int b = sc.nextInt();
//         pattern15(a,b);
//     }
//     static void pattern15(int row,int col){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=col;j++){
//                 if(i==1 || j==1 || i==row || j==col){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//16.full pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern16(a);
//     }
//     static void pattern16(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// 17.Hallow Pyramid
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern17(a);
//     }
//     static void pattern17(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 if(i==1 || j==1 || i==row || j==(2*i)-1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// 18.Reverse hallow pyramid 
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern18(a);
//     }
//     static void pattern18(int row){
        // for(int i=row;i>=1;i--){
        //     for(int j=row-1;j>=i;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=(2*i)-1;j++){
        //         if(i==1 || j==1 || i==row || j==(2*i)-1){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
//     }
// }



// 19.Hallow Diamond
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int a = sc.nextInt();
//         pattern17(a);
//     }
//     static void pattern17(int row){
//         for(int i=1;i<=row;i++){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 if(i==1 || j==1  || j==(2*i)-1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=row-1;i>=1;i--){
//             for(int j=row-1;j>=i;j--){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 if(i==1 || j==1  || j==(2*i)-1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
