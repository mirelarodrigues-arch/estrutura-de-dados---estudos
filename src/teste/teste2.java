package teste;

import Vetores.Vetor;

public class teste2 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");


        vetor.imprimir();


      /*  try{
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
        }catch (Exception e){
            e.printStackTrace();
        }
*/
    }


}
