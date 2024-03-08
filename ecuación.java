package métodos;

import java.util.Scanner;

public class ecuación {
	double a,b,res;
	
	public static void main(String[]args) {
		ecuación y=new ecuación();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa a");
		a=x.nextDouble();
		System.out.print("Ingresa b");
		b=x.nextDouble();
		res=((a-b)*(a+b));
		System.out.print("El resultado es:"+res);
		
	}

}
