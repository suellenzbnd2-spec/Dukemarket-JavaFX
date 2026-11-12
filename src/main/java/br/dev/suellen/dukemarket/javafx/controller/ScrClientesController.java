/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.dev.suellen.dukemarket.javafx.controller;

import br.dev.suellen.dukemarket.javafx.DAO.ClienteDAO;
import br.dev.suellen.dukemarket.javafx.model.Cliente;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author sesi2dib
 */
public class ScrClientesController implements Initializable {


    @FXML
    TableView <Cliente> tblCliente;

    @FXML
    TableColumn <Cliente, Integer> tcoId;

    @FXML
    TableColumn <Cliente, Double> tcoCpf;

    @FXML
    TableColumn <Cliente, String> tcoEndereco;

    @FXML
    TableColumn <Cliente, String> tcoNome;

    @FXML
    TableColumn <Cliente, String> tcoUf;

    @FXML
    TableColumn <Cliente, String> tcoCidade;

    @FXML
    TableColumn <Cliente, Calendar> tcoDataCadastro;

    @FXML
    TextField txtId;

    @FXML
    TextField txtCpf;

    @FXML
    TextField txtEndereco;

    @FXML
    TextField txtNome;

    @FXML
    TextField txtUf;

    @FXML
    TextField txtCidade;

    @FXML
    DatePicker dtpDataCadastro;

    ClienteDAO pDAO;
    Cliente pClicked;  // Armazena o produto clicado na tabela.
    private boolean flagNovo;

    
    /**
     * Initializes the controller class.
     */
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Vincula as colunas da TableView á classe Produto.
        bindColumns();
        
        // Busca Dados
        carregaDados();
    }    
  /**
     * Conecta as colunas da TableView com os atributos da classe Produto.
     * @return void
     */
    private void bindColumns() {

        // Vincula a coluna tcoId com o atributo id da classe Produto
        tcoId.setCellValueFactory(new PropertyValueFactory<>("id"));

        // Adiciona uma configuração extra de alinhamento à direita.
        tcoId.setStyle("-fx-alignment: CENTER_RIGHT;");

        tcoCpf.setCellValueFactory(new PropertyValueFactory<>("Cpf"));
        tcoCpf.setStyle("-fx-alignment: CENTER_RIGHT;");

        tcoEndereco.setCellValueFactory(new PropertyValueFactory<>("Endereco"));

        tcoNome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        tcoNome.setStyle("-fx-alignment: CENTER_RIGHT;");

        tcoUf.setCellValueFactory(new PropertyValueFactory<>("Uf"));
        tcoUf.setStyle("-fx-alignment: CENTER_RIGHT;");

        tcoCidade.setCellValueFactory(new PropertyValueFactory<>("Cidade"));
        tcoCidade.setStyle("-fx-alignment: CENTER_RIGHT;");

        tcoDataCadastro.setCellValueFactory(new PropertyValueFactory<>("dataCadastro"));
        tcoDataCadastro.setStyle("-fx-alignment: CENTER_RIGHT;");
    }  
}
