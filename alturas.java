package app;
import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
       System.out.print("Digite a quantidade de pessoas: ");
            int n = sc.nextInt();
            double[] altura = new double[n];

        for( int i = 0 ; i < n ; i++){
            System.out.print("Digite a altura da " + i + "a pessoa: ");
            altura[i] = sc.nextDouble();
        }
        
        double sum = 0;

        for( int i = 0 ; i< n ; i++){
            sum+= altura[i];
        }

		double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT = %.2f%n " , avg);
		
		
		sc.close();
	}


}
