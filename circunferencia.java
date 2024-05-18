package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Circumference;

public class circunferencia {

    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
    System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

    double c = Circumference.circunferencia(radius);
    double v = Circumference.volume(radius);

    System.out.printf("Circumference = %.2f%n" , c);
    System.out.printf("Volume = %.2f%n " , v);
    System.out.printf("PI value = %.2f" , Circumference.PI);

		
		sc.close();
	}
   
    }

