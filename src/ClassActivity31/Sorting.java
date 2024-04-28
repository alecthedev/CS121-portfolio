package ClassActivity31;

import java.util.Scanner;

public class Sorting {

    // ----------------------------------------------Helper Methods-----------------------------------------------------

    protected static int[] getArray(){
        Scanner input = new Scanner(System.in);
        int[] unsortedArray = new int[5];
        System.out.println("\n *** Integer Array Sorting ***");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            unsortedArray[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
        return unsortedArray;
    }

    protected static void printIntArray(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
    }

    private static int[] shuffle(int[] array){
        int max = array.length;
        int temp;
        for (int i = 0; i < max - 1; i++) {
            int roll = (int) (Math.random() * max);
            temp = array[i];
            array[i] = array[roll];
            array[roll] = temp;
        }
        return array;
    }

    // -----------------------------------------Bubble Sort Methods-----------------------------------------------------

    protected static int[] ascendingBubbleSort(int[] array){
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    protected static int[] descendingBubbleSort(int[] array){
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // -------------------------------------Merge Sort Methods----------------------------------------------------------

    protected static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }

        int[] leftHalf = new int[array.length / 2];
        int[] rightHalf = new int[array.length - leftHalf.length];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length + i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        return merge(leftHalf, rightHalf, array);
    }

    private static int[] merge(int[] leftHalf, int[] rightHalf, int[] array){
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)){
            if (leftHalf[leftIndex] < rightHalf[rightIndex]){
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            arrayIndex++;
            leftIndex++;
        }

        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            arrayIndex++;
            rightIndex++;
        }
        return array;
    }

    // ----------------------------------------Selection Sort-----------------------------------------------------------

    protected static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    // ----------------------------------------Insertion Sort-----------------------------------------------------------

    protected static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]){
                    int temp  = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    // ------------------------------------------------Quicksort Methods------------------------------------------------

    protected static int[] quicksort(int[] array, int i, int k){
        int j;

        if(i >= k){
            return array;
        }

        j = partition(array, i, k);

        quicksort(array, i, j);
        quicksort(array, j + 1, k);

        return array;
    }

    private static int partition(int[] array, int i, int k) {
        int low;
        int high;
        int midpoint;
        int pivot;
        int temp;
        boolean sorted;

        midpoint = i + (k - i) / 2;
        pivot = array[midpoint];

        sorted = false;
        low = i;
        high = k;

        while (!sorted){
            while (array[low] < pivot) {
                ++low;
            }

            while (pivot < array[high]) {
                --high;
            }

            if (low >= high) {
                sorted = true;
            } else {
                temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                ++low;
                --high;
            }
        }
        return high;
    }

}
