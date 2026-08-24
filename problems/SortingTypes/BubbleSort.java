package SortingTypes;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2 , 7 ,4 ,1};
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j-1]>arr[j]) { //checks adjacent element
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
