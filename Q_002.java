import java.util.Scanner;

public class Q_002 {

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de a:");
		Double a = leitor.nextDouble();
		
		System.out.print("Digite o n�mero de b:");
		Double b = leitor.nextDouble();
		
		System.out.print("Digite o n�mero de c:");
		Double c = leitor.nextDouble();
		
		Double S = (a - b - c);
		// subtra��o dos tr�s n�meros 
		
		Double s = (a + b + c);
		// soma dos tr�s
		
		Double M = (a * b * c);
		
		System.out.println("A subtra��o destes tr�s n�meros �: " + S);
		
		System.out.println("A soma dos tr�s n�meros �: " + s);
		
		System.out.println("A multiplica��o dos tr�s n�meros �: " + M);
		
		leitor.close(); 
		
	}
	
}
