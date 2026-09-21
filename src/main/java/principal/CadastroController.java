package principal;

import gerenciadordedados.Gerenciadordados;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import variaveis.Variaveis;
import static gerenciadordedados.Gerenciadordados.Dataeh;
import static navegador.Navegador.trocaTela;
public class CadastroController extends InicioController {
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextArea txtDescricao;
    @FXML
    private RadioButton Meiadiaria;

    @FXML
    private RadioButton Diaria;

    @FXML
    public void handleVoltar(javafx.event.ActionEvent event) {
        trocaTela("/screen/TelaInicial.fxml", "Cadastro de diarias", event);

    }

    @FXML
    public void handleSalvar(javafx.event.ActionEvent event) {
        trocaTela("/screen/TelaInicial.fxml","Inicio",event);
        try {
            Variaveis v = new Variaveis();

            v.setTitulo(txtTitulo.getText());
            v.setDescricao(txtDescricao.getText());
            if (Meiadiaria.isSelected()){
               v.setValor("Meia Diaria");
            }
            else if (Diaria.isSelected()){
                v.setValor("Diaria inteira");
            }

            Gerenciadordados s = new Gerenciadordados();
            String nomeArquivo = v.getTitulo().toLowerCase() + Dataeh() + ".txt";
            boolean sucesso = Gerenciadordados.salvarDados(nomeArquivo,v);

            if (sucesso) {
                System.out.println("Arquivo salvo com sucesso! ");
                txtTitulo.clear();
                txtDescricao.clear();
            } else {
                System.out.println("Algo não saiu como o planejado ");
            }
        } catch (NumberFormatException e) {
            System.err.println("Erro,algo não saiu como planejado");
        }
    }
}
