/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author anton
 */
public class GeraMatricula {
  private int numeroMatricula;
  private int numeroDia;
  private int numeroMes;
  private int numeroAno;
  private int hora;
  private int minuto;
  private int segundo;
  
  public String  matriculaGerada(){
        
        return String.valueOf(this.getNumeroDia()+""+(this.getNumeroMes()+1)+""+(this.getNumeroAno())+""+(this.getHora())+""+(this.getMinuto())+""+(this.getSegundo()));
    }
  public void pegaData(){
      Date data = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        setNumeroDia(cal.get(Calendar.DAY_OF_MONTH));
        setNumeroMes(cal.get(Calendar.MONTH));
        setNumeroAno(cal.get(Calendar.YEAR));
        setHora(cal.get(Calendar.HOUR));
        setMinuto(cal.get(Calendar.MINUTE));
        setSegundo(cal.get(Calendar.SECOND));
  }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public int getNumeroAno() {
        return numeroAno;
    }

    public void setNumeroAno(int numeroAno) {
        this.numeroAno = numeroAno;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public GeraMatricula() {
    }

    public GeraMatricula(int numeroMatricula, int numeroDia, int numeroMes, int numeroAno, int hora, int minuto, int segundo) {
        this.numeroMatricula = numeroMatricula;
        this.numeroDia = numeroDia;
        this.numeroMes = numeroMes;
        this.numeroAno = numeroAno;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
}
