package principal;
import variaveis.Variaveis;
import java.util.Scanner;
import gerenciadordedados.Gerenciadordados;

public class Principal
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Variaveis v = new Variaveis();
        Gerenciadordados s = new Gerenciadordados();
        System.out.println("Titulo:");
        v.setTitulo(scan.nextLine());
        System.out.println("Descrição: ");
        v.setDescricao(scan.nextLine());
        System.out.println("Valor: ");
        v.setValor((scan.nextDouble()));
        System.out.println("Descrição Salva: "+v.getDescricao()+ "," +"Valor Salvo: " +v.getValor());
        String nomeArquivo=v.getTitulo().toLowerCase().replace(v.getTitulo(),"")+ s.Dataeh()+".txt";
        boolean sucesso = Gerenciadordados.salvarDados(nomeArquivo,v);
        if (sucesso){
            System.out.println("Arquivo salvo com sucesso! "+nomeArquivo +","+ s.Dataeh());
        }
        else {
            System.out.println("Algo não saiu como o planejado ");
        }
        scan.close();
    }
}
