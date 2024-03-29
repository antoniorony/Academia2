package br.com.academia2.model;
// Generated 19/07/2019 12:01:09 by Hibernate Tools 4.3.1



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String apelido;
     private String cpf;
     private String telefone;
     private String logradouro;
     private int numero;
     private String bairro;
     private String cidade;
     private String estado;
     private String dataNascimento;
     private int idMatricula;

    public Cliente() {
    }

    public Cliente(String nome, String apelido, String cpf, String telefone, String logradouro, int numero, String bairro, String cidade, String estado, String dataNascimento, int idMatricula) {
       this.nome = nome;
       this.apelido = apelido;
       this.cpf = cpf;
       this.telefone = telefone;
       this.logradouro = logradouro;
       this.numero = numero;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
       this.dataNascimento = dataNascimento;
       this.idMatricula = idMatricula;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getLogradouro() {
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getIdMatricula() {
        return this.idMatricula;
    }
    
    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }




}


