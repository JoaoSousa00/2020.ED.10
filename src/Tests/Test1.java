package Tests;

import Exceptions.ElementNotFoundException;
import Heaps.ArrayHeap;
import java.util.Scanner;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 *
 * </p>
 */
public class Test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tTestes Disponiveis:\nTeste 1 - Exercicio 1(ArrayHeap)\nTeste 2 - ...\nTeste 3 - ...\n\nQue Teste pretende efetuar:");
        int a = scanner.nextInt(4); //Aceita só até 3

        switch (a) {
            case 1:
                System.out.println("\nEstado do Sistema:\nEstado 1 - Coleção Vazia\nEstado 2 - Coleção só com root\nEstado 3 - Coleção não vazia\n\nQue método pretende executar:");
                int b = scanner.nextInt(4);
                switch (b) {
                    case 1:
                        ArrayHeap heap = new ArrayHeap(20);
                        System.out.println("GetH| Should be 0 and is ..." + heap.getH());
                        break;

                    case 2:
                        break;

                    case 3:
                        break;
                }
                break;

            case 2:
                System.out.println("\nEstado do Sistema:\nEstado 1 - Coleção Vazia\nEstado 2 - Coleção só com root\nEstado 3 - Coleção não vazia\n\nQue método pretende executar:");
                int c = scanner.nextInt(4);
                switch (c) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;

                }

        }

    }

}
