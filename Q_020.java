import java.util.Scanner;

public class Q_020 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a dimens�o do c�modo: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite a dimens�o do c�modo: ");
		double b = leitor.nextDouble();
		
		double area = a * b;
		
		System.out.println("�rea: " + area+"m�" );
		System.out.println(("Pot�ncia: " + (a * b) / 18 ));
		
		
	}

}
