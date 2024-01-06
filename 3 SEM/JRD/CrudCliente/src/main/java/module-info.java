module com.example.crudcliente {
     requires javafx.controls;
     requires javafx.fxml;
     requires java.sql;


     opens com.example.crudcliente to javafx.fxml;
     exports com.example.crudcliente;
}