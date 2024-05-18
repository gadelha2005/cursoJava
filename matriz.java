package app;
import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas da matriz: ");
        int n = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int m = sc.nextInt();

        int [][] matriz = new int[n][m];

        for( int i = 0 ; i < matriz.length ; i++){
            for( int j = 0 ; j < matriz[i].length ; j++){
                System.out.print("Digite o número da linha " + i + " e coluna " + j + " :");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um número: ");
            int numero = sc.nextInt();

        for( int i = 0 ; i < matriz.length ; i ++){
            for( int j = 0 ; j < matriz[i].length ; j++){
                if( numero == matriz[i][j]){
                    System.out.println("Position " + i +"," + j + ":");
                    if( j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if( i > 0){
                        System.out.println("Left: " + matriz[i-1][j]);
                    }
                    if( j < matriz[i].length-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if( i < matriz[i].length-1){
                        System.out.println("Right: " + matriz[i+ 1][j]);
                    }
                }
            }
        }




        
        
        sc.close();
	}

}
