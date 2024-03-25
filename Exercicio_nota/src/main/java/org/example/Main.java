package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criação de um cliente
        Cliente c1 = new Cliente ("Nana", 1234567895);

        //Criando os PCS
        Computador PC1 = new Computador ("Positivo", 3300, "Linux Ubuntu", 32);
        Computador PC2 = new Computador ("Acer", 8800, "Windows 8", 64);
        Computador PC3 = new Computador ("Vaio", 4800, "Windows 10", 64);

        //Criando as configs de hardware do PC1
        HardwareBasico HB_PC1_Processador = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico HB_PC1_Memoria = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico HB_PC1_HD = new HardwareBasico("HD", 500);

        //Criando as configs de hardware do PC2
        HardwareBasico HB_PC2_Processador = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico HB_PC2_Memoria = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico HB_PC2_HD = new HardwareBasico("HD", 1000);

        //Criando as configs de hardware do PC3
        HardwareBasico HB_PC3_Processador = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico HB_PC3_Memoria = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico HB_PC3_HD = new HardwareBasico("HD", 2000);

        //Criando configs de USB
        MemoriaUSB Memoria_PC1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB Memoria_PC2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB Memoria_PC3 = new MemoriaUSB("HD", 1000);

        //Adicionando as configs no PC1
        PC1.addHardwareBasico(HB_PC1_Processador);
        PC1.addHardwareBasico(HB_PC1_Memoria);
        PC1.addHardwareBasico(HB_PC1_HD);

        //Adicionando as configs no PC2
        PC2.addHardwareBasico(HB_PC1_Processador);
        PC2.addHardwareBasico(HB_PC1_Memoria);
        PC2.addHardwareBasico(HB_PC1_HD);

        //Adicionando as configs no PC3
        PC3.addHardwareBasico(HB_PC1_Processador);
        PC3.addHardwareBasico(HB_PC1_Memoria);
        PC3.addHardwareBasico(HB_PC1_HD);

        //Adicionando memoria nos PCS
        PC1.addMemoriaUSB(Memoria_PC1);
        PC2.addMemoriaUSB(Memoria_PC2);
        PC3.addMemoriaUSB(Memoria_PC3);

        //mostrar promoções para o usuario escolher
            System.out.println("Escolha entre os pacotes de computadores 1, 2 ou 3. Caso queira sair do menu pressione a tecla 0");
            System.out.println("-----------------------(o˘◡˘o)-----------------------");
            System.out.println("Promoção 1: ");
            PC1.ConfigPC();
            System.out.println("-----------------------☆-----------------------");
            System.out.println("Promoção 2: ");
            PC2.ConfigPC();
            System.out.println("-----------------------☆-----------------------");
            System.out.println("Promoção 3: ");
            PC3.ConfigPC();

        //variavel para controle e entrada de dados
        Scanner scanner = new Scanner(System.in);
        int compra = 0;

        //flag
        do {
            compra = scanner.nextInt();
            switch (compra) {
                case 1:
                    c1.addPCS(PC1);
                    c1.calcularTotalCompra(PC1.preco);
                    break;
                case 2:
                    c1.addPCS(PC2);
                    c1.calcularTotalCompra(PC2.preco);
                    break;
                case 3:
                    c1.addPCS(PC3);
                    c1.calcularTotalCompra(PC3.preco);
                    break;
                case 0:
                    System.out.println("Fim do menu!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha numeros de 1 à 3 ou caso queira sair do menu digite 0");
                    break;
            }
        } while (compra != 0);

        System.out.println("Nome do cliente: " + c1.nome);
        System.out.println("-----------------------☆-----------------------");
        System.out.println("CPF do cliente: " + c1.cpf);
        System.out.println("-----------------------☆-----------------------");
        System.out.println("Numero de PCS no carrinho: " + c1.a);
        System.out.println("-----------------------☆-----------------------");
        System.out.println("Preço total da compra: R$" + c1.vfcompra);
        System.out.println("-----------------------☆-----------------------");
    }
}