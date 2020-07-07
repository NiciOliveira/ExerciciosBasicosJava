import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a,b,c;
		double trianguloRetangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		
		System.out.print("Informe o valor de A: ");
		a = scan.nextDouble();
		System.out.print("Informe o valor de B: ");
		b = scan.nextDouble();
		System.out.print("Informe o valor de C: ");
		c = scan.nextDouble();
		System.out.println();
		
		trianguloRetangulo = (a*c)/2.0;
		circulo = pi*Math.pow(c, 2.0);
		trapezio = ((a+b)/2.0)*c;
		quadrado = Math.pow(b, 2.0);
		retangulo = a*b;
		
		System.out.printf("A área do tringulo é de: %.3f%n",trianguloRetangulo);
		System.out.printf("A área do circulo é de: %.3f%n", circulo);
		System.out.printf("A área do trapézio é de: %.3f%n", trapezio);
		System.out.printf("A área do quadrado é de: %.3f%n", quadrado);
		System.out.printf("A área do retanhulo é de: %.3f%n",retangulo);
		
		scan.close();

	}

}
