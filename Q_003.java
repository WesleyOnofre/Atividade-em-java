import java.util.Scanner;

public class Q_003 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double a = leitor.nextInt();
		
		System.out.println("Digite um n�mero: ");
		double b = leitor.nextInt();
		
		int D = (int) ( a / b );
		//divis�o 
		int r = (int) ( a % b );
		// resto da divis�o
		double f = ( a / b );
		
		System.out.println("Divis�o destes n�meros: " + D);
		System.out.println("Resto da divis�o: " + r);
		System.out.println("Divis�o real deste n�mero" + f);
		
		leitor.close();
	}

}
