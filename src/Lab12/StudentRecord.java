package Lab12;

import java.util.HashMap;

public class StudentRecord {
    HashMap<Integer, Student> studentHashMap = new HashMap<>();

    public void addStudent(Integer id, Student student){
        studentHashMap.put(id, student);
    }

    public void removeStudent(Integer id){
        studentHashMap.remove(id);
    }

    public Student getStudent(Integer id){
        Student foundStudent = null;
        if(studentHashMap.containsKey(id)){
            foundStudent = studentHashMap.get(id);
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents(){
        StringBuilder studentStringBuilder = new StringBuilder();
        studentHashMap.forEach((id, student) -> {
            studentStringBuilder.append(student.toString());
        });
        return studentStringBuilder;
    }
}
