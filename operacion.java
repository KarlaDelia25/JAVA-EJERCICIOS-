package métodos;

import java.util.Scanner;

public class operacion {
double n1,n2,n3,res;
	
	public static void main(String[]args) {
		operacion y=new operacion();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa el primer número");
		n1=x.nextDouble();
		System.out.print("Ingresa el segundo número");
		n2=x.nextDouble();
		System.out.print("Ingresa el tercer número");
		n3=x.nextDouble();
	   if(n1==n2 && n2==n3) {
		   res=((n1+n2)*n3);
		System.out.print("El resultado es "+res);
	   }else  {
		System.out.print("No son iguales");
	  
	}

	}

}
