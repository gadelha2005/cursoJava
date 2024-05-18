package app;
import java.util.Locale;
import java.util.Scanner;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_hora1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-05-14");
        LocalDateTime d05 = LocalDateTime.parse("2024-05-14T01:30:26");
        Instant d06 = Instant.parse("2024-05-14T01:30:26Z");
        
        LocalDate d07 = LocalDate.parse("14/05/2024" , fmt1);
        LocalDateTime d08 = LocalDateTime.parse("16/05/2024 01:30" , fmt2);

        LocalDate d09 = LocalDate.of(2024, 05, 14);
        LocalDateTime d10 = LocalDateTime.of(2024, 05, 14, 15, 40, 20);

        System.out.println("D01 = " + d01);
        System.out.println("D02 = " + d02);
        System.out.println("D03 = " + d03);
        System.out.println("D04 = " + d04);
        System.out.println("D05 = " + d05);
        System.out.println("D06 = " + d06);
        System.out.println("D07 = " + d07);
        System.out.println("D08 = " + d08);
        System.out.println("D09 = " + d09);
        System.out.println("D10 = " + d10);

            sc.close();
        }	
    
    
}
