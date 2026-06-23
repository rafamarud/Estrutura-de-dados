import java.util.ArrayList;

public class Splitar {
    
    public static void main(String[] args) {
        ArrayList<glicemi> lista = new ArrayList<>();
        String linha = "120,11/03/2026,9:00";

        String vetorLinha[] = linha.split(",");

        glicemi obj = new glicemi(Integer.parseInt(vetorLinha[0]), vetorLinha[1],vetorLinha[2]);

        System.out.println(obj.valor + " - " + obj.data + " - " + obj.hora);

        if (lista.contains(obj)){
            lista.add(obj);
        }

        for (glicemi item : lista){
             System.out.println(obj.valor + " - " + obj.data + " - " + obj.hora);

        }
    }
}

