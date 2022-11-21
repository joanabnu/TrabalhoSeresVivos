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
	    System.out.println("O que você deseja cadastrar, \n 1 - Animal \n 2- Planta \n 3 - Monera \n 4 - Protista \n 5 - Fungi: ");
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
	      case 4:
	        serVivo.cadastrarSerVivo("4");
	        break;
	      case 5:
		    serVivo.cadastrarSerVivo("5");
		    break;
	      default:
	        System.out.println("Opção inválida");
	        break;
	    }
	    
	    System.out.println("Deseja continuar? ");
	    opcao = leia.next();
    }while(opcao.equalsIgnoreCase("sim"));
    
    System.out.println("Deseja ver os dados? ");
    opcao = leia.next();
    
    if(opcao.equalsIgnoreCase("sim")) {
    	System.out.println("Selecione o reino que você deseja listar: ");
    	System.out.println("\n 1 - Animal \n 2- Planta \n 3 - Monera \n 4 - Protista \n 5 - Fungi:");
    	int opcao2 = leia.nextInt();
    	
    	switch (opcao2) {
	      case 1:
	    	serVivo.mostrarDados("1");
	        break;
	      case 2:
	    	serVivo.mostrarDados("2");
	    	break;
	      case 3:
	        serVivo.mostrarDados("3");
	        break;
	      case 4:
	        serVivo.mostrarDados("4");
	        break;
	      case 5:
		    serVivo.mostrarDados("5");
		    break;
	      default:
	        System.out.println("Opção inválida");
	        break;
	    }
    }
  }
}
