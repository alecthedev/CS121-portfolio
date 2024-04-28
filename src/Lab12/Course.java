package Lab12;

public class Course {
    private String name;
    private int openSeats;

    public Course(String name, int openSeats){
        this.name = name;
        this.openSeats = openSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpenSeats() {
        return openSeats;
    }

    public void setOpenSeats(int openSeats) {
        this.openSeats = openSeats;
    }

    @Override
    public String toString(){
        return String.format("""
                Course: %s
                Open seats: %d
                
                """, name, openSeats);
    }
}
