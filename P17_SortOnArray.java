import java.util.Scanner;
import java.util.Arrays;
public class P17_SortOnArray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the array length: ");
        int length=scan.nextInt();
        System.out.print("Enter the array elements: ");
        int[] array=new int[length];

        for(int i=0;i<length;i++){
            array[i]=scan.nextInt();
        }

        // === 1.Using Java Built in methods ===
        // Arrays.sort(array); 
        // System.out.println("Sorted array: " + Arrays.toString(array));

        // === 2.Using Bubble sort method ===
        // for(int i=0;i<length-1;i++){
        //     for(int j=0;j<length-1;j++){
        //         if(array[j]>array[j+1]){
        //             int temp=array[j];
        //             array[j]=array[j+1];
        //             array[j+1]=temp;
        //         }
        //     }
        // }
        // for(int r=0;r<length;r++){
        //     System.out.println(array[r]);
        // }
        scan.close();
    }
}
