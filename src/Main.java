import java.util.*;
import Models.ListaLigada;
import Models.ListaDuplaCircular;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaLigada lista = new ListaLigada();
        ListaDuplaCircular listaDuplaCircular = new ListaDuplaCircular();

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

            System.out.println("======== MENU LISTA CIRCULAR DUPLAMENTE ENCADEADA ========");
            System.out.println("31. Criar uma lista circular duplamente encadeada vazia");
            System.out.println("32. Inserir elemento no início da lista circular duplamente encadeada");
            System.out.println("33. Inserir elemento no fim da lista circular duplamente encadeada");
            System.out.println("34. Inserir elemento em uma posição específica na lista circular duplamente encadeada");
            System.out.println("35. Eliminar elemento de uma posição específica na lista circular duplamente encadeada");
            System.out.println("36. Listar todos os elementos da lista circular duplamente encadeada");
            System.out.println("37. Determinar o comprimento da lista circular duplamente encadeada");
            System.out.println("38. Pesquisar o elemento na lista circular duplamente encadeada");
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
                    int elementoInserir = scanner.nextInt();
                    System.out.print("Digite a posição de inserção: ");
                    int posicaoInserir = scanner.nextInt();
                    lista.inserirPosicao(elementoInserir, posicaoInserir);
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
                case 31:
                    listaDuplaCircular = new ListaDuplaCircular();
                    System.out.println("Lista circular duplamente encadeada criada.");
                    break;
                case 32:
                    System.out.print("Digite o elemento a ser inserido no início da lista circular duplamente encadeada: ");
                    int elementoInicioCirc = scanner.nextInt();
                    listaDuplaCircular.inserirInicio(elementoInicioCirc);
                    break;
                case 33:
                    System.out.print("Digite o elemento a ser inserido no fim da lista circular duplamente encadeada: ");
                    int elementoFimCirc = scanner.nextInt();
                    listaDuplaCircular.inserirFim(elementoFimCirc);
                    break;
                case 34:
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elementoInserirCirc = scanner.nextInt();
                    System.out.print("Digite a posição de inserção: ");
                    int posicaoInserirCirc = scanner.nextInt();
                    listaDuplaCircular.inserirPosicao(elementoInserirCirc, posicaoInserirCirc);
                    break;
                case 35:
                    System.out.print("Digite a posição do elemento a ser removido: ");
                    int posRemocaoCirc = scanner.nextInt();
                    listaDuplaCircular.eliminarPosicao(posRemocaoCirc);
                    break;
                case 36:
                    listaDuplaCircular.listarElementos();
                    break;
                case 37:
                    System.out.println("Comprimento da lista circular duplamente encadeada: " + listaDuplaCircular.comprimentoLista());
                    break;
                case 38:
                    System.out.print("Digite o elemento a ser pesquisado na lista circular duplamente encadeada: ");
                    int elementoPesquisa = scanner.nextInt();
                    int posicaoElementoCirc = listaDuplaCircular.encontrarPosicao(elementoPesquisa);
                    if (posicaoElementoCirc == -1) {
                        System.out.println("Elemento não encontrado na lista.");
                    } else {
                        System.out.println("Posição do elemento na lista: " + posicaoElementoCirc);
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
