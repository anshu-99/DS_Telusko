package sortingCodes;

public class SelectionSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallIdx]){
                    smallIdx=j;
                }
            }
            swap(arr,i,smallIdx);
        }
        print(arr);
    }

    public static void main(String[] args) {
        int[] arr={12,32,11,10,56,65,78,87,71,36};
        System.out.println("Sorted Array");
        selectionSort(arr);
    }
}
