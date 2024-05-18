package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class banco {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        Account account;

		System.out.print("Enter account number: ");
            int number = sc.nextInt();
             sc.nextLine();

        System.out.print("Enter account holder: ");
            String holder = sc.nextLine();
        
        System.out.print("Is there na inital deposit value: ");
            char response = sc.next().charAt(0);
		
		if(response == 'y'){
            System.out.print("Enter a inital deposit value? ");
            double initalDeposit = sc.nextDouble();
            account = new Account(number, holder, initalDeposit);
        }
        else{
            account = new Account(number, holder);
        }
		
		System.out.println();
        System.out.println("Account data: ");
		System.out.println(account);
		
        System.out.print("Enter a deposit value: ");
            double amount = sc.nextDouble();
        account.deposit(amount);
        
        System.out.println("Update data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
            amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Update data: ");
        System.out.println(account);


		sc.close();
	}
}
