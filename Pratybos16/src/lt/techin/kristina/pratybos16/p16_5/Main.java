package lt.techin.kristina.pratybos16.p16_5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("John Smith");
        doctor1.setSchedule(LocalDate.of(2022,12,1),
                LocalDate.of(2022,12,2));
        System.out.println(doctor1.getFreeTimeSlots());
        Patient patient1 = new Patient("Frodo Baggins",LocalDate.of(1980,9,22));
        doctor1.bookTimeSlot(LocalDateTime.of(2022,12,2,15,45), patient1);
        System.out.println(doctor1.getBookedTimeSlots());
        Doctor doctor2 = new Doctor("Gregory House");
        doctor2.setSchedule(LocalDate.of(2022,11,15),LocalDate.of(2022,11,16));
        Clinic.getDoctorsTimeSlots();
        Patient patient2 = new Patient("Tom Riddle", LocalDate.of(1931,12,31));
        doctor2.bookFirstTimeSlot(patient2);
        Clinic.getDoctorsBookedTimeSlots();
    }
}
