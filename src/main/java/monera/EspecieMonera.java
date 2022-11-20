package monera;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieMonera extends ClasseMonera {

	Scanner leia = new Scanner(System.in);

	private String especie;
	private ArrayList<EspecieMonera> especies = new ArrayList<>();

	public void cadastrarMonera() {
		System.out.println("Digite o filo: ");
		setFilo(leia.next());
		System.out.println("Digite a classe: ");
		setClasse(leia.next());	
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
