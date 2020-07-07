import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idPeca1, qtdePeca1, idPeca2, qtdePeca2;
		double valorPeca1,valorPeca2, totalPagar;
		
		System.out.print("Informe o código da peça1: ");
		idPeca1 = scan.nextInt();
		System.out.print("Informe a quatidade de peças peça1: ");
		qtdePeca1= scan.nextInt();
		System.out.print("Informe o valor da peça1: ");
		valorPeca1 = scan.nextDouble();
		System.out.println();
		System.out.print("Informe o código da peça2: ");
		idPeca2 = scan.nextInt();
		System.out.print("Informe a quatidade de peças peça2: ");
		qtdePeca2= scan.nextInt();
		System.out.print("Informe o valor da peça2: ");
		valorPeca2 = scan.nextDouble();
		System.out.println();
		
		totalPagar = ((double)qtdePeca1*valorPeca1)+((double)qtdePeca2*valorPeca2);
		
		System.out.printf("Valor total a pagar: R$ %.2f", totalPagar);
		
		scan.close();

	}

}
