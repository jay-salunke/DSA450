package Array;

import java.util.Scanner;


public class recursriveReverseArray {

    public static int [] reverseArray(int [] arr, int startIndex, int lastIndex){

         if(startIndex >= lastIndex){
             return arr;
         }

         int temp = arr[startIndex];
         arr[startIndex] = arr[lastIndex];
         arr[lastIndex] = temp;
         startIndex++;
         lastIndex--;
         return reverseArray(arr,startIndex,lastIndex);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the array size: ");
        size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i: recursriveReverseArray.reverseArray(arr,0,arr.length-1)){
            System.out.println(i);
        }

        sc.close();
    }
}
