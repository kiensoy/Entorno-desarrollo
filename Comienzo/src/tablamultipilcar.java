import java.util.*;
public class tablamultipilcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero para impromor su tabla");
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		numero=teclado.nextInt();
		for(int i=1;i<11;i++){
			
			
			System.out.println(numero +"*"+ i +"="+ i*numero);
			System.out.println("--------------------------------");
		}
		
		
	}

}
