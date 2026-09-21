package gerenciadordedados;
import variaveis.Variaveis;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Gerenciadordados {
    public static boolean salvarDados(String nomeArquivo , Variaveis cliente){
        String separador = System.lineSeparator();
        nomeArquivo=Dataeh() + cliente.getTitulo().toLowerCase().replace(cliente.getTitulo()," ")+ ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            File arquivo= new File(nomeArquivo);
            writer.write("Titulo:"+cliente.getTitulo()+separador+"Descricão:"+cliente.getDescricao()+separador+"Valor:"+cliente.getValor());
            if (!arquivo.exists()){
                arquivo.getParentFile().mkdirs();
            }

            return true;
        }
        catch (IOException m ){
            System.out.println("Erro ao salvar: "+m.getMessage());

            return false; }
    }
    public static String Dataeh (){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter dataehora = DateTimeFormatter.ofPattern("dd-MM-yyyy,HH-mm-ss");
        return agora.format(dataehora);
    }
}

