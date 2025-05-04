package sortingCodes;

public class BubbleSort {
    public static void printArray(int[] arr){
        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Print array after each pass
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("After Sorting:");
        BubbleSort.printArray(arr);
    }


    public static void main(String[] args) {
        int[] arr={11,89,10,54,32,90,21,45,111,151,100,1,890,141,200};
        System.out.println("Before sorting");
        BubbleSort.printArray(arr);
        System.out.println();
//        System.out.println("After sorting");
        BubbleSort.bubbleSort(arr);
    }
}
