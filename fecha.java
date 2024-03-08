package métodos;

import java.util.Scanner;

public class fecha {
int dia,mes;
	
	public static void main(String[]args) {
		fecha y=new fecha();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa el día");
		dia=x.nextInt();
		System.out.print("Ingresa el mes");
		mes=x.nextInt();
	   if(dia==25 && mes==12) {
		System.out.print("Es navidad");
	   }else  {
		System.out.print("No es navidad");
	
	}

	}

}
