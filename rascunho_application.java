package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Rascunho_entities;

public class rascunho_application {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();

        Rascunho_entities[] alunos = new Rascunho_entities[n];

        for( int i = 0 ; i < alunos.length ; i++){
            System.out.println("Digite nome , primeira e segunda nota do " + (i + 1) + "o aluno: ");
            sc.nextLine();
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double media = nota1 + nota2;
            alunos[i] = new Rascunho_entities(name, nota1, nota2);
        }

        for( int i = 0 ; i < alunos.length ; i++){
            if(alunos[i].media() >= 6){
                System.out.println(alunos[i].getName());
            }
        }

        









		sc.close();
	}
   
}
