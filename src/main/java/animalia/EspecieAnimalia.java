package animalia;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieAnimalia extends GeneroAnimalia{
	
	Scanner leia = new Scanner(System.in);
	
	Animalia animalia = new Animalia();
	private String especie;
	private ArrayList<EspecieAnimalia> especies = new ArrayList<>();
		
	public void cadastrarAnimalia() {
		EspecieAnimalia especieAnimalia = new EspecieAnimalia();
		
		System.out.println("Digite o nome popular: ");
		especieAnimalia.setNomePopular(leia.next());
		System.out.println("Digite o filo: ");
		especieAnimalia.setFilo(leia.next());
		System.out.println("Digite a classe: ");
		especieAnimalia.setClasse(leia.next());
		System.out.println("Digite a ordem: ");
		especieAnimalia.setOrdem(leia.next());
		System.out.println("Digite a família: ");
		especieAnimalia.setFamilia(leia.next());
		System.out.println("Digite o gênero: ");
		especieAnimalia.setGenero(leia.next());
		System.out.println("Digite a espécie: ");
		especieAnimalia.setEspecie(leia.next());
		
		especies.add(especieAnimalia);
	}
	
	public void mostrarDados() {
		System.out.println("Reino Animalia");
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
