package br.com.questoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Questao1 {

	public static void main(String[] args) {
		List<Integer> listaEntrada = new ArrayList<>();
		//10 20 20 10 10 30 50 10 20
		listaEntrada.add(10);
		listaEntrada.add(20);
		listaEntrada.add(20);
		listaEntrada.add(10);
		listaEntrada.add(10);
		listaEntrada.add(30);
		listaEntrada.add(50);
		listaEntrada.add(10);
		listaEntrada.add(20);
		calcularMaximoPares(9, listaEntrada);

	}

	public static void calcularMaximoPares(int n, List<Integer> listaNumerosMeias){

		if(n < 1 || n > 100){
			System.out.println("quantidade de meias inválido - 1 <= n <= 100");			
		}
		else if(listaNumerosMeias.size() < 1 || listaNumerosMeias.size()  > 100){
			System.out.println("quantidade de meias inválido -  1 <= ci <= 100");
		}
		else{
		     System.out.println(String.valueOf(n));
		     System.out.println(listaNumerosMeias);
		     int contador = 0;
		     int totalPares = 0;
		     HashMap<Integer, Integer> meias = new HashMap<>();
		     
		   for (Integer item : listaNumerosMeias) {
			   contador = 0;
			  for (int i = 0; i < listaNumerosMeias.size(); i++) {
				 
				  if(item == listaNumerosMeias.get(i)){
						contador++;  
				  }	
			 }
			 meias.put(item, contador);
		   }
		   for (Integer meia : meias.values()) {
				if(meia % 2 == 0 ){
					totalPares = totalPares + (meia / 2);
				}else if(meia >= 3 && meia % 2 != 0 ){
					meia = meia - 1;
					totalPares = totalPares + (meia / 2);
				}
			}
		    System.out.println(String.valueOf(totalPares));
			
		}
	}
}
