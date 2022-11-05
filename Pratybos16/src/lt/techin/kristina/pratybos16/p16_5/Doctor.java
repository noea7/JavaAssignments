package lt.techin.kristina.pratybos16.p16_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Doctor {
    private String fullName;
    private LinkedList<LocalDateTime> freeTimeSlots = new LinkedList<>();
    private LinkedHashMap<LocalDateTime, Patient> bookedTimeSlots = new LinkedHashMap<>();
    private LocalTime startHours;
    private LocalTime endHours;
    private LocalTime lunchStartHours;
    private LocalTime lunchEndHours;

    public Doctor(String fullName) {
        this.fullName = fullName;
        Clinic.addDoctor(this);
        this.startHours = LocalTime.of(8,0);
        this.endHours = LocalTime.of(17,0);
        this.lunchStartHours = LocalTime.of(12,0);
        this.lunchEndHours = LocalTime.of(13,0);
    }

    public String getFullName() {
        return fullName;
    }

    public void setSchedule (LocalDate start, LocalDate end) {
        LocalDateTime timeSlot = LocalDateTime.of(start,startHours);
        while (LocalDateTime.of(end,endHours).isAfter(timeSlot)) {
            if (freeTimeSlots.contains(timeSlot) || bookedTimeSlots.containsKey(timeSlot)) {
                System.out.println("Already have schedule for day " + timeSlot.toLocalDate());
            } else {
                while (endHours.isAfter(timeSlot.toLocalTime())) {
                    if (timeSlot.toLocalTime().isBefore(lunchStartHours) ||
                            timeSlot.toLocalTime().isAfter(lunchEndHours) ||
                            timeSlot.toLocalTime().equals(lunchEndHours)) {
                        freeTimeSlots.add(timeSlot);
                    }
                    timeSlot = timeSlot.plusMinutes(15);
                }
            }
            timeSlot = timeSlot.with(startHours);
            timeSlot = timeSlot.plusDays(1);
        }
    }

    public LinkedList<LocalDateTime> getFreeTimeSlots() {
        return freeTimeSlots;
    }
    public void bookTimeSlot (LocalDateTime timeSlot, Patient patient) {
        if (freeTimeSlots.contains(timeSlot)) {
            bookedTimeSlots.put(timeSlot,patient);
            patient.addAppointment(timeSlot,this);
            System.out.println("Successfully booked " + patient.getFullName() + " for " + timeSlot);
        } else {
            System.out.println("No such time slot available");
        }
    }
    public void cancelTimeSlot (LocalDateTime timeSlot, Patient patient) {
        if (bookedTimeSlots.containsKey(timeSlot)) {
            bookedTimeSlots.remove(timeSlot);
            freeTimeSlots.add(timeSlot);
            patient.cancelAppointment(timeSlot,this);
        }
    }

    public LinkedHashMap<LocalDateTime, Patient> getBookedTimeSlots() {
        return bookedTimeSlots;
    }
    public LocalDateTime getFirstTimeSlot () {
        return freeTimeSlots.getFirst();
    }
    public void bookFirstTimeSlot(Patient patient) {
        bookTimeSlot(getFirstTimeSlot(), patient);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "fullName='" + fullName + '\'' +
                ", startHours=" + startHours +
                ", endHours=" + endHours +
                ", lunchStartHours=" + lunchStartHours +
                ", lunchEndHours=" + lunchEndHours +
                '}';
    }
}
