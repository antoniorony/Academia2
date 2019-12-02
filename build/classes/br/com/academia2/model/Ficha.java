package br.com.academia2.model;
// Generated 19/07/2019 12:01:09 by Hibernate Tools 4.3.1



/**
 * Ficha generated by hbm2java
 */
public class Ficha  implements java.io.Serializable {


     private Integer id;
     private String matricula;
     private String dataEntrada;
     private String sexo;
     private float peso;
     private float altura;
     private int idade;
     private float frequenciaCardiaca;
     private float frequenciaCardMaxima;
     private String batimentos;
     private String problemaSaude;
     private String medicacao;
     private String acompanhamento;
     private String objetivo;
     private String profissao;
     private int idModeloFicha;
     private int idCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Ficha() {
    }

    public Ficha(String matricula, String dataEntrada, String sexo, float peso, float altura, int idade, float frequenciaCardiaca, float frequenciaCardMaxima, String batimentos, String problemaSaude, String medicacao, String acompanhamento, String objetivo, String profissao, int idModeloFicha, int idCliente) {
       this.matricula = matricula;
       this.dataEntrada = dataEntrada;
       this.sexo = sexo;
       this.peso = peso;
       this.altura = altura;
       this.idade = idade;
       this.frequenciaCardiaca = frequenciaCardiaca;
       this.frequenciaCardMaxima = frequenciaCardMaxima;
       this.batimentos = batimentos;
       this.problemaSaude = problemaSaude;
       this.medicacao = medicacao;
       this.acompanhamento = acompanhamento;
       this.objetivo = objetivo;
       this.profissao = profissao;
       this.idModeloFicha = idModeloFicha;
       this.idCliente = idCliente;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getDataEntrada() {
        return this.dataEntrada;
    }
    
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public float getPeso() {
        return this.peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return this.altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getFrequenciaCardiaca() {
        return this.frequenciaCardiaca;
    }
    
    public void setFrequenciaCardiaca(float frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }
    public float getFrequenciaCardMaxima() {
        return this.frequenciaCardMaxima;
    }
    
    public void setFrequenciaCardMaxima(float frequenciaCardMaxima) {
        this.frequenciaCardMaxima = frequenciaCardMaxima;
    }
    public String getBatimentos() {
        return this.batimentos;
    }
    
    public void setBatimentos(String batimentos) {
        this.batimentos = batimentos;
    }
    public String getProblemaSaude() {
        return this.problemaSaude;
    }
    
    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }
    public String getMedicacao() {
        return this.medicacao;
    }
    
    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }
    public String getAcompanhamento() {
        return this.acompanhamento;
    }
    
    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    public String getObjetivo() {
        return this.objetivo;
    }
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public int getIdModeloFicha() {
        return this.idModeloFicha;
    }
    
    public void setIdModeloFicha(int idModeloFicha) {
        this.idModeloFicha = idModeloFicha;
    }




}


