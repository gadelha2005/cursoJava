package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Employee;


public class funcionario {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
            employee.name = sc.nextLine();
        
        System.out.print("Groos salary: ");
            employee.groosSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Tax: ");
            employee.tax = sc.nextDouble();
        
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary: ");
            double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

       
        System.out.println("Update data:  " + employee);
		
		
		
		sc.close();
	}

}
