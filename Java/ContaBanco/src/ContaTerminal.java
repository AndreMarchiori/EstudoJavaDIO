import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numeroAgencia;
		String agencia;
		String nome;
		double saldo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência !");
		numeroAgencia = scanner.nextInt();
		
		System.out.println("Por favor, digite o código da Agência !");
		agencia = scanner.next();
		
		System.out.println("Por favor, insira o seu nome !");
		nome = scanner.next();
		
		System.out.println("Por favor, insira o valor monetário que deseja armazenar.");
		saldo = scanner.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso bano, sua agência é %s,"
				+ " conta %d e seu saldo R$%f já está disponível para saque.", nome, agencia, numeroAgencia, saldo);
		
	}
}
