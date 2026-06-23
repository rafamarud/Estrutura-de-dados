package Grafos.Desafio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MapaCidades {

    static Scanner teclado = new Scanner(System.in);

    static ArrayList<Cidade> cidades = new ArrayList<>();
    static HashMap<String, ArrayList<Estrada>> grafo = new HashMap<>();

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar cidade");
            System.out.println("2 - Cadastrar estrada");
            System.out.println("3 - Listar cidades");
            System.out.println("4 - Consultar rota entre cidades");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {
                cadastrarCidade();

            } else if (opcao == 2) {
                cadastrarEstrada();

            } else if (opcao == 3) {
                listarCidades();

            } else if (opcao == 4) {
                consultarRota();

            } else if (opcao == 5) {
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    // Cadastra uma cidade no grafo
    static void cadastrarCidade() {
        System.out.print("Nome da cidade: ");
        String nome = teclado.nextLine();

        if (grafo.containsKey(nome)) {
            System.out.println("Cidade já cadastrada.");
            return;
        }

        Cidade cidade = new Cidade(nome);
        cidades.add(cidade);
        grafo.put(nome, new ArrayList<Estrada>());

        System.out.println("Cidade cadastrada com sucesso.");
    }

    // Cadastra uma estrada entre duas cidades
    static void cadastrarEstrada() {
        System.out.print("Cidade de origem: ");
        String origem = teclado.nextLine();

        System.out.print("Cidade de destino: ");
        String destino = teclado.nextLine();

        if (!grafo.containsKey(origem) || !grafo.containsKey(destino)) {
            System.out.println("Uma ou ambas as cidades não existem.");
            return;
        }

        grafo.get(origem).add(new Estrada(destino));
        grafo.get(destino).add(new Estrada(origem));

        System.out.println("Estrada cadastrada com sucesso.");
    }

    // Lista todas as cidades cadastradas
    static void listarCidades() {
        if (cidades.isEmpty()) {
            System.out.println("Nenhuma cidade cadastrada.");
            return;
        }

        System.out.println("Cidades cadastradas:");
        for (Cidade c : cidades) {
            System.out.println("- " + c.nome);
        }
    }

    // Consulta uma rota entre duas cidades
    static void consultarRota() {
        System.out.print("Cidade de origem: ");
        String origem = teclado.nextLine();

        System.out.print("Cidade de destino: ");
        String destino = teclado.nextLine();

        if (!grafo.containsKey(origem) || !grafo.containsKey(destino)) {
            System.out.println("Uma ou ambas as cidades não existem.");
            return;
        }

        ArrayList<String> rota = buscarRota(origem, destino);

        if (rota == null) {
            System.out.println("Não existe rota entre as cidades.");
        } else {
            System.out.println("Rota encontrada:");
            for (int i = 0; i < rota.size(); i++) {
                if (i < rota.size() - 1) {
                    System.out.print(rota.get(i) + " -> ");
                } else {
                    System.out.println(rota.get(i));
                }
            }
        }
    }

    // Busca uma rota entre duas cidades usando largura
    static ArrayList<String> buscarRota(String origem, String destino) {
        Queue<String> fila = new LinkedList<>();
        HashSet<String> visitadas = new HashSet<>();
        HashMap<String, String> anterior = new HashMap<>();

        fila.add(origem);
        visitadas.add(origem);

        while (!fila.isEmpty()) {
            String atual = fila.poll();

            if (atual.equals(destino)) {
                break;
            }

            ArrayList<Estrada> vizinhos = grafo.get(atual);

            for (Estrada e : vizinhos) {
                String proximaCidade = e.destino;

                if (!visitadas.contains(proximaCidade)) {
                    visitadas.add(proximaCidade);
                    anterior.put(proximaCidade, atual);
                    fila.add(proximaCidade);
                }
            }
        }

        if (!visitadas.contains(destino)) {
            return null;
        }

        ArrayList<String> caminho = new ArrayList<>();
        String atual = destino;

        while (atual != null) {
            caminho.add(0, atual);
            atual = anterior.get(atual);
        }

        return caminho;
    }
}