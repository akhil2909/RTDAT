/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.controllers;

import com.banking.utils.ExcelReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author AV00373090
 */
public class FieldController implements Initializable {

    @FXML
    private AnchorPane JFXAnchorPane;
//    @FXML
//    private Label titleLable;
//    @FXML
//    private Button backButton;
    @FXML
    private TreeView<?> treeActions;
    @FXML
    private GridPane formGrid;
    @FXML
    private TableView<FieldsController.TableCols> fieldsTable;
    @FXML
    private TableColumn<?, ?> fieldNameCol;
    @FXML
    private TableColumn<?, ?> fieldTypeCol;

    ObservableList olist = FXCollections.observableArrayList();
    @FXML
    private Label statusLabel;

    public HBox tableHBox;
    public static String formSelected;
    private boolean noForm = false;
    private String moduleName;
    @FXML
    private TableColumn<FieldsController.TableCols, Boolean> combinationsCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

//        moduleName = ExcelReader.getModuleSelected();
        AnchorPane.setTopAnchor(JFXAnchorPane, 0.0);
        AnchorPane.setBottomAnchor(JFXAnchorPane, 0.0);
        AnchorPane.setLeftAnchor(JFXAnchorPane, 0.0);
        AnchorPane.setRightAnchor(JFXAnchorPane, 0.0);
//         TreeItem rootItem = new TreeItem<> ("Actions");
//        rootItem.setExpanded(true);
//        treeActions.setShowRoot(false);
//        treeActions.setRoot(rootItem);
//        processActionsTree(rootItem);
//        fieldActionsTree(rootItem);
//        excelActionsTree(rootItem);        
        
        System.out.println("GHGJHGHAh");
        
        

    }

    private void processActionsTree(TreeItem rootItem) {
        
        
        
    }

    private void fieldActionsTree(TreeItem rootItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void excelActionsTree(TreeItem rootItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
