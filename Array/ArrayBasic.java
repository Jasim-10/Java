
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



public class ArrayBasic {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97,98,96};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}