// OtherHealthProfessional.java
public class OtherHealthProfessional extends HealthProfessional {
    private String field;

    // Default constructor
    public OtherHealthProfessional() {
        super();
        this.field = "Specialized Field";
    }

    // Constructor that initializes all instance variables
    public OtherHealthProfessional(int id, String name, String basicInfo, String field) {
        super(id, name, basicInfo);
        this.field = field;
    }

    // Override method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Field: " + field);
    }
}
