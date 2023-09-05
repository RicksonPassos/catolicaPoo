package atividaded3;
import java.util.Scanner;

public class Atividade_3 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe o número da mesa do bar: ");
		int mesa = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println("Informe o nome da bebida ou refeição: ");
		String nomeAlimento =  leitura.nextLine();
		
		System.out.println("Informe o preço unitario: ");
		float valor = leitura.nextFloat();
		
		System.out.println("Informe a quantidade: ");
		int quantidade = leitura.nextInt();
		float valorTotal = valor*quantidade;
		leitura.close();
		
		System.out.println("Na mesa: "+mesa+" Foi solicitado: "+nomeAlimento+" No valor de: R$"+valor+" Na quantidade: "+quantidade+" Com o valor final de: R$"+valorTotal);
	}
}
