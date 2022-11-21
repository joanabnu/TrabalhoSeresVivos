package plantae;

import java.util.ArrayList;
import java.util.Scanner;

public class EspeciePlantae extends GeneroPlantae {
	
	private String especie;
	private ArrayList<EspeciePlantae> especies = new ArrayList<>();
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
		
		especies.add(this);
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
