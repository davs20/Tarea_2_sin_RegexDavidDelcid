package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.KeyEvent;

public class Controller {


    public Label txtNombre;


    public Label txtEdad;


    public Label txtApellido;


    public TextField txtBuscar;

    public void actionBuscar(ActionEvent actionEvent) {
        try {
            Persona.buscarPorPosicion(txtBuscar.getText());
        } catch (NullPointerException e) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("El Usuario   " + txtBuscar.getText() + "   No Existe");
            alert.show();

        }
    }



}
