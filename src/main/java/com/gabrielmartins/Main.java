package com.gabrielmartins;


import java.util.Locale;

public class Main {

    public static void main(String[] args ) {

         //INICANDO VARIAVEIS

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        int idade = 17;
        double salario = 300.00000000000000, altura = 1.90;
        char genero = 'f';
        String nome = "MushMC spop wg da silva";


        System.out.println("IDADE =  " + idade);
        System.out.println("SALARIO =  " + String.format("%.1f",  salario));
        System.out.println("GENERO =  " + genero);
        System.out.println("NOME =  " + nome);
        System.out.println("ALTURA =  " + String.format("%.1f",  altura));






        System.out.println("===================USANDO DOUBLE===================");

        //USANDO DOUBLE

        double z = 1346.000;

        System.out.println(String.format("%.2f", z));

        System.out.println("===================USANDO DOUBLE===================");

    }


}