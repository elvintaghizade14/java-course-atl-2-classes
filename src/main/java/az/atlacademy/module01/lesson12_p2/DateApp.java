package az.atlacademy.module01.lesson12_p2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateApp {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date.setTime(0);
        System.out.println(date);

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:/:mm:/:ss:/:ms")));

        LocalTime localTime = LocalTime.now().plusHours(24);
        System.out.println(localTime);

        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.of(1999, 6, 14));

        LocalDate elvinBirthDate = LocalDate.of(1999, 6, 14);
        LocalDate samirBirthDate = LocalDate.of(1996, 6, 14);

        System.out.println(elvinBirthDate.isBefore(samirBirthDate));

        String day = "03";
        String month = "05";
        String year = "1999";
        String date1 = year + "-" + month + "-" + day;
        LocalDate parsedDate = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(parsedDate);

        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(now);
    }

}
