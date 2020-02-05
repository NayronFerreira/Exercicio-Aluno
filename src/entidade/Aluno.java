package entidade;

public class Aluno {

	public static double n1;
	public static double n2;
	public static double n3;
	public static String nome;

	public static double media() {
		double media = n1 + n2 + n3;
		return media;
	}

	public static double faltou() {
		if (media() < 60) {
			double faltou = 100 - media();
			return faltou;

		} else {
			return 0;
		}
	}
}
