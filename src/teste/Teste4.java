package teste;
import Vetores.Vetor;

public class Teste4 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        System.out.println("Adicionando elemento");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("e");
        vetor.adiciona("f");

        System.out.println(vetor);
        //remove a posição
        vetor.remove(1);
        System.out.println(vetor);

        //remove o elemento
        int pos = vetor.verifica("e");
        if(pos >= 0){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);
    }
}
