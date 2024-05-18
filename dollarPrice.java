package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Conversion;

public class dollarPrice {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
            double dollarPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("How many dollars will be bought? ");
            int dollarQuantity = sc.nextInt();
        
        System.out.printf("Amount to be paid in reais = %.2f " , Conversion.conventer(dollarPrice, dollarQuantity));
		
		
		
		
		
		
		sc.close();
	}

}
