import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class lerlista {
    public static void main(String[] args) {
        List<clima> lista = new ArrayList<>();
        String nomeBase = "base.csv";

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeBase, StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                
                String[] dados = linha.split(",");

                
                clima objClima = new clima(dados[0], dados[1], dados[2], dados[3]);

               
                if (!lista.contains(objClima)) {
                    lista.add(objClima);
                }
            }

            
            for (clima item : lista) {
                System.out.println(item);
            }

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }
    }
}

