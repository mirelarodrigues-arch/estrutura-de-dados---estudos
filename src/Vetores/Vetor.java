package Vetores;

import java.util.Arrays;

public class Vetor {
    //atributo que sera o vetor
    private String[] elementos;

    //controla o tamanho do vetor - quantos já foram adicionados
    private int tamanho;

    //método construtor
    public Vetor(int capacidade){

        //criação e inicialização do vetor
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        //quantos elementos já foram adicionados e capacidade total do vetor
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            //add
            this.elementos[this.tamanho] = elemento;
            //atualiza
            this.tamanho++;
            return true;
        }
        return false;

    }

    public void imprimir(){
        for(int i = 0; i < this.tamanho; i++){
            System.out.println(this.elementos[i]);
        }
    }

    //Buscar por um elemento
    public String busca(int posicao){
        // se a posição NÃO existir (for inválida), lança uma exception
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        // se for válida, retorna o elemento dessa posição
        return this.elementos[posicao];
    }

        //Verificar se o elemento existe no vetor
       public int verifica(String elemento) {
            for (int i = 0; i < this.tamanho; i++) {
                if (this.elementos[i].equals(elemento)) {
                    return i;
                }
            }
            return -1;
            //retorna -1 pq é uma posição que não existe no vetor
        }
    public int tamanho(){

        return this.tamanho;
    }

      //RETORNA OS ELEMENTOS COM ARRAY
      //devolver um texto que representa o vetor
      public String toString() {

        //cria um StringBuilder vazio e guarda ele na variável s
        StringBuilder s = new StringBuilder();

        //serve para colocar as informções que estou construindo
        s.append("[");

        //enquanto eu não chegar no ultimo elemento, vou add uma virgula
        // coloca todos os elementos menos o último, com vírgula.
        for(int i= 0; i< this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        //se o tamanho for maior que 0
        //coloca o último, sem vírgula.
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        //devolve essa string pronta
        return s.toString();
    }
    //add um elemento em qualquer posição do vetor
    public boolean adicionaQualquerP(int posicao, String elemento){
     if(!(posicao >= 0 && posicao < tamanho)){
         throw new IllegalArgumentException("Posição inválida");

     }
     //move todos os elementos
        this.aumentaCapacidade();
     for(int i = this.tamanho-1; i>= posicao; i--){
         this.elementos[i+1] = this.elementos[i];
     }
     this.elementos[posicao] = elemento;
     this.tamanho++;
     return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String [] elementosNovos = new String[this.elementos.length*2];
            for(int i = 0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    /*
    //método adcicionar elemento
    public void adiciona(String elemento){
        //percorre todo o vetor
        for(int i = 0; i < this.elementos.length; i++){
            //verifiva se a posição é null
            if(this.elementos[i] == null){
                //atribui ao paramentro
                this.elementos[i] = elemento;
                break; //vai parar o loop quando achar a primeira posição nula
            }
        }

    } */

  /*  public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }

    }*/



}
