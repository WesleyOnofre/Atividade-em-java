import java.util.Scanner;

public class Q_018 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio da circufer�ncia: ");
		double r = leitor.nextDouble();
		
		System.out.println("Comprimento da circufer�ncia:" + (2*Math.PI*r));
		System.out.println("�rea da circufer�ncia: " + (Math.PI*Math.pow(r, 2)));
		System.out.println("Volume de uma esfera: " + (4 * Math.PI*Math.pow(r, 3)) / 3);
		
	}

}
