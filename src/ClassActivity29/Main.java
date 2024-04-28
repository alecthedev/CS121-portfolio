package ClassActivity29;

public class Main {
    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();

        dataStructure.addToArrayList("Lucy");
        dataStructure.addToArrayList("Stuart");
        dataStructure.addToArrayList("Odin");
        dataStructure.addToArrayList("Alec");

        dataStructure.addToArray(0, 5);
        dataStructure.addToArray(1, 11);
        dataStructure.addToArray(2, 2);
        dataStructure.addToArray(3, 25);

        dataStructure.addToHashMap("Biology", 3.5);
        dataStructure.addToHashMap("English", 2.5);
        dataStructure.addToHashMap("History", 4.0);

        dataStructure.addToLinkedList("French");
        dataStructure.addToLinkedList("Japanese");
        dataStructure.addToLinkedList("Columbian");

        dataStructure.addToStack("Muncie");
        dataStructure.addToStack("Carmel");
        dataStructure.addToStack("Kokomo");

        dataStructure.addToQueue("Indiana");
        dataStructure.addToQueue("Kentucky");
        dataStructure.addToQueue("Ohio");

        System.out.println();
        System.out.println("ArrayList:");
        dataStructure.printArrayList();

        System.out.println();
        System.out.println("Array:");
        dataStructure.printArray();

        System.out.println();
        System.out.println("HashMap:");
        dataStructure.printHashMap();

        System.out.println();
        System.out.println("LinkedList:");
        dataStructure.printLinkedList();

        System.out.println();
        System.out.println("Stack:");
        dataStructure.printStack();

        System.out.println();
        System.out.println("Queue:");
        dataStructure.printQueue();

        dataStructure.removeFromArrayList("Alec");
        dataStructure.removeFromArray(25);
        dataStructure.removeFromHashMap("English");
        dataStructure.removeFromLinkedList("French");
        dataStructure.removeFromStack();
        dataStructure.removeFromQueue();

        System.out.println();
        System.out.println("ArrayList:");
        dataStructure.printArrayList();

        System.out.println();
        System.out.println("Array:");
        dataStructure.printArray();

        System.out.println();
        System.out.println("HashMap:");
        dataStructure.printHashMap();

        System.out.println();
        System.out.println("LinkedList:");
        dataStructure.printLinkedList();

        System.out.println();
        System.out.println("Stack:");
        dataStructure.printStack();

        System.out.println();
        System.out.println("Queue:");
        dataStructure.printQueue();

    }
}
