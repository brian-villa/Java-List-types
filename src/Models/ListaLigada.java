package Models;
import java.util.*;

public class ListaLigada {

    private LinkedList<Integer> lista; //lista ligada para armazenar os elementos;

    public void MinhaListaLigada() { //criando uma nova lista ligada vazia
        lista = new LinkedList<>();
    }

    public void inserirInicio(int valor) {
        lista.addFirst(valor); //adiciona um valor inteiro no inicio da lista;
    }

    public void inserirFim(int valor) {
        lista.addLast(valor);
    }

    public void inserirPosicao(int valor, int posicao) {
        if(posicao < 0 || posicao > lista.size()) { //verifica se a posição é valida
            System.out.println("Posição inválida");
        }
        lista.add(posicao, valor); // Adiciona o elemento na posição específica da lista
    }

    public void eliminarPosicao(int posicao) {
        if(posicao < 0 || posicao >= lista.size()) { //Verifica se a posicao é valida
            System.out.println("Posição inválida");
        }
        lista.remove(posicao);
    }

    public void listarElementos() {
        for(Integer elemento : lista) { //itera sobre todos os elementos da lista (forEach);
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public int comprimentoLista() {
        return lista.size(); // retorna o comprimento da lista;
    }

    public int encontrarPosicao(int valor) {
        return lista.indexOf(valor); //Retorna a posicao do elemento na lista;
    }
}
