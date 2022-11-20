package main;

import animalia.*;
import monera.*;
import protista.*;
import plantae.*;

public class SerVivo {
	
	public void cadastrarSerVivo(String opcao) {
		EspecieAnimalia especieAnimalia = new EspecieAnimalia();
		EspeciePlantae especiePlantae = new EspeciePlantae();
		EspecieMonera especieMonera = new EspecieMonera();
		EspecieProtista especieProtista = new EspecieProtista();
		
		if(opcao == "1") especieAnimalia.cadastrarAnimalia();
		if(opcao == "2") especiePlantae.cadastrarPlantae();
		if(opcao == "3") especieMonera.cadastrarMonera();
		if(opcao == "4") especieProtista.cadastrarProtista();
	}
}
