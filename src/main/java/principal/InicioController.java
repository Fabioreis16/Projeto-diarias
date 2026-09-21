package principal;

import javafx.fxml.FXML;

import static navegador.Navegador.trocaTela;

public class InicioController {
    @FXML
    public void handleCadastrar(javafx.event.ActionEvent event) {
        trocaTela("/screen/TeladeCadastro2.fxml", "Cadastro de diarias", event);
    }
    @FXML
    public void handleConsulta(javafx.event.ActionEvent event){
        trocaTela("/screen/TeladeConsulta2.fxml","Consulta", event);
    }





}