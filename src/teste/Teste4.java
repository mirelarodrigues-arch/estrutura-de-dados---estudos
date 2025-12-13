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
    }
}
