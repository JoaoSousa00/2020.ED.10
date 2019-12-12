package Tests;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Heaps.ArrayHeap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                        ArrayHeap heap = new ArrayHeap();
                         {
                            try {
                                System.err.println("RemoveMin| Should throw 'EmptyCollectionException' and ..." + heap.removeMin());
                            } catch (EmptyCollectionException ex) {
                                System.out.println("Empty Collection");
                                System.out.println("FindMin| Should return null and is..." + heap.findMin());
                            }
                        }
                        break;

                    case 2:

                        ArrayHeap heap2 = new ArrayHeap();
                        heap2.addElement(3);
                        System.out.println("FindMin| Should return 3 and is..." + heap2.findMin());
                        try {
                            System.out.println("RemoveMin| Should return 3 and is..." + heap2.removeMin());
                        } catch (EmptyCollectionException ex) {
                            System.err.println("Shouldnt Throw here...");
                        }
                        try {
                            System.err.println("RemoveMin| Should throw 'EmptyCollectionException' and ..." + heap2.removeMin());
                        } catch (EmptyCollectionException ex) {
                            System.out.println("Empty Collection");
                        }
                        break;

                    case 3:
                        
                        ArrayHeap heap3 = new ArrayHeap();
                        heap3.addElement(3);
                        heap3.addElement(7);
                        heap3.addElement(5);
                        heap3.addElement(2);
                        heap3.addElement(7);
                        heap3.addElement(9);
                        System.out.println("FindMin| Should return 3 and is..." + heap3.findMin());
                        try {
                            System.out.println("RemoveMin| Should return 3 and is..." + heap3.removeMin());
                            System.out.println("RemoveMin| Should return 3 and is..." + heap3.removeMin());
                            System.out.println("RemoveMin| Should return 3 and is..." + heap3.removeMin());
                        } catch (EmptyCollectionException ex) {
                            System.err.println("Shouldnt Throw here...");
                        }
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
