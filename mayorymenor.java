package métodos;

import java.util.Scanner;

public class mayorymenor {
double n1,n2,res;
	
	public static void main(String[]args) {
		mayorymenor y=new mayorymenor();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa el primer número");
		n1=x.nextDouble();
		System.out.print("Ingresa el segundo número");
		n2=x.nextDouble();
	   if(n1>n2) {
		System.out.print("El número"+n1+"es mayor");
	   }else if(n1<n2) {
		System.out.print("El número"+n2+"es mayor");
	   }else if(n1==n2) {
		System.out.print("Son iguales");
	}

	}
}
