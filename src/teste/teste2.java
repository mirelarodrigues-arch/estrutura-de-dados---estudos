package teste;

import Vetores.Vetor;

import java.sql.SQLOutput;

public class teste2 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        //tamanho
        System.out.println(vetor.tamanho());

        //
        System.out.println(vetor.toString());

        //posições
        vetor.imprimir();

        //System.out.println("Posição solicitada:");;
        //System.out.println(vetor.busca(2));;

        System.out.println("Verificando posição");
        System.out.println(vetor.verifica("Elemento 1"));
        System.out.println(vetor.verifica("Elemento 4"));


      /*  try{
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
        }catch (Exception e){
            e.printStackTrace();
        }
*/
    }


}
