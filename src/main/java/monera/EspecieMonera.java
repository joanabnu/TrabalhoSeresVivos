package monera;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieMonera extends GeneroMonera {

	Scanner leia = new Scanner(System.in);

	Monera monera = new Monera();
	private String especie;
	private ArrayList<EspecieMonera> especies = new ArrayList<>();

	public void cadastrarMonera() {
		EspecieMonera especieMonera = new EspecieMonera();
		
		System.out.println("Digite o nome popular: ");
		especieMonera.setNomePopular(leia.next());
		System.out.println("Digite o filo: ");
		especieMonera.setFilo(leia.next());
		System.out.println("Digite a classe: ");
		especieMonera.setClasse(leia.next());
		System.out.println("Digite a ordem: ");
		especieMonera.setOrdem(leia.next());
		System.out.println("Digite a família: ");
		especieMonera.setFamilia(leia.next());
		System.out.println("Digite o gênero: ");
		especieMonera.setGenero(leia.next());
		System.out.println("Digite a espécie: ");
		especieMonera.setEspecie(leia.next());

		especies.add(especieMonera);

	}
	
	public void mostrarDados() {
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
		return "\n Reino: Animalia \n Filo: " + getFilo() +"\n Classe: " + getClasse() + "\n Ordem: " + getOrdem() + "\n Família: " + getFamilia() + "\n Espécie: " + getEspecie() + "\n -----";
	}

}
