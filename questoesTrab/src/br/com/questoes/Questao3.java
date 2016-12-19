package br.com.questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		String palavra = "";
		int verificacoes = 0;
		List<String> indices = new ArrayList<>();
		
		
		System.out.println("Insira a palavra a ser verificada");
		Scanner scPalavra = new Scanner(System.in); 
		palavra = scPalavra.next();
		

		System.out.println("Insira a quantidade de verificações");
		Scanner scVerificacoes = new Scanner(System.in); 
		verificacoes = scVerificacoes.nextInt();
		
		for (int i = 0; i < verificacoes; i++) {
			Scanner scIndice = new Scanner(System.in); 
			String indice = "";
			System.out.println("insira os indices separados por espaço ex: 1 2 4 4");
			indice = scIndice.nextLine();
			indices.add(indice);
			
		}
		
		System.out.println(palavra);
		System.out.println(String.valueOf(verificacoes));
		for (String item : indices) {
			System.out.println(String.valueOf(item));
		}
		
		
		for (int i = 0; i < verificacoes; i++) {
			String validacao = indices.get(i).toString();
			String[] indice =  validacao.split(" ");
			String palavraInvertida = "";
			
			String intervalo = palavra.substring(Integer.valueOf(indice[0]) - 1, 
					Integer.valueOf(indice[1]));
			
			StringBuffer intervaloInvertido = new StringBuffer(intervalo);
			intervaloInvertido.reverse();
			
			palavraInvertida = palavra.replace(intervalo, intervaloInvertido);
			
			
			String palavraVerificarPalindromo = palavra.substring(Integer.valueOf(indice[2]) - 1, 
					Integer.valueOf(indice[3]));
			String  x = "";
			
			for (int j = palavraVerificarPalindromo.length(); j > 0; j--) {
				x += palavraVerificarPalindromo.charAt(j - 1);
			}
			
			if(x.equals(palavraVerificarPalindromo)){
	            System.out.println("yes");
	        }else{
	            System.out.println("no");;
	        }
	       
		}
		
	}

}
