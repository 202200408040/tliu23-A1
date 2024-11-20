// HealthProfessional.java
public class HealthProfessional {
    private int id;
    private String name;
    private String basicInfo;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.basicInfo = "";
    }

    // Constructor that initializes all instance variables
    public HealthProfessional(int id, String name, String basicInfo) {
        this.id = id;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    // Method to print health professional details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Info: " + basicInfo);
    }
}
