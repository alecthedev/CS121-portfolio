package ShuffleTest;

public class FisherYates {
    protected static int[] shuffleFisherYates(int[] array){
        int max = array.length;
        int temp;
        for (int i = 0; i < max - 1; i++) {
            int roll = rollNum(max);
            temp = array[i];
            array[i] = array[roll];
            array[roll] = temp;
        }

        return array;
    }
    private static int rollNum(int max){
        return (int)(Math.random() * max);
    }
}
