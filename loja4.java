package app;
import java.util.Locale;
import java.util.Scanner;

import entites.Product4;

public class loja4 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a qauntidade de produtos que serão digitados: ");
        int n = sc.nextInt();

        Product4 [] product = new Product4[n];
		
		for( int i = 0 ; i < product.length ; i++){
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
                 String name = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
                double price = sc.nextDouble();
             product[i] = new Product4(name, price);
        }
		
		double sum = 0;

        for( int i = 0 ; i < product.length ; i++){
            sum += product[i].getPrice();
        }
		
        double avg = sum / product.length;

        System.out.printf("AVERAGE PRICE = %.2f%n" , avg);
		
		sc.close();
	}

}
