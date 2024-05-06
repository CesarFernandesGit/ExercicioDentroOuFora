import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos numeros voce vai digitar? ");
		int contagem = scanner.nextInt();

		int numero = 0;
		int dentro = 0;
		int fora = 0;

		for (int i = 0; i < contagem; i++) {
			System.out.print("Digite um numero: ");
			numero = scanner.nextInt();

			if (numero >= 10 && numero < 20) {
				dentro += 1;
			} else {
				fora += 1;
			}
		}

		System.out.printf("%d DENTRO%n", dentro);
		System.out.printf("%d FORA%n", fora);

		scanner.close();
	}

}
