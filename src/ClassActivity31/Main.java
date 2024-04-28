package ClassActivity31;

public class Main {
    public static void main(String[] args) {
        int[] userArray = Sorting.getArray();

        System.out.print("\nUnsorted Array: ");
        Sorting.printIntArray(userArray);
        System.out.println();

        System.out.print("\nAscending Bubble Sort: ");
        Sorting.printIntArray(Sorting.ascendingBubbleSort(userArray));
        System.out.println();

        System.out.print("\nDescending Bubble Sort: ");
        Sorting.printIntArray(Sorting.descendingBubbleSort(userArray));
        System.out.println();

        System.out.print("\nMerge Sort: ");
        Sorting.printIntArray(Sorting.mergeSort(userArray));
        System.out.println();

        System.out.print("\nSelection Sort: ");
        Sorting.printIntArray(Sorting.selectionSort(userArray));
        System.out.println();

        System.out.print("\nInsertion Sort: ");
        Sorting.printIntArray(Sorting.insertionSort(userArray));
        System.out.println();

        System.out.print("\nQuicksort: ");
        Sorting.printIntArray(Sorting.quicksort(userArray, 0, userArray.length - 1));
        System.out.println();
    }

}
