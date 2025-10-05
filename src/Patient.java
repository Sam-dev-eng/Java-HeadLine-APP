import java.util.ArrayList;

public class Patient {

    public static ArrayList<Patient> patients = new ArrayList<Patient>();
    private String name;
    private int age;
    private String contact;
    private String reason;
    private String Doctor;

    public Patient(String name, int age, String contact, String reason) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.reason = reason;
        patients.add(this);
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
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getDoctor() {
        return Doctor;
    }
    public void setDoctor(String doctor) {
        this.Doctor = doctor;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
