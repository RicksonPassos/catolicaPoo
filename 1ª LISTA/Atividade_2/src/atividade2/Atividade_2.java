package atividade2;
import java.util.Scanner;

public class Atividade_2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o nome do professor: ");
		String nomeProfessor =  leitura.nextLine();
		System.out.println("Informe o nome do estudante: ");
		String nomeEstudante = leitura.nextLine();
		System.out.println("Informe a primeira nota do semestre: ");
		float n1 = leitura.nextFloat();
		System.out.println("Informe a segunda nota do semestre: ");
		float n2 = leitura.nextFloat();
		float media = (n1+n2)/2;
		leitura.close();
		System.out.println("Provas do professor: "+nomeProfessor);
		System.out.println("Nome: "+nomeEstudante);
		System.out.println("Nota 1: "+n1);
		System.out.println("Nota 2: "+n2);
		System.out.println("Média: "+media);
	
	}
}
