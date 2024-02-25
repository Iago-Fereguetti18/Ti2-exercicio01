package exercicio01;
import java.util.*;
public class soma {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//definir dados
		int num = 0;
		int num2 = 0;
		int result = 0;
		System.out.println("Digite o primeiro numero: ");
		num = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		//operacao
		result = num + num2;
		//mostrar resultado
		System.out.println("Resultado: " + result);
	}
}