package lt.techin.kristina.pratybos16.p16_5;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();

    public static void addPatient(Patient patient) {
        patients.add(patient);
    }
    public static void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public static List<Doctor> getDoctors() {
        return doctors;
    }

    public static List<Patient> getPatients() {
        return patients;
    }
    public static void getDoctorsTimeSlots() {
        System.out.println("Free time slots: ");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getFullName() + doctor.getFreeTimeSlots());
        }
    }
    public static void getDoctorsBookedTimeSlots(){
        System.out.println("Booked time slots: ");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getFullName() + doctor.getBookedTimeSlots());
        }
    }
}
