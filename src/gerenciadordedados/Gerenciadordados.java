package gerenciadordedados;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import variaveis.Variaveis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Gerenciadordados {
    public static boolean salvarDados(String nomeArquivo , Variaveis cliente){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("Descrição" + cliente.getDescricao());
            writer.write("Valor:" + cliente.getValor());

            return true;
        }
        catch (IOException m ){
            System.out.println("Erro ao salvar: "+m.getMessage());

            return false; }
    }
    public static String Dataeh (){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter dataehora = DateTimeFormatter.ofPattern("dd-MM-yyyy,HH:mm:ss");
        return agora.format(dataehora);
    }
}

