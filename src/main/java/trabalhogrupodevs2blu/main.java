package trabalhogrupodevs2blu;

import animalia.*;
import java.util.Scanner;
import monera.EspecieMonera;
import protista.EspecieProtista;

public class main {
  public static void main(String[] args) {

    Especie animal = new Especie();
    EspecieMonera monera = new EspecieMonera();
    EspecieProtista protista = new EspecieProtista();

    // make a case asking if user wants to register a new animal, monera or protista

    // if user wants to register a new animal, call animal.cadastrarAnimal()
    // if user wants to register a new monera, call monera.cadastrarMonera()
    // if user wants to register a new protista, call protista.cadastrarProtista()

    System.out.println("O que você deseja cadastrar, \n 1 - animal \n 2 - monera \n 3 - protista: ");
    // use scanner to get the user's choice
    Scanner leia = new Scanner(System.in);
    int opcao = leia.nextInt();

    switch (opcao) {
      case 1:
        animal.cadastrarAnimal();
        break;
      case 2:
        monera.cadastrarMonera();
        break;
      case 3:
        protista.cadastrarProtista();
        break;
      default:
        System.out.println("Opção inválida");
        break;
    }

  }
}
