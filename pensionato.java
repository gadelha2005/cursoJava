package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Sistema;

public class pensionato {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        Sistema [] sistema = new Sistema[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for( int i = 1 ; i <= n ; i++){
            System.out.println();
            System.out.println("Rent #" +i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Room: ");
            int room = sc.nextInt();

            sistema[room] = new Sistema(name, email);
        }

        System.out.println();
        System.out.println("Bussy rooms");
       
		for( int i = 0 ; i < 10 ; i++){
            if( sistema[i] != null){
                System.out.println( i+":" + sistema[i]);
            }
        }

		sc.close();
	}

}
