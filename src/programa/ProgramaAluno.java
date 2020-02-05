package programa;

import java.util.Scanner;

import entidade.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Aluno dados = new Aluno();
		System.out.print("Informe o nome do Aluno: ");
		dados.nome = leia.nextLine();
		System.out.print("Informe a nota 1: ");
		dados.n1 = leia.nextDouble();
		if (dados.n1 <= 30) {
			System.out.print("Informe a nota 2: ");
			dados.n2 = leia.nextDouble();
		} else {
			System.out.print("Informe a nota 1: *entre 0 e 30 ");
			dados.n1 = leia.nextDouble();
		}
		System.out.print("Informe a nota 3: ");
		dados.n3 = leia.nextDouble();
		double media = Aluno.media();
		if (media >= 60) {
			System.out.println("Nota Final: " + media);
			System.out.println("PASS");

		} else {
			System.out.println("Nota Final: " + media);
			System.out.println("FAILED");
			System.out.println("MISSING: " + Aluno.faltou());
		}

	}

}
