package métodos;

import java.util.Scanner;

public class suma {
	double num1,num2,res;
	
	public static void main(String[]args) {
		suma y=new suma();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa el primer número");
		num1=x.nextDouble();
		System.out.print("Ingresa el segundo número");
		num2=x.nextDouble();
		res=num1+num2;
		System.out.print("El resultado es:"+res);
		
	}

}
