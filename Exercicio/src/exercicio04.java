import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.print("Informe o numero do funcionario: ");
		idFuncionario = scan.nextInt();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = scan.nextInt();
		System.out.print("Informe o valor da hora do funcionario: ");
		valorHora = scan.nextDouble();
		
		salario = (double)horasTrabalhadas * valorHora;
		
		System.out.println("Numero do funcionario: " + idFuncionario);
		System.out.printf("O salario é: R$ %.2f", salario);
		
		scan.close();

	}

}
