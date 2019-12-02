/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia2;

import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class ValidadorCpf {

    private int sm;
    private int sm2;
    private int digito1;
    private int digito2;
    private String cpf;
    private int[] arCpf = new int[9];
    private int[] arCpf2 = new int[10];

    public void validaCpf(String cpf) {
        setCpf(cpf);
        cpf = cpf.replace('.', ' ');
        cpf = cpf.replace('-', ' ');
        cpf = cpf.replace(" ", "");

        if (cpf.length() != 11 || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf == "66666666666" || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") || cpf.equals("00000000000")) {
        } else {
            int cont = 10;
            for (int i = 0; i < 9; i++) {
                arCpf[i] = Integer.parseInt(cpf.substring(i, i + 1)) * cont;
                this.sm += arCpf[i];
                // System.out.println("O Número:"+i+" É :"+arCpf[i]+" SM:"+this.sm+"-"+cpf.substring(i, i+1));
                //// System.out.println(cont);

                cont = cont - 1;
            }
            int d1 = 11 - (this.sm % 11);
            if (d1 == 10) {
                setDigito1(0);
            } else {
                setDigito1(d1);
            }
            //digito 2
            int cont2 = 11;
            for (int i = 0; i < arCpf2.length; i++) {
                arCpf2[i] = Integer.parseInt(cpf.substring(i, i + 1)) * cont2;
                this.sm2 += arCpf2[i];
                // System.out.println("O Número:"+i+
                //        " É :"+arCpf2[i]+" SM:"+sm2);
                cont2--;
            }
            int d2 = 11 - (this.sm2 % 11);

            if (d2 == 11) {
                setDigito2(0);
            } else {
                setDigito2(d2);
            }
        }
    }

    public ValidadorCpf() {
    }

    public int getSm() {
        return sm;
    }

    public void setSm(int sm) {
        this.sm = sm;
    }

    public int getDigito1() {
        return digito1;
    }

    public void setDigito1(int digito1) {
        this.digito1 = digito1;
    }

    public int getDigito2() {
        return digito2;
    }

    public void setDigito2(int digito2) {
        this.digito2 = digito2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean retorno() {
        boolean ret = false;
        String cpf = getCpf();
        cpf = cpf.replace('.', ' ');
        cpf = cpf.replace('-', ' ');
        cpf = cpf.replace(" ", "");

        if (cpf.length() != 11 || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf == "66666666666" || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") || cpf.equals("00000000000")) {
            ret = false;
        } else {
            String digitoVerificador = String.valueOf(getDigito1()) + String.valueOf(getDigito2());

            if (digitoVerificador.equalsIgnoreCase(cpf.substring(9, 11))) {

                ret = true;
            } else {
                ret = false;
            }

        }
        return ret;
    }

}
