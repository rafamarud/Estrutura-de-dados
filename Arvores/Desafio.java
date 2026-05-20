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
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class Desafio {
    public static void main(String args[]){
        TreeSet<Figurinhas> arvore = new TreeSet<>();
        String nomeArquivoPessoal = "ArquivoPessoal.csv";

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivoPessoal, StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                
                String[] dados = linha.split(",");

                
                Figurinhas ObjFigurinhas = new Figurinhas(dados[0], dados[1], dados[2], dados[3], dados[4]);
            }
        int opcao = 7;
        while (opcap != 7){
            switch(opcao) {
                //1 - Cadastrar figuras repetidas pessoais (persistidas em arquivo csv figuras_repetidas_pessoais.csv e adicionadas na arvore_repetidas_pessoais)
                case 1:
                break;

                case 2:
                //2 - Listar figuras repetidas pessoais (mostrar a arvore respectiva)
                break;

                case 3:
                //3 - Cadastrar figuras desejadas pessoais (persistidas em arquivo csv figuras_desejadas_pessoais.csv e adicionadas na arvore_desejadas_pessoais)
                break;

                case 4:
                //4 - Listar figuras desejadas pessoais (mostrar a arvore respectiva) 
                break;

                case 5:
                //5 - Carregar figuras repetidas OUTRO (carregar o arquivo, arvorer as figuras e mostrar as figuras que dão match com arvore_desejadas_pessoais)
                break;

                case 6:
                //6 - Carregar figuras desejadas OUTRO (carregar o arquivo, arvorer as figuras e mostrar as figuras que dão match com arvore_repetidas_pessoais)
                break;

                case 7:
                //7 - Sair
                break;
                }   
            }
        }
    }
}
