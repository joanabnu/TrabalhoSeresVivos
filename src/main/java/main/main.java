package main;

import java.util.Scanner;

import animalia.EspecieAnimalia;
import plantae.EspeciePlantae;
import monera.EspecieMonera;
import protista.EspecieProtista;

public class main {
  public static void main(String[] args) {
    
	Scanner leia = new Scanner(System.in);
    SerVivo serVivo = new SerVivo();
    String opcao;

    do {
	    System.out.println("O que você deseja cadastrar, \n 1 - animal \n 2 - monera \n 3 - protista: ");
	    int opcao2 = leia.nextInt();
	
	    switch (opcao2) {
	      case 1:
	    	  serVivo.cadastrarSerVivo("1");
	        break;
	      case 2:
	        serVivo.cadastrarSerVivo("2");
	        break;
	      case 3:
	        serVivo.cadastrarSerVivo("3");
	        break;
	      default:
	        System.out.println("Opção inválida");
	        break;
	    }
	    
	    System.out.println("Deseja continuar? ");
	    opcao = leia.next();
    }while(opcao.equalsIgnoreCase("sim"));
  }
}
