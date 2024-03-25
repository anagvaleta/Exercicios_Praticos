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

    //calcular o valor total da compra
    float calcularTotalCompra (float compra){
        this.vfcompra += compra;
        return vfcompra;
    }
}
