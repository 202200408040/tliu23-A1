// Appointment.java
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.doctor = null;
    }

    // Constructor that initializes all instance variables
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Method to print appointment details
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time: " + timeSlot);
        System.out.println("Doctor: " + doctor.getClass().getSimpleName());
        doctor.printDetails();
    }

    // Getter for patientMobile
    public String getPatientMobile() {
        return patientMobile;
    }
}
