package métodos;

import java.util.Scanner;

public class cuadrantes {
double xx,y;
	
	public static void main(String[]args) {
		cuadrantes a=new cuadrantes();
		a.calcular();
		
	}
	public void calcular() {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa x");
		xx=x.nextDouble();
		System.out.print("Ingresa y");
		y=x.nextDouble();
		
	   if(xx>0 && y>0) {
		System.out.print("CUADRANTE I");
	   }else if (xx<0 && y>0) {
		System.out.print("CUADRANTE II");
	   }else if (xx>0 && y>0) {
			System.out.print("CUADRANTE III");
	   }else if (xx>0 && y<0) {
			System.out.print("CUADRANTE IV");
	   }
	}
	  
	

	}




