package com.accenture.fwk.helpers.utils;

import javax.swing.text.MaskFormatter;
import java.util.ArrayList;

public class GenerateCpf {
    private ArrayList<Integer> listaAleatoria = new ArrayList<Integer>();
    private ArrayList<Integer> listaNumMultiplicados = null;

    private static int geraNumAleatorio(){
        int numero = (int) (Math.random() * 10);

        return numero;
    }
    private ArrayList<Integer> generatePartialCpf(){
        for(int i = 0; i < 9; i++){
            listaAleatoria.add(geraNumAleatorio());
        }

        return listaAleatoria;
    }
    private ArrayList<Integer> generateFirstNumber(){
        listaNumMultiplicados = new ArrayList<Integer>();
        int primeiroDigito;
        int totalSomatoria = 0;
        int restoDivisao;
        int peso = 10;

        for(int item : listaAleatoria){
            listaNumMultiplicados.add(item * peso);

            peso--;
        }

        for(int item : listaNumMultiplicados){
            totalSomatoria += item;
        }

        restoDivisao = (totalSomatoria % 11);
        if(restoDivisao < 2){
            primeiroDigito = 0;
        } else{
            primeiroDigito = 11 - restoDivisao;
        }

        listaAleatoria.add(primeiroDigito);

        return listaAleatoria;
    }

    private ArrayList<Integer> generateSecondNumber(){
        listaNumMultiplicados = new ArrayList<Integer>();
        int segundoDigito;
        int totalSomatoria = 0;
        int restoDivisao;
        int peso = 11;
        for(int item : listaAleatoria){
            listaNumMultiplicados.add(item * peso);

            peso--;
        }

        for(int item : listaNumMultiplicados){
            totalSomatoria += item;
        }

        restoDivisao = (totalSomatoria % 11);

        if(restoDivisao < 2){
            segundoDigito = 0;
        } else{
            segundoDigito = 11 - restoDivisao;
        }

        listaAleatoria.add(segundoDigito);

        return listaAleatoria;
    }

    public String generateRandomCPF() {
        generatePartialCpf();
        generateFirstNumber();
        generateSecondNumber();

        String cpf = "";
        String texto = "";

        for(int item : listaAleatoria){
            texto += item;
        }
        try{
            MaskFormatter mf = new MaskFormatter("###.###.###-##");
            mf.setValueContainsLiteralCharacters(false);
            cpf = mf.valueToString(texto);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return cpf;
    }
}
