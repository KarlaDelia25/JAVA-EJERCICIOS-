package métodos;

import java.util.Scanner;

public class menoresa10 {
double n1,n2,n3,res;
	
	public static void main(String[]args) {
		menoresa10 y=new menoresa10();
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
	   if(n1<10 && n2<10  && n3<10) {
		System.out.print("Son menores a 10");
	   }else  {
		System.out.print("El 10 es mayor");
	  
	}

	}


}
