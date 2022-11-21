package main;

import animalia.*;
import monera.*;
import protista.*;
import plantae.*;
import fungi.*;

public class SerVivo {
	
	EspecieAnimalia especieAnimalia = new EspecieAnimalia();
	EspeciePlantae especiePlantae = new EspeciePlantae();
	EspecieMonera especieMonera = new EspecieMonera();
	EspecieProtista especieProtista = new EspecieProtista();
	EspecieFungi especieFungi = new EspecieFungi();
	
	public void cadastrarSerVivo(String opcao) {
		
		if(opcao == "1") especieAnimalia.cadastrarAnimalia();
		if(opcao == "2") especiePlantae.cadastrarPlantae();
		if(opcao == "3") especieMonera.cadastrarMonera();
		if(opcao == "4") especieProtista.cadastrarProtista();
		if(opcao == "5") especieFungi.cadastrarFungi();
	}
	
	public void mostrarDados(String opcao) {
		if(opcao == "1") especieAnimalia.mostrarDados();
		if(opcao == "2") especiePlantae.mostrarDados();
		if(opcao == "3") especieMonera.mostrarDados();
		if(opcao == "4") especieProtista.mostrarDados();
		if(opcao == "5") especieFungi.mostrarDados();
		
	}
}
