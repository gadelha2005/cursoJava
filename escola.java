package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Average;


public class escola {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Average average = new Average();
		
		System.out.print("Name: ");
            average.name = sc.nextLine();
        
        System.out.print("Note 1 : ");
        average.nota1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Note 2 : ");
        average.nota2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Note 3 : ");
        average.nota3 = sc.nextDouble();
        sc.nextLine();

        System.out.printf("FINAL GRADE = %.2f " , average.finalGrade());
        System.out.println();
		
		if(average.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS " , average.missingPoints());
        }
        else{
            System.out.println("PASS");
        }

		sc.close();
	}

}
