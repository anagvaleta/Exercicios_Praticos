package org.example;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional SO;
    MemoriaUSB memoriaUSB;
    HardwareBasico [] HB = new HardwareBasico [3];

    //criando objetos da classe computador
    public Computador (String marca, float preco, String nomeSO, int typeSO){
        this.marca = marca;
        this.preco = preco;
        this.SO = new SistemaOperacional(nomeSO, typeSO);
    }

    //exibir infos do pc no menu
    void ConfigPC (){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco + " reais");
        System.out.println("Config de hardware: ");

        //percorrer a array hb inteira para achar dados
        for (int i = 0; i < HB.length; i++){
            System.out.println(HB[i].nome);
            System.out.println(HB[i].capacidade);
        }
        System.out.println("SO: " + SO.nome + " " + SO.tipo + " bits");
        System.out.println("Possui " + memoriaUSB.nome + " " + memoriaUSB.capacidade + " Gb");
    }

    //adicionar uma memoria usb ao computador atual
    void addMemoriaUSB (MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    void addHardwareBasico (HardwareBasico newHB){
        for (int i = 0; i < HB.length; i++) {
            //verificar se o obj esta nulo
            if (HB[i] == null){
                //atribuir newHB a nova posição
                HB[i] = newHB;
                break; //parar o loop depois de adicionar o HB
            }
        }
    }
}
