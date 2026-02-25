import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.event.ListDataEvent;

public class Exemplolista1{
    public static void main(String[] args){
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        listaNomes.add("Guilherme");
        listaNomes.add("Pedro");
        listaNomes.add("Maria");
        

        System.out.println(listaNomes);

        if(listaNomes.size() != 0) {
            System.out.print("Digite um nome: ");
            String nome = teclado.nextLine();
            listaNomes.remove(nome);
        }else{
            System.out.println("Nomne não localizado.");
        }    
            
            System.out.println("Total de elementos: "+listaNomes.size());
            System.out.println(listaNomes);

        }
    }
