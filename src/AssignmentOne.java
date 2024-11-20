// AssignmentOne.java
import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("Part 3 - Creating Health Professional Objects:");

        // Create General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Experienced in general health care", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "Specializes in adult medicine", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Charlie", "Expert in children's health", "Pediatrics");

        // Create Other Health Professionals
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Diana", "Specializes in surgery", "Surgical Procedures");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Ethan", "Expert in orthopedic medicine", "Orthopedics");

        // Print details of all health professionals
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        ohp1.printDetails();
        System.out.println("------------------------------");
        ohp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 - Appointment System:");

        // Create an ArrayList to store appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create appointments
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "10:00", ohp2);

        // Print existing appointments
        printExistingAppointments(appointments);

        // Cancel an appointment
        cancelBooking(appointments, "1234567890");

        // Print existing appointments after cancellation
        printExistingAppointments(appointments);
    }

    // Method to create an appointment
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() && patientMobile != null && !patientMobile.isEmpty() && timeSlot != null && !timeSlot.isEmpty() && doctor != null) {
            Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(appointment);
            System.out.println("Appointment created successfully.");
        } else {
            System.out.println("Failed to create appointment. All fields must be provided.");
        }
    }

    // Method to print existing appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing appointments:");
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel an appointment
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        Appointment toRemove = null;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                toRemove = appointment;
                break;
            }
        }
        if (toRemove != null) {
            appointments.remove(toRemove);
            System.out.println("Appointment cancelled successfully.");
        } else {
            System.out.println("No appointment found for the given mobile number.");
        }
    }
}

