package navegador;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Navegador {
    public static void trocaTela(String fxmlPath, String titulo, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Navegador.class.getResource(fxmlPath));
            Parent root = loader.load();
            Button btn = (Button) event.getSource();
            Stage stage = (Stage) btn.getScene().getWindow();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.err.println("Algo não saiu como o planejado" + fxmlPath);
            e.printStackTrace();
        }
    }
}
