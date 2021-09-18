package FundamentosJava.SentencasControle;

import javafx.application.Application;
import javafx.stage.Stage;

public class NumeroPorExtenso extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int numero = 2;
        String numeroExtenso = "Numero por extenso: ";
        switch (numero)
        {
            case 1:
                numeroExtenso += "um";
                break;
            case 2:
                numeroExtenso += "dois";
                break;
            case 3:
                numeroExtenso += "tres";
                break;
            default:
                numeroExtenso += "Numero desconhecido";


        }

        System.out.println(numeroExtenso);


    }
}
