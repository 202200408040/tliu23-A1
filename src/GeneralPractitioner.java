// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.specialty = "General Medicine";
    }

    // Constructor that initializes all instance variables
    public GeneralPractitioner(int id, String name, String basicInfo, String specialty) {
        super(id, name, basicInfo);
        this.specialty = specialty;
    }

    // Override method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}
