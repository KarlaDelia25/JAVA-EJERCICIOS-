package métodos;

import java.util.Scanner;

public class pitágoras {
double co,ca,res;
	
	public static void main(String[]args) {
		pitágoras y=new pitágoras();
		y.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa el cateto opuesto");
		co=x.nextDouble();
		System.out.print("Ingresa el cateto adyancente");
		ca=x.nextDouble();
	    res= Math.sqrt(Math.pow(co,2) + Math.pow(ca,2));
		System.out.print("El resultado es:"+res);
		
	}

}


	


