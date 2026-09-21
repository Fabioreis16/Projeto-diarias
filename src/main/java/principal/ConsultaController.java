package principal;
import static navegador.Navegador.trocaTela;
import javafx.fxml.FXML;

public class ConsultaController {
    @FXML
    public void handleVoltar(javafx.event.ActionEvent event) {
        trocaTela("/screen/TelaInicial.fxml", "Cadastro de diarias", event);
    }
}