package monera;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieMonera extends GeneroMonera {

	Scanner leia = new Scanner(System.in);

	Monera monera = new Monera();
	private String especie;
	private ArrayList<EspecieMonera> especies = new ArrayList<>();

	public void cadastrarMonera() {
		System.out.println("Digite o nome popular: ");
		monera.setNomePopular(leia.next());
		System.out.println("Digite o filo: ");
		setFilo(leia.next());
		System.out.println("Digite a classe: ");
		setClasse(leia.next());
		System.out.println("Digite a ordem: ");
		setOrdem(leia.next());
		System.out.println("Digite a família: ");
		setFamilia(leia.next());
		System.out.println("Digite o gênero: ");
		setGenero(leia.next());
		System.out.println("Digite a espécie: ");
		setEspecie(leia.next());

		especies.add(this);

	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
