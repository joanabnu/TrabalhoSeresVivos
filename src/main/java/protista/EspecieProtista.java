package protista;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieProtista extends GeneroProtista {

	Scanner leia = new Scanner(System.in);

	Protista protista = new Protista();
	private String especie;
	private ArrayList<EspecieProtista> especies = new ArrayList<>();

	public void cadastrarProtista() {
		EspecieProtista especieProtista = new EspecieProtista();
		
		System.out.println("Digite o nome popular: ");
		especieProtista.setNomePopular(leia.next());
		System.out.println("Digite o filo: ");
		especieProtista.setFilo(leia.next());
		System.out.println("Digite a classe: ");
		especieProtista.setClasse(leia.next());
		System.out.println("Digite a ordem: ");
		especieProtista.setOrdem(leia.next());
		System.out.println("Digite a família: ");
		especieProtista.setFamilia(leia.next());
		System.out.println("Digite o gênero: ");
		especieProtista.setGenero(leia.next());
		System.out.println("Digite a espécie: ");
		especieProtista.setEspecie(leia.next());

		especies.add(especieProtista);

	}
	
	public void mostrarDados() {
		System.out.println("Reino Protista");
		especies.forEach(System.out::print);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	public String toString() {
		return "\n Filo: " + getFilo() +"\n Classe: " + getClasse() + "\n Ordem: " + getOrdem() + "\n Família: " + getFamilia() + "\n Espécie: " + getEspecie() + "\n -----";
	}

}
