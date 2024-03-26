package org.example;

public class Cliente {
    String nome;
    long cpf;
    float vfcompra = 0;
    Computador [] PC = new Computador[8];
    int a =0;

    //iniciar objetos com valores especificos usando um construtor
     public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //adicionar um pc
    void addPCS (Computador NovoPC){
        //percorrer a array PC
        for (int i = 0; i < PC.length; i++) {
            if(PC[i] == null){
                PC[i] = NovoPC;
                a++;
                break; //sair do loop ja que o PC foi adicionado
            }
        }
    }

    //mostrar as compras do usuario
    void mostraPC(){
        for (int i = 0; i < PC.length; i++) {
            if(PC[i] != null){
                System.out.println("Marca: " + PC[i].marca);
                System.out.println("Preço: " + PC[i].preco);
                System.out.println("Configurações:");
                for(int j = 0; j < 3; j++){
                    System.out.println(PC[i].HB[j].nome + " " + PC[i].HB[j].capacidade);
                }

            }
        }
    }

    //calcular o valor total da compra
    float calcularTotalCompra (float compra){
        this.vfcompra += compra;
        return vfcompra;
    }
}
