package plantae;

import java.util.ArrayList;
import java.util.Scanner;

public class EspeciePlantae extends Genero {
	
	private String especie;
	private ArrayList<EspeciePlantae> especiePlantae = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public void cadastrarPlantae() {
		
		System.out.println("Digite o nome popular: ");
		setNomePopular(scan.next());
		
		System.out.println("Digite o filo da planta: ");
		setFilo(scan.next());
		
		System.out.println("Digite a classe da planta: ");
		setClasse(scan.next());
		
		System.out.println("Digite a ordem da planta: ");
		setOrdem(scan.next());
		
		System.out.println("Digite a família da planta: ");
		setFamilia(scan.next());
		
		System.out.println("Digite o gênero planta: ");
		setGenero(scan.next());
		
		System.out.println("Digite a espécie da planta: ");
		setEspecie(scan.next());
		
		especiePlantae.add(this);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
	public void showData() {
		System.out.println("Reino: Plantae");
		System.out.println("Filo: "+getFilo());
		System.out.println("Classe: "+getClasse());
		System.out.println("Ordem: "+getOrdem());
		System.out.println("Familia: "+getFamilia());
		System.out.println("Especie: "+getEspecie());
	}
	

}
