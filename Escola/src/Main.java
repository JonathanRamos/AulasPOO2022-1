import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String nome = "Aluno a";
		String CPF = "123.456.789-00";
		Date data = new Date();
		String matricula = "1234356";

		Aluno a = new Aluno(matricula, nome, CPF, data);

		System.out.println("Como os atributos ficaram: ");
		System.out.println(a.toString());
	}
}
