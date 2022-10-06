/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo_da_velha2;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class Entrada {
    static String entradaTexto(String mensagem){
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensagem);
        return teclado.nextLine();
    }
    
   public static int entradaInteiro(String mensagem) throws Exception{
        //boolean erro = false;
        int num = 0;
        //do {
           String aux = entradaTexto(mensagem);
           try{
                num = Integer.parseInt(aux);
                //erro = false;
           }
           catch(NumberFormatException e){
               //erro = true;
               throw new Exception("Não recebeu um número inteiro");
           }
        //} while (erro);
        return num;
    }
    
   public static double entradaDouble(String mensagem) throws Exception{
        //boolean erro = false;
        double num = 0;
        //do {
           String aux = entradaTexto(mensagem);
           try{
                num = Double.parseDouble(aux);
          //      erro = false;
           }
           catch(NumberFormatException e){
          //     erro = true;
                throw new Exception("Não recebeu um número válido.");
           }
        //} while (erro);
        return num;
    }

    public static char entradaChar(String mensagem) throws Exception {
        //boolean erro = false;
        char caracter = '\0';
        //do{
            String aux = entradaTexto(mensagem);
            if (aux.length() != 1){
          //      erro = true;
                 throw new Exception("Use apenas uma letras");
            }
            else{
                caracter = aux.charAt(0);
          //      erro=false;
            }
       // }while (erro);
        return caracter;
    }
}
