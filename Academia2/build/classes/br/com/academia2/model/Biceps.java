package br.com.academia2.model;
// Generated 19/07/2019 12:01:09 by Hibernate Tools 4.3.1



/**
 * Biceps generated by hbm2java
 */
public class Biceps  implements java.io.Serializable {


     private Integer id;
     private String descricao;

    public Biceps() {
    }

    public Biceps(String descricao) {
       this.descricao = descricao;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}

