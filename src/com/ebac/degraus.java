package com.ebac;

public class degraus {
    public int quantidadeDegraus;

    public degraus(int n){
        this.quantidadeDegraus=n;
        int resultado = Escalada(quantidadeDegraus);
        System.out.println("São " + resultado + " jeitos possiveis de subir a escada!");
    }
    public int Escalada (int n){

        int resultado;

        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }

        resultado = Escalada(n - 1) + Escalada(n - 2);

        return resultado;

    }
}
