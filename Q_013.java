import java.util.Scanner;

public class Q_013 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do sal�rio minimo: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite seu sal�rio: ");
		double b = leitor.nextDouble();
		
		System.out.println("Voc� recebe cerca de " + (int) ( b / a ) + " Salarios minimos");
		
	}

}
