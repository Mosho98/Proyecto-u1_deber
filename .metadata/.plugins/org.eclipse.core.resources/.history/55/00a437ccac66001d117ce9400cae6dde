package com.example.demo.deber;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
static Scanner sc = new Scanner(System.in);



	public static void main(String[] args) {
int op = 0, n;

		
		do {
			try { 
		
				op = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Mostrar menu\n" + 
				        "2. Filtrar platos\n" +
				        "10. Salir\n",
						" >> RESTAURANTE <<", JOptionPane.INFORMATION_MESSAGE

				));
				switch (op) {
				case 1:
					Operaciones.menu();
					break;
					
				case 2:
					op = Integer.parseInt(JOptionPane.showInputDialog(null, "\tDesea filtrar el plato por: \n"+
				    "1. Tipo de plato\n"  +
					"2. Numero de calorias\n" +
				    "3. Vegetariano\n"+
					"4. Recomendaci�n"));
					
					//*****************************CASE 2*****************************
					switch (op) {
					case 1:
						System.out.println("1. Platos de entrada\n"+
					                       "2. Platos fuertes\n"+
								            "3. Postres");
						int op1 = sc.nextInt();
						
						if(op1==1) {
							Operaciones.fromText("entrada");
						}else if(op1==2) {
							Operaciones.fromText("fuerte");
						}else if(op1==3) {
							Operaciones.fromText("postre");
						}
						break;
						
					case 2:
						System.out.println("1. Calorias menores a 100\n"+
			                       "2. Calorias entre 100 y 300\n"+
						            "3. Calorias mayores a 300");
				         int op2 = sc.nextInt();
				         
				         if(op2==1) {
								Operaciones.CaloriasMenosCien();;
							}else if(op2==2) {
								Operaciones.CaloriasEntre();;
							}else if(op2==3) {
								Operaciones.CaloriasMayor300();;
							}
						break;
						
					case 3:
						System.out.println("1. Ver platos vegetarianos\n"+
			                               "2. Ver platos no vegetarianos\n");						         
				         int op3 = sc.nextInt();
				         
				         if(op3==1) {
				        	 Operaciones.esVegetariano("si");
				         }else if(op3==2) {
				        	 Operaciones.esVegetariano("no");
				         }
						break;
						
					case 4:
						
						System.out.println( "La recomendaci�n del d�a es: \n");
						Operaciones.recomendacion();
						break;
					}
					//****************************FIN CASE 2***************************
				 
					break;
				case 10:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opci�n incorrecta");
						
				}


	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
	}

} while (op != 10);
		
		
}
}
