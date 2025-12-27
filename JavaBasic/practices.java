/*

import java.util.*;
public class practices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();

        int average = (a+b+c)/3;
        System.out.println("Average = "+ average);
    }
}


*/


/*

import java.util.*;
public class practices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.print("Area of square is :"+ area);
    }
}

*/


import java.util.*;
public class practices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();

        float sum = pencil+pen+eraser;
        float total = sum + (0.18f*sum);
        

        System.out.print("total cost with 18% gst is :"+ total);
    }
}