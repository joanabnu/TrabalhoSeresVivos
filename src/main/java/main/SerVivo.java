package main;

import animalia.*;
import monera.*;
import protista.*;

public class SerVivo {
	
	public void cadastrarSerVivo(String opcao) {
		EspecieAnimalia especieAnimalia = new EspecieAnimalia();
		EspecieMonera especieMonera = new EspecieMonera();
		EspecieProtista especieProtista = new EspecieProtista();
		
		if(opcao.equalsIgnoreCase("1")) especieAnimalia.cadastrarAnimalia();
		if(opcao == "2") especieMonera.cadastrarMonera();
		if(opcao == "3") especieProtista.cadastrarProtista();
	}
}
