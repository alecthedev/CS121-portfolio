package Lab12;

import java.util.HashMap;

public class Student {
    private String name;
    private double gpa;
    Integer id;
    private HashMap<String, Course> courseHashMap = new HashMap<>();

    public Student(String name, double gpa, Integer id){
        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void addCourse(String courseName, Course course){
        courseHashMap.put(courseName, course);
    }

    public void removeCourse(String courseName){
        courseHashMap.remove(courseName);
    }

    public Course getCourse(String courseName){
        Course foundCourse = null;
        if(courseHashMap.containsKey(courseName)){
            foundCourse = courseHashMap.get(courseName);
        }
        return foundCourse;
    }

    public StringBuilder getAllCourses(){
        StringBuilder courseStringBuilder = new StringBuilder();
        courseHashMap.forEach((name, course) -> {
            courseStringBuilder.append(name);
        });
        return courseStringBuilder;
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                GPA: %.2f
                
                """, name, gpa);
    }
}
