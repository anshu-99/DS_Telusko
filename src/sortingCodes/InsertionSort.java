package sortingCodes;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        SelectionSort.print(arr);
    }

    public static void main(String[] args) {
        int arr[]={12,43,65,78,11,10,90,84};

        System.out.print("Sorted Array:");
        insertionSort(arr);
    }
}
