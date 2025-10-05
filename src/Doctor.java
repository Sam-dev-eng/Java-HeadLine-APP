import java.util.ArrayList;

public class Doctor {
            public static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
            private String name;
            private int age;
            private String contact;
            private String department;
            private String timeOfWork;
            private boolean booked;



    public Doctor(String name, int age, String contact, String department, String timeOfWork) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.department = department;
        this.timeOfWork = timeOfWork;
        doctors.add(this);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getTimeOfWork() {
        return timeOfWork;
    }
    public void setTimeOfWork(String timeOfWork) {
        this.timeOfWork = timeOfWork;
    }
    public boolean isBooked() {
        return booked;
    }
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    @Override
    public String toString() {
        return this.name + this.department;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }


}
