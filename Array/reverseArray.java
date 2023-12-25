package Array;

import java.util.Scanner;

public class reverseArray {


    public static int[] revArray(int [] arr){
        int startIndex = 0;
        int lastIndex = arr.length-1;

        while(startIndex <= lastIndex){

            int temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex ++;
            lastIndex --;
        }
        return arr;
    }


    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        size = sc.nextInt();

        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int v: reverseArray.revArray(arr)){
            System.out.println(v);
        }


        sc.close();
    }
}
