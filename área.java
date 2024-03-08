package métodos;

import java.util.Scanner;

public class área {
double b,h,res;
	
	public static void main(String[]args) {
		área y=new área();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa la base");
		b=x.nextDouble();
		System.out.print("Ingresa la altura");
		h=x.nextDouble();
		res=b*h/2;
		System.out.print("El resultado es:"+res);
		
	}


}
