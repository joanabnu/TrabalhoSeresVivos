package fungi;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieFungi extends GeneroFungi {

	Scanner scan = new Scanner(System.in);
	
	Fungi fungi = new Fungi();
	private String especie;	
	private ArrayList<EspecieFungi> especies = new ArrayList<>();
	
	public void cadastrarFungi() {
		EspecieFungi especieFungi = new EspecieFungi();
		
		System.out.println("Digite o nome popular: ");
		especieFungi.setNomePopular(scan.next());
		System.out.println("Digite o filo: ");
		especieFungi.setFilo(scan.next());
		System.out.println("Digite a classe: ");
		especieFungi.setClasse(scan.next());
		System.out.println("Digite a ordem: ");
		especieFungi.setOrdem(scan.next());
		System.out.println("Digite a família: ");
		especieFungi.setFamilia(scan.next());
		System.out.println("Digite o gênero: ");
		especieFungi.setGenero(scan.next());
		System.out.println("Digite a espécie: ");
		especieFungi.setEspecie(scan.next());
		
		especies.add(especieFungi);

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
		return "\n Reino: Fungi \n Filo: " + getFilo() +"\n Classe: " + getClasse() + "\n Ordem: " + getOrdem() + "\n Família: " + getFamilia() + "\n Espécie: " + getEspecie() + "\n -----";
	}

}
