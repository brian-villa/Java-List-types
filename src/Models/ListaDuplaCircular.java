package Models;

import Models.No;

public class ListaDuplaCircular {
    private No inicio;
    private No fim;

    // Método para criar uma lista circular duplamente encadeada vazia
    public ListaDuplaCircular() {
        inicio = null;
        fim = null;
    }

    // Método para inserir um elemento no início da lista
    public void inserirInicio(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) { // Se a lista estiver vazia
            inicio = novoNo;
            fim = novoNo;
            inicio.setAnterior(fim);
            fim.setProximo(inicio);
        } else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
            inicio.setAnterior(fim);
            fim.setProximo(inicio);
        }
    }

    // Método para inserir um elemento no fim da lista
    public void inserirFim(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) { // Se a lista estiver vazia
            inicio = novoNo;
            fim = novoNo;
            inicio.setAnterior(fim);
            fim.setProximo(inicio);
        } else {
            novoNo.setAnterior(fim);
            fim.setProximo(novoNo);
            fim = novoNo;
            fim.setProximo(inicio);
            inicio.setAnterior(fim);
        }
    }

    // Método para inserir um elemento em uma posição específica da lista
    public void inserirPosicao(int valor, int posicao) {
        if (posicao < 0) { // Verifica se a posição é válida
            System.out.println("Posição inválida.");
        }

        if (posicao == 0) { // Se a posição for 0, chama o método de inserção no início
            inserirInicio(valor);
        }

        No novoNo = new No(valor);
        No temp = inicio;
        for (int i = 0; i < posicao - 1; i++) { // Encontrando o nó na posição anterior à posição desejada
            if (temp == fim) { // Se o nó for o fim da lista, a posição é inválida
                System.out.println("posição inválida.");
            }
            temp = temp.getProximo();
        }
        novoNo.setProximo(temp.getProximo());
        temp.getProximo().setAnterior(novoNo);
        temp.setProximo(novoNo);
        novoNo.setAnterior(temp);
    }

    // Método para eliminar um elemento de uma posição específica da lista
    public void eliminarPosicao(int posicao) {
        if (inicio == null) { // Se a lista estiver vazia
            System.out.println("Lista vazia.");
        }

        if (posicao < 0) { // Verifica se a posição é válida
            System.out.println("Posição inválida.");
        }

        if (posicao == 0) { // Se a posição for 0, o início da lista é atualizado
            inicio = inicio.getProximo();
            inicio.setAnterior(fim);
            fim.setProximo(inicio);
        }

        No temp = inicio;
        for (int i = 0; i < posicao - 1; i++) { // Encontrando o nó na posição anterior à posição desejada
            if (temp == fim || temp.getProximo() == inicio) { // Se o nó for o fim da lista ou o próximo for o início, a posição é inválida
                System.out.println("Posição inválida.");
            }
            temp = temp.getProximo();
        }
        temp.setProximo(temp.getProximo().getProximo()); // O próximo do nó anterior aponta para o próximo do nó a ser removido
        temp.getProximo().setAnterior(temp); // O anterior do próximo do nó a ser removido aponta para o nó anterior
    }

    // Método para listar todos os elementos da lista
    public void listarElementos() {
        if (inicio == null) { // Se a lista estiver vazia
            System.out.println("Lista vazia.");
        }

        No temp = inicio;
        do { // Itera sobre todos os nós da lista
            System.out.print(temp.getValor() + " "); // Imprime o valor do nó
            temp = temp.getProximo(); // Avança para o próximo nó
        } while (temp != inicio);
        System.out.println();
    }

    // Método para determinar o comprimento da lista
    public int comprimentoLista() {
        int comprimento = 0;
        No temp = inicio;
        do { // Itera sobre todos os nós da lista
            comprimento++; // Incrementa o comprimento a cada nó
            temp = temp.getProximo(); // Avança para o próximo nó
        } while (temp != inicio);
        return comprimento;
    }

    // Método para determinar a posição de um elemento na lista
    public int encontrarPosicao(int valor) {
        if (inicio == null) { // Se a lista estiver vazia
            return -1;
        }

        int posicao = 0;
        No temp = inicio;
        do { // Itera sobre todos os nós da lista
            if (temp.getValor() == valor) { // Verifica se o valor do nó é igual ao valor fornecido
                return posicao; // Retorna a posição do nó caso encontre
            }
            posicao++; // Incrementa a posição a cada nó
            temp = temp.getProximo(); // Avança para o próximo nó
        } while (temp != inicio);

        return -1; // Retorna -1 se o elemento não for encontrado na lista
    }
}

