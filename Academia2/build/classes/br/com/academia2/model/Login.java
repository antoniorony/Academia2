package br.com.academia2.model;
// Generated 19/07/2019 12:01:09 by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String usuario;
     private String senha;

    public Login() {
    }

    public Login(String nome, String usuario, String senha) {
       this.nome = nome;
       this.usuario = usuario;
       this.senha = senha;
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
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }




}


