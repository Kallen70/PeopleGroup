package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable{

    ObservableList<Contact> items = FXCollections. observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField text;


    public void addItem(){
        System.out.println("addItem");
        items.add(new Contact(text.getText()){
        .setText("");

    }

    public void removeItem() {
        System.out.println("removeitem");
        Contact item  = (Contact) list.getSelectionModel().getSelectedItem();
        items.remove(item);
    }





    @Override
    public void initialize(URL location, ResourceBundle resources){
        list.setItems(items);
    }

}
