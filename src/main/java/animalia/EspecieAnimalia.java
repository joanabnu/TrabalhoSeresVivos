package animalia;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieAnimalia extends GeneroAnimalia{
	
	Scanner leia = new Scanner(System.in);
	
	Animalia animalia = new Animalia();
	private String especie;
	private ArrayList<EspecieAnimalia> especies = new ArrayList<>();
		
	public void cadastrarAnimalia() {
		System.out.println("Digite o nome popular: ");
		animalia.setNomePopular(leia.next());
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
