import java.util.ArrayList;
import java.util.Scanner;

public class Princip{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<glicemi> lista = new ArrayList<>();
        glicemi obj = new glicemi(191,"11/03/2026", "8:00");

        //alternativa 1
        lista.add( obj );

        //alternativa 2
        lista.add( new glicemi (98, "11/03/2026" , "11:00"));

        //alternativa 3
        for(int i = 0; i < 3; i++){
            System.out.print("Valor glicemia: ");
            int valor = teclado.nextInt();
            teclado.nextLine();


            System.out.print("Data [dd/mm/aaaa]: ");
            String data = teclado.nextLine();

            System.out.print("Hora [hh/mm]: ");
            String hora = teclado.nextLine();

            lista.add(new glicemi(valor, data, hora));
        }

        //exibir - alternativa 1
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).valor + " - " + lista.get(i).data + " - " + lista.get(i).hora);
        }

        //exibir - alternativa 2
        for(glicemi item : lista){
            System.out.println(item.valor + " - " + item.data + " - " + item.hora);
        }
    }
}
