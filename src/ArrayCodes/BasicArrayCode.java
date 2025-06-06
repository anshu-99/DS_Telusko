package ArrayCodes;
import java.util.*;
public class BasicArrayCode {
    public static void arrayInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        return arr;
    }
    public static void arrayOutput(int[] arr){
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
//        return arr;
    }
    public static void reverseArray(int arr[]){
        int[] reversedArray=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            reversedArray[j]=arr[i];
            j--;
        }
        arrayOutput(reversedArray);
//        return reversedArray;

    }

    public static void reversedArrayOnIndex(int[] arr,int n){
        ArrayList<Integer> reversedArray=new ArrayList<>();
        for(int i=0;i<n;i++){
            reversedArray.add(arr[i]);
        }
        for(int i=arr.length-1;i>=n;i--){
                reversedArray.add(arr[i]);
        }
        for (int i=0;i<reversedArray.size();i++){
            System.out.print(reversedArray.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("Enter data:");
        arrayInput(arr);
        System.out.println();
        System.out.print("Your Data:");
        arrayOutput(arr);
        System.out.println();
        System.out.println("Reversed Array:");
        reverseArray(arr);
        System.out.println("Enter the element from where you want to reverse the array");
        int idx=sc.nextInt();
        reversedArrayOnIndex(arr,idx);
    }
}
