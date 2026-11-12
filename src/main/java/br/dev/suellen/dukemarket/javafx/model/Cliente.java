package br.dev.suellen.dukemarket.javafx.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sesi2dib
 */
public class Cliente {
    
 private int id;
    private String Cpf;
    private String Endereco;
    private String Nome;
    private String Uf;
    private String Cidade;
    private Calendar dataCadastro;   
 

    public Cliente (int id, String Cpf, String Endereco, String Nome, String Uf, String Cidade, Calendar dataCadastro) {
        this.id = id;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Nome = Nome;
        this.Uf = Uf;
        this.Cidade = Cidade;
        this.dataCadastro = dataCadastro;
    }
    
    // --- GETTERS E SETTERS PADRÕES ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String Cpf () {
        return Cpf;
    }

    public void Cpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String Endereco() {
        return Endereco;
    }

    public void setEndereco (String Endereco) {
        this.Endereco = Endereco;
    }

    public String Nome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String Uf() {
        return Uf;
    }

    public void setUf (String Uf) {
        this.Uf = Uf;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    
    public void setDataCadastro(String strDataCadastro) {
    try {
        this.dataCadastro = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.dataCadastro.setTime(sdf.parse(strDataCadastro));
    } catch (ParseException ex) {
        Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public String getDataCadastro() {
    if (this.dataCadastro != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(this.dataCadastro.getTime());
    } else {
        return "";
    }
}
@Override
public String toString() {

    return String.format("%3s | %15s | %-30s | %10.2s | %10.2s | %10.2s | %10s", this.id,
            this.Cpf, this.Endereco, this.Nome, this.Uf,
            this.Cidade, this.getDataCadastro());

}

}
