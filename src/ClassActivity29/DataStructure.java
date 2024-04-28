package ClassActivity29;

import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[4];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    //Add to structure methods

    public void addToArrayList(String name) {
        studentList.add(name);
    }

    public void addToArray(int index, int age){
        ageList[index] = age;
    }

    public void addToHashMap(String major, Double gpa){
        majorGpaMap.put(major, gpa);
    }

    public void addToLinkedList(String nationality){
        nationalityList.add(nationality);
    }

    public void addToStack(String hometown){
        hometownStack.push(hometown);
    }

    public void addToQueue(String homeState){
        homeStateQueue.add(homeState);
    }

    //Removal Methods

    public void removeFromArrayList(String name) {
        studentList.remove(name);
    }

    public void removeFromArray(int age){
        int[] newArray = new int[ageList.length];
        for (int i = 0; i < ageList.length; i++) {
            if(ageList[i] != age){
                newArray[i] = ageList[i];
            }
        }
        ageList = newArray;
    }

    public void removeFromHashMap(String major){
        majorGpaMap.remove(major);
    }

    public void removeFromLinkedList(String nationality){
        nationalityList.remove(nationality);
    }

    public void removeFromStack(){
        hometownStack.pop();
    }

    public void removeFromQueue(){
        homeStateQueue.remove();
    }

    //Print all methods

    public void printArrayList() {
        for(String name : studentList){
            System.out.println(name);
        }
    }

    public void printArray(){
        for(int age : ageList){
            System.out.println(age);
        }
    }

    public void printHashMap(){
        StringBuilder majorGpaStringBuilder = new StringBuilder();
        majorGpaMap.forEach((major, gpa) -> {
            majorGpaStringBuilder.append(major);
            majorGpaStringBuilder.append(", ");
            majorGpaStringBuilder.append(gpa);
            majorGpaStringBuilder.append("\n");
        });
        System.out.println(majorGpaStringBuilder);
    }

    public void printLinkedList(){
        for(String nationality : nationalityList){
            System.out.println(nationality);
        }
    }

    public void printStack(){
        for (String homeTown : hometownStack){
            System.out.println(homeTown);
        }
    }

    public void printQueue(){
        for(String homeState: homeStateQueue){
            System.out.println(homeState);
        }
    }
}
