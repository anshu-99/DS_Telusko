package searchingCodes;
import ArrayCodes.BasicArrayCode;

import java.util.*;
public class LinearSearch {
    public static void linearSearch(int[] arr,int n){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                flag++;
                System.out.println("Element is Present in array at index num:"+i);
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("enter element");
        BasicArrayCode.arrayInput(arr);
        System.out.println("You have entered");
        BasicArrayCode.arrayOutput(arr);
        System.out.println("enter element to search");
        int n=sc.nextInt();
        System.out.println("Result - ");
        LinearSearch.linearSearch(arr,n);
    }
}
