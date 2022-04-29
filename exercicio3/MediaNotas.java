package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe aqui seu nome: ");
		String nome = ler.next();

		System.out.print("Por favor, informe a sua primeira nota: ");
		double nota1 = ler.nextDouble();

		System.out.print("Por favor, informe a sua segunda nota: ");
		double nota2 = ler.nextDouble();
		ler.close();
		double media = ((nota1 + nota2) / 2);
		if (media >= 6) {

			System.out.println("Parab�ns," + nome + " voc� est� aprovado. Sua m�dia foi: " + media);
		} else
			System.out.println("Sinto muito, " + nome + " se esforce um pouco mais. Sua m�dia foi: " + media);
	}

}
