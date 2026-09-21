package principal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MaApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/screen/TelaInicial.fxml"));
        primaryStage.setTitle("Projeto Diarias");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
