package plantae;

import java.util.ArrayList;
import java.util.Scanner;

import animalia.EspecieAnimalia;

public class EspeciePlantae extends GeneroPlantae {
	
	Scanner leia = new Scanner(System.in);
	
	private String especie;
	private ArrayList<EspeciePlantae> especies = new ArrayList<>();
	
	public void cadastrarPlantae() {
		EspeciePlantae especiePlantae = new EspeciePlantae();
		
		System.out.println("Digite o nome popular: ");
		especiePlantae.setNomePopular(leia.next());
		System.out.println("Digite o filo: ");
		especiePlantae.setFilo(leia.next());
		System.out.println("Digite a classe: ");
		especiePlantae.setClasse(leia.next());
		System.out.println("Digite a ordem: ");
		especiePlantae.setOrdem(leia.next());
		System.out.println("Digite a família: ");
		especiePlantae.setFamilia(leia.next());
		System.out.println("Digite o gênero: ");
		especiePlantae.setGenero(leia.next());
		System.out.println("Digite a espécie: ");
		especiePlantae.setEspecie(leia.next());
		
		especies.add(especiePlantae);	
	}
	
	public void mostrarDados() {
		especies.forEach(System.out::print);
	}

	public ArrayList<EspeciePlantae> getEspeciesPlantae() {
		return especies;
	}


	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	public String toString() {
		return "\n Reino: Plantae \n Filo: " + getFilo() +"\n Classe: " + getClasse() + "\n Ordem: " + getOrdem() + "\n Família: " + getFamilia() + "\n Espécie: " + getEspecie() + "\n -----";
	}

}
