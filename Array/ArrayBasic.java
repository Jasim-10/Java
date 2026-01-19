
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




//Binary Search
// import java.util.*;
// public class ArrayBasic{
//     public static int binarySearch(int numbers[],int keys){
//         int start = 0;
//         int end = numbers.length-1;
//         while(start<=end){
//             int mid = (start + end)/2;
//             if(numbers[mid]==keys){
//                 return mid;
//             }
//             if(numbers[mid]<keys){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,3,4,5,7,9,11,12,13,14,15,17,19};
//         int keys = 12;
//         System.out.println(binarySearch(numbers,keys));
//     }
// }




//Reverse an array
// import java.util.*;
// public class ArrayBasic{
//     public static void reverse(int number[]){
//         int first = 0, last=number.length-1;
//         while(first<last){
//             int temp = number[last];
//             number[last] = number[first];
//             number[first] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//         int number[]={2,3,4,5,6,7,9,1,0,8};
//         reverse(number);
//         for(int i=0;i<number.length;i++){
//             System.out.print(number[i]+" ");
//         }
//     }
// }




//Pairs in an array
// import java.util.*;
// public class ArrayBasic{
//     public static void printPairs(int numbers[]){
//         int tp = 0;
//         for(int i=0;i<numbers.length;i++){
//             int current = numbers[i];
//             for(int j=i+1;j<numbers.length;j++){
//                 System.out.print("("+current + ","+ numbers[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs: "+tp);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,2,8,3,5};
//         printPairs(numbers);
//     }
// }




//Print subarray
import java.util.*;
public class ArrayBasic{
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(+numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarray: "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}