
//creating an array
// import java.util.*;
// public class ArrayBasic {
//     public static void main(String[] args) {
//         int marks[] = new int[50];            
//         int numbers[] = {1,2,4,22};
//         String fruits[]= {"apple","mango","banana"};
//     }
// }




// import java.util.*;
// public class ArrayBasic {
//     public static void main(String[] args) {
//         int marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter physics marks: ");
//         marks[0] = sc.nextInt();
//         System.out.print("Enter Chemistry marks: ");
//         marks[1] = sc.nextInt();
//         System.out.print("Enter Maths marks: ");
//         marks[2] = sc.nextInt();
//         System.out.print("Enter English marks: ");
//         marks[3] = sc.nextInt();
//         System.out.println("phy: "+marks[0]);
//         System.out.println("chem: "+marks[1]);
//         System.out.println("maths: "+marks[2]);
//         System.out.println("englis: "+marks[3]);
//         System.out.println(marks.length);
//     }
// }


// import java.util.*;
// public class ArrayBasic {
//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[] = {97,98,96};
//         update(marks);
//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+ " ");
//         }
//         System.out.println();
//     }
// }



//Linear Search
// import java.util.*;
// public class ArrayBasic{
//     public static int linearSearch(int num[],int key){
//         for(int i=0;i<num.length;i++){
//             if(num[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int num[] = {2,3,5,4,8,10,5,7};
//         int key = 20;
//         int index = linearSearch(num, key);
//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("Key is at index: "+index);
//         }
//     }
// }



// import java.util.*;
// public class ArrayBasic{
//     public static int linearSearch(String foodMenu[],String key){
//         for(int i=0;i<foodMenu.length;i++){
//             if(foodMenu[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         String foodMenu[] = {"dosa","idli","sambhar","vada","sweets","poha","samosa"};
//         String key = "idli";
//         int index = linearSearch(foodMenu, key);
//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("Key is at index: "+index);
//         }
//     }
// }






//largest number
// import java.util.*;
// public class ArrayBasic{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,2,4,3,5,9,6,4,5};
//         System.out.println("Largest Value is: " + getLargest(numbers));
//     }
// }



//Smallest number
// import java.util.*;
// public class ArrayBasic{
//     public static int getSmallest(int numbers[]){
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             if(smallest>numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {7,3,4,3,1,5,9,6,4,5};
//         System.out.println("Smallest Value is: " + getSmallest(numbers));
//     }
// }


