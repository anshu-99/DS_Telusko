// it must be sorted
package searchingCodes;
import java.util.Arrays;
public class BinarySearch {
    public static void binarySearch(int[] arr,int n){
        Arrays.sort(arr);
        int start=0,mid,end=arr.length-1;
        while(start<=end){
            mid=(start+end)/2;
            if(n==arr[mid]){
                System.out.println("Element found in array at index:"+mid);
                break;
            }
            else if(n>arr[mid]){
                start=mid+1;
            }
            else if(n<arr[mid]){
                end=mid-1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={12,43,55,10,11,40,85,20}; // 10,11,12,20,40,43,55,85
        System.out.println("Result-");
        binarySearch(arr,20);
    }
}
