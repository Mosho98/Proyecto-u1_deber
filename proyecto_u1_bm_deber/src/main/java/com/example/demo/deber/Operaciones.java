package com.example.demo.deber;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Operaciones {
static List<Productos> catalogo = Arrays.asList(
		new Productos(Productos.tipo.entrada, "Ceviche de camar�n y mango", 99, Productos.vegetariano.si),
		new Productos(Productos.tipo.entrada, "Arepas de chicharr�n.", 544, Productos.vegetariano.no),
		new Productos(Productos.tipo.fuerte, "Sopa de Mariscos", 238, Productos.vegetariano.si),
		new Productos(Productos.tipo.fuerte, "Asado", 265, Productos.vegetariano.no),
		new Productos(Productos.tipo.postre, "Pie de limon", 280, Productos.vegetariano.si),
		new Productos(Productos.tipo.postre, "Pastel de chocolate", 371, Productos.vegetariano.si),
		new Productos(Productos.tipo.fuerte, "Bandera", 250, Productos.vegetariano.si)
		);


public static void menu() {
	catalogo.stream()
	.forEach(System.out::println);
}


public static void fromText(String text) {
	catalogo.stream()
      .filter(b-> b.getTipoComida().name().contains(text))
      .forEach(System.out::println);
}


public static void CaloriasMenosCien() {
	catalogo.stream()
	.filter(b-> b.getCalorias()<100)
	.forEach(System.out::println);
}

public static void CaloriasEntre() {
	catalogo.stream()
	.filter(b-> b.getCalorias()>100 && b.getCalorias()<300)
	.forEach(System.out::println);
}

public static void CaloriasMayor300() {
	catalogo.stream()
	.filter(b-> b.getCalorias()>300)
	.forEach(System.out::println);
}

public static void esVegetariano(String text) {
	catalogo.stream()
      .filter(b-> b.getEsVegetariano().name().contains(text))
      .forEach(System.out::println);
}

public static void recomendacion() {
	if(catalogo.stream().anyMatch((b -> b.getCalorias()>100 && b.getCalorias()<300))){
		
     catalogo.stream()
	.filter(b-> b.getEsVegetariano().name().contains("si"))
	.limit(2)
	.map(catalogo -> "Nombre del plato: " + catalogo.getNombre()+ " \n"+ "N�mero de calor�as ------>" + catalogo.getCalorias() + "\n")
	.forEach(System.out::println);
     
	}else {
		JOptionPane.showMessageDialog(null, "No tenemos ningun plato con ese filtro", " >> ERROR<<", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
}
