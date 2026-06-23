/*Fazer um programa em Java  para gerenciar figurinhas da copa 2026. O programa deve persistir e identificar figurinhas para troca entre duas pessoas.
A classe básica de ver ser:
Figura:
    nomeSelecao
    numeroFigura
    descricao //nome do jogador, brasao, ou bandeira
    quantidade //opcional, usada nas repetidas
    rara (boolean)
 
O menu deve ser:
Menu
1 - Cadastrar figuras repetidas pessoais (persistidas em arquivo csv figuras_repetidas_pessoais.csv e adicionadas na arvore_repetidas_pessoais)
2 - Listar figuras repetidas pessoais (mostrar a arvore respectiva)
3 - Cadastrar figuras desejadas pessoais (persistidas em arquivo csv figuras_desejadas_pessoais.csv e adicionadas na arvore_desejadas_pessoais)
4 - Listar figuras desejadas pessoais (mostrar a arvore respectiva)
5 - Carregar figuras repetidas OUTRO (carregar o arquivo, arvorer as figuras e mostrar as figuras que dão match com arvore_desejadas_pessoais)
6 - Carregar figuras desejadas OUTRO (carregar o arquivo, arvorer as figuras e mostrar as figuras que dão match com arvore_repetidas_pessoais)
7 - Sair
Opção: 


Toda vez que o programa for iniciado, os arquivos csv pessoais devem ser populados em suas arvores respectivas.}
*/
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Gerenciador {

    static TreeSet<Figurinha> repetidasPessoais = new TreeSet<>();
    static TreeSet<Figurinha> desejadasPessoais = new TreeSet<>();

    static final String ARQ_REPETIDAS = "figuras_repetidas_pessoais.csv";
    static final String ARQ_DESEJADAS = "figuras_desejadas_pessoais.csv";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        carregarArquivo(ARQ_REPETIDAS, repetidasPessoais);
        carregarArquivo(ARQ_DESEJADAS, desejadasPessoais);

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar figurinhas repetidas ");
            System.out.println("2 - Listar figurinhas repetidas ");
            System.out.println("3 - Cadastrar figurinhas desejadas ");
            System.out.println("4 - Listar figurinhas desejadas ");
            System.out.println("5 - Carregar figuras repetidas OUTRO");
            System.out.println("6 - Carregar figuras desejadas OUTRO");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarRepetida();
                    break;
                case 2:
                    listar(repetidasPessoais);
                    break;
                case 3:
                    cadastrarDesejada();
                    break;
                case 4:
                    listar(desejadasPessoais);
                    break;
                case 5:
                    carregarRepetidasOutro();
                    break;
                case 6:
                    carregarDesejadasOutro();
                    break;
                case 7:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    static void cadastrarRepetida() {
        System.out.print("Nome da seleção: ");
        String nomeSelecao = sc.nextLine();

        System.out.print("Número da figurinha: ");
        int numeroFigura = Integer.parseInt(sc.nextLine());

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        System.out.print("É rara? (true/false): ");
        boolean rara = Boolean.parseBoolean(sc.nextLine());

        Figurinha f = new Figurinha(nomeSelecao, numeroFigura, descricao, quantidade, rara);
        repetidasPessoais.add(f);
        salvarFigura(ARQ_REPETIDAS, f);
    }

    static void cadastrarDesejada() {
        System.out.print("Nome da seleção: ");
        String nomeSelecao = sc.nextLine();

        System.out.print("Número da figurinha: ");
        int numeroFigura = Integer.parseInt(sc.nextLine());

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        System.out.print("É rara? (true/false): ");
        boolean rara = Boolean.parseBoolean(sc.nextLine());

        Figurinha f = new Figurinha(nomeSelecao, numeroFigura, descricao, 1, rara);
        desejadasPessoais.add(f);
        salvarFigura(ARQ_DESEJADAS, f);
    }

    static void listar(TreeSet<Figurinha> arvore) {
        if (arvore.isEmpty()) {
            System.out.println("Nenhuma figurinha cadastrada.");
            return;
        }

        for (Figurinha f : arvore) {
            System.out.println(f);
        }
    }

    static void carregarRepetidasOutro() {
        System.out.print("Nome do arquivo CSV do outro: ");
        String nomeArquivo = sc.nextLine();

        TreeSet<Figurinha> repetidasOutro = new TreeSet<>();
        carregarArquivo(nomeArquivo, repetidasOutro);

        System.out.println("\nMatches com suas desejadas:");
        mostrarMatches(repetidasOutro, desejadasPessoais);
    }

    static void carregarDesejadasOutro() {
        System.out.print("Nome do arquivo CSV do outro: ");
        String nomeArquivo = sc.nextLine();

        TreeSet<Figurinha> desejadasOutro = new TreeSet<>();
        carregarArquivo(nomeArquivo, desejadasOutro);

        System.out.println("\nMatches com suas repetidas:");
        mostrarMatches(repetidasPessoais, desejadasOutro);
    }

    static void mostrarMatches(TreeSet<Figurinha> arvore1, TreeSet<Figurinha> arvore2) {
        boolean encontrou = false;

        for (Figurinha f1 : arvore1) {
            for (Figurinha f2 : arvore2) {
                if (f1.numeroFigura == f2.numeroFigura) {
                    System.out.println(f1);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum match encontrado.");
        }
    }

    static void salvarFigura(String nomeArquivo, Figurinha f) {
        try {
            FileWriter fw = new FileWriter(nomeArquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(f.toCSV());
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    static void carregarArquivo(String nomeArquivo, TreeSet<Figurinha> arvore) {
        try {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(",");

                String nomeSelecao = p[0];
                int numeroFigura = Integer.parseInt(p[1]);
                String descricao = p[2];
                int quantidade = Integer.parseInt(p[3]);
                boolean rara = Boolean.parseBoolean(p[4]);

                Figurinha f = new Figurinha(nomeSelecao, numeroFigura, descricao, quantidade, rara);
                arvore.add(f);
            }

            br.close();
        } catch (IOException e) {
            // se o arquivo não existir, apenas ignora
        }
    }
}