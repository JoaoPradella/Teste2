package ComandosCondicionais;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("O valor da prova �: ");
		double A = leitor.nextDouble();
		System.out.println("O valor do projeto �: ");
		double B = leitor.nextDouble();
		System.out.println("O valor do exerc�cio �:  ");
		double C = leitor.nextDouble();
		double media1;
		media1 = (A*5 + B*3 + C*2) / 10;
		
		
		System.out.println("A m�dia1 �: " + media1);
		
		System.out.println("O valor da prova �: ");
		double E = leitor.nextDouble();
		System.out.println("O valor do projeto �:  ");
		double F = leitor.nextDouble();
		System.out.println("O valor do exerc�cio �: ");
		double G = leitor.nextDouble();
		double media2;
		media2 = (E*5 + F*3 + G*2) / 10;
		
		System.out.println("A m�dia2 �: " + media2);
		
		if ((media1 + media2)/2 >=8)
		{
			System.out.println("Aprovado.");
			
		} else if ((media1 + media2)/2 < 8 && (media1 + media2)/2 >= 5) {
			System.out.println(" Recupera��o ");
	
		}else
			System.out.println("Reprovado.");
	}
}


	 






