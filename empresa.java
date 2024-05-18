package app;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import entites.Funcionarios;

public class empresa {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

         List<Funcionarios> list = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        Integer n = sc.nextInt();

        for( int i = 0 ; i < n ; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
           
            System.out.print("Id: ");
            Integer id = sc.nextInt();
           
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Funcionarios funcionarios = new Funcionarios(id, name, salary);
            list.add(funcionarios);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer posicao = position(list, idSalary);

        if( posicao == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(posicao).increaseSalary(percent);
        }

        System.out.println("");
        System.out.println("List of employees: ");

        for( Funcionarios funcionarios : list){
            System.out.println(funcionarios);
        }


        sc.close();
    }
    public static Integer position(List<Funcionarios> list, int id){
        for( int i = 0 ; i < list.size() ; i++){
            if( list.get(i).getId()== id){
                return i;
            }
        }
        return null ;
    }
}
