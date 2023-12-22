package com.gabrielmartins;

import java.util.Locale;

public class MainSecundario {

    public static void main(String[] args ) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        int idade = 20;
        double salario = 1000;
        String nome = "MushMC spop wg da silva";
        char sexo = 'M';


        System.out.println(

                "IDADE = " + idade +
                ", SALARIO = " + String.format("%.2f", salario) +
                ", NOME = " + nome +
                ", SEXO = " + sexo);

    }


}
