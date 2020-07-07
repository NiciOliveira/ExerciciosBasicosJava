import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double area, raio;		
		double pi = 3.14159;
		
		System.out.print("Informe o valor do raio: ");
		raio = scan.nextDouble();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("O valor arredondado da area do circulo e: %.2f%n", area);
		System.out.println("O valor da area do circulo e: " + area);
		scan.close();
	}

}
