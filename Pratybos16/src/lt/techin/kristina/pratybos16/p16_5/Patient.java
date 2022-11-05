package lt.techin.kristina.pratybos16.p16_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Patient {
    private String fullName;
    private LocalDate dateOfBirth;
    private HashMap<LocalDateTime,Doctor> appointments = new HashMap<>();

    public Patient(String fullName, LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        Clinic.addPatient(this);
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public HashMap<LocalDateTime, Doctor> getAppointments() {
        return appointments;
    }

    public void addAppointment(LocalDateTime timeSlot, Doctor doctor) {
        appointments.put(timeSlot,doctor);
    }
    public void cancelAppointment(LocalDateTime timeSlot, Doctor doctor) {
        appointments.remove(timeSlot,doctor);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
