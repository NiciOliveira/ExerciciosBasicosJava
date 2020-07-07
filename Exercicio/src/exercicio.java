import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite o valor do primeiro numero");
		num1 = scan.nextInt();
		System.out.println("Digite o valor do segundo numero");
		num2 = scan.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma de " + num1 + " + " + num2 + " e igual a: " + soma);
		scan.close();

	}

}
