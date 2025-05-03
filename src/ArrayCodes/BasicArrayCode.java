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
        for(int i=0;i<arr.length;){
            for(int j=arr.length-1;j>=0;j--){
                reversedArray[j]=arr[i];
                i++;
            }
        }
        BasicArrayCode.arrayOutput(reversedArray);
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
        BasicArrayCode.arrayInput(arr);
        System.out.println();
        System.out.print("Your Data:");
        BasicArrayCode.arrayOutput(arr);
        System.out.println();
        System.out.println("Reversed Array:");
        BasicArrayCode.reverseArray(arr);
        System.out.println("Enter the element from where you want to reverse the array");
        int idx=sc.nextInt();
        BasicArrayCode.reversedArrayOnIndex(arr,idx);
    }
}
