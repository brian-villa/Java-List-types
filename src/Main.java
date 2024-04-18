import java.util.*;
import Models.ListaLigada;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaLigada lista = new ListaLigada();

        int opcao;

        do {
            //Exibindo Menu
            System.out.println("======== MENU LISTA LIGADA SIMPLES ========");
            System.out.println("1. Criar uma lista ligada simples vazia");
            System.out.println("2. Inserir elemento no início da lista");
            System.out.println("3. Inserir elemento no fim da lista");
            System.out.println("4. Inserir elemento em uma posição específica");
            System.out.println("5. Eliminar elemento de uma posição específica");
            System.out.println("6. Listar todos os elementos da lista");
            System.out.println("7. Determinar o comprimento da lista");
            System.out.println("8. Determinar a posição do elemento na lista");
            System.out.println("0. Terminar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lista.MinhaListaLigada();
                    System.out.println("Lista ligada simples criada.");
                    break;
                case 2:
                    System.out.print("Digite o elemento a ser inserido no início da lista: ");
                    int elementoInicio = scanner.nextInt();
                    lista.inserirInicio(elementoInicio);
                    break;
                case 3:
                    System.out.print("Digite o elemento a ser inserido no fim da lista: ");
                    int elementoFim = scanner.nextInt();
                    lista.inserirFim(elementoFim);
                    break;
                case 4:
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elemento = scanner.nextInt();
                    System.out.print("Digite a posição de inserção: ");
                    int posicao = scanner.nextInt();
                    lista.inserirPosicao(elemento, posicao);
                    break;
                case 5:
                    System.out.print("Digite a posição do elemento a ser removido: ");
                    int posRemocao = scanner.nextInt();
                    lista.eliminarPosicao(posRemocao);
                    break;
                case 6:
                    lista.listarElementos();
                    break;
                case 7:
                    System.out.println("Comprimento da lista: " + lista.comprimentoLista());
                    break;
                case 8:
                    System.out.print("Digite o elemento a ser procurado na lista: ");
                    int elementoProcurado = scanner.nextInt();
                    int posicaoElemento = lista.encontrarPosicao(elementoProcurado);
                    if (posicaoElemento == -1) {
                        System.out.println("Elemento não encontrado na lista.");
                    } else {
                        System.out.println("Posição do elemento na lista: " + posicaoElemento);
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}