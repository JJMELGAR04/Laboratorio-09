package org.example.labo08.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;


public class HelloController {

    @FXML
    private RadioButton rbEmpleado;

    @FXML
    private RadioButton rbEstudiante;

    @FXML
    private RadioButton rbEfectivo;

    @FXML
    private RadioButton rbTarjeta;

    @FXML
    private TextField txtfNombre;

    @FXML
    public void btnLimpiarAction(){
        if(rbEmpleado.isSelected()){
            rbEmpleado.setSelected(false);
        }else if (rbEstudiante.isSelected()){
            rbEstudiante.setSelected(false);
        }

        if(rbEfectivo.isSelected()){
            rbEfectivo.setSelected(false);
        } else if (rbTarjeta.isSelected()) {
            rbTarjeta.setSelected(false);
        }

        txtfNombre.setText("");
    }

    @FXML
    public void btnComprarAction(){
        String s = "";
        if(rbEmpleado.isSelected()){
            s = "Empleado";
        }else if (rbEstudiante.isSelected()){
            s = "Estudiante";
        }

        String p = "";
        if(rbEfectivo.isSelected()){
            p = "Efectivo";
        } else if (rbTarjeta.isSelected()) {
            p = "Tarjeta";
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Nombre: " + txtfNombre.getText() +"\n" +
                             "Tipo Cliente: " + s + "\n" +
                             "Tipo Pago: " + p + "\n" +
                             "Gracias por tu compra");
        alert.showAndWait();
    }




}