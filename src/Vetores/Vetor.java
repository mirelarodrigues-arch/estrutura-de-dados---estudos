package Vetores;

public class Vetor {
    //atributo que sera o vetor
    private String[] elementos;
//controla o tamanho do vetor- quantos já foram adcionados
    private int tamanho;

    //método construtor
    public Vetor(int capacidade){
        //criação e inicialização do vetor
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        //quantos elementos já foram adicionados e capacidade total do vetor
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
