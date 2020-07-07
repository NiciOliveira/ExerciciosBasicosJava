import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A,B,C,D;
		int diferenca;
		
		
		System.out.print("Digite um valor para A: ");
		A = scan.nextInt();
		System.out.print("Digite um valor para B: ");
		B = scan.nextInt();
		System.out.print("Digite um valor para C: ");
		C = scan.nextInt();
		System.out.print("Digite um valor para D: ");
		D = scan.nextInt();
		
		System.out.println("Os valores sao, A = " + A + ", B = " + B + ", C = " + C + " e D = " + D);
		diferenca = (A * B) - (C * D);
		System.out.println("A diferenca do produto de A e B pelo produto de C e D, é igual a: " + diferenca);
		
		scan.close();

	}

}
