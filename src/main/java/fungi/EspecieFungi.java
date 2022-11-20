package fungi;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecieFungi extends GeneroFungi {

	Scanner scan = new Scanner(System.in);
	
	Fungi fungi = new Fungi();
	private String especie;	
	private ArrayList<EspecieFungi> especies = new ArrayList<>();
	
	public void cadastrarFungi() {
		System.out.println("Digite o nome popular: ");
		fungi.setNomePopular(scan.next());
		System.out.println("Digite o filo: ");
		setFilo(scan.next());
		System.out.println("Digite a classe: ");
		setClasse(scan.next());
		System.out.println("Digite a ordem: ");
		setOrdem(scan.next());
		System.out.println("Digite a família: ");
		setFamilia(scan.next());
		System.out.println("Digite o gênero: ");
		setGenero(scan.next());
		System.out.println("Digite a espécie: ");
		setEspecie(scan.next());
		
		especies.add(this);

	}
	
	public String getEspecie() {
		return especie;
	}
	
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
