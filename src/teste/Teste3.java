package teste;
import Vetores.Vetor;
public class Teste3 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        System.out.println("Adicionando elemento");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("e");
        vetor.adiciona("f");

        System.out.println(vetor);
        vetor.adicionaQualquerP(0,"a");
        System.out.println(vetor);

        vetor.adicionaQualquerP(3,"d");
        System.out.println(vetor);

    }
}
