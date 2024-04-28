package ShuffleTest;

public class Test {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};

        System.out.print("Sorted array:   ");
        for(int num : sortedArray){
            System.out.print(num + " ");
        }

        System.out.println();

        int[] shuffledArray = FisherYates.shuffleFisherYates(sortedArray);

        System.out.print("Shuffled Array: ");
        for(int num : shuffledArray){
            System.out.print(num + " ");
        }

    }
}
