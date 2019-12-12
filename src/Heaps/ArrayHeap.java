package Heaps;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Interfaces.BinaryTreeADT;
import Interfaces.HeapADT;
import Lists.ArrayUnorderedList;
import java.util.Iterator;

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
 * Class that represents
 * </p>
 */
public class ArrayHeap<T> implements BinaryTreeADT<T>, HeapADT<T> {

    private final int CAPACITY = 50;
    protected T array[];
    protected int count;
    private int h;

    public ArrayHeap() {
        this.array = (T[]) new Object[CAPACITY];
        count = 0;
    }

    public ArrayHeap(int GIVEN_CAPACITY) {
        this.array = (T[]) new Object[GIVEN_CAPACITY];
        count = 0;
    }

    @Override
    public T getRoot() {
        return array[0];
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T targetElement) {
        try {
            find(targetElement);
        } catch (ElementNotFoundException ex) {
            return false;
        }
        return true;
    }

    @Override
    public T find(T targetElement) throws ElementNotFoundException {
        T temp = null;
        boolean found = false;

        for (int ct = 0; ct < array.length && !found; ct++) {
            if (targetElement.equals(array[ct])) {
                found = true;
                temp = array[ct];
            }
        }
        if (!found) {
            throw new ElementNotFoundException("Binary tree");
        }
        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        inorder(0, templist);
        return templist.iterator();

    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void inorder(int node, ArrayUnorderedList<T> templist) {
        if (node < array.length) {
            if (array[node] != null) {
                inorder(node * 2 + 1, templist);
                templist.addToRear(array[node]);
                inorder((node + 1) * 2, templist);
            }
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        preorder(0, templist);
        return templist.iterator();
    }

    /**
     * Performs a recursive preorder traversal.
     *
     * @param node the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void preorder(int node, ArrayUnorderedList<T> templist) {
        if (node < array.length) {
            if (array[node] != null) {
                templist.addToRear(array[node]);
                preorder(node * 2 + 1, templist);
                preorder((node + 1) * 2, templist);
            }
        }
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        postorder(0, templist);
        return templist.iterator();
    }

    /**
     * Performs a recursive postorder traversal.
     *
     * @param node the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void postorder(int node, ArrayUnorderedList<T> templist) {
        if (node < array.length) {
            if (array[node] != null) {
                postorder(node * 2 + 1, templist);
                postorder((node + 1) * 2, templist);
                templist.addToRear(array[node]);
            }
        }
    }

    @Override
    public Iterator<T> iteratorLevelOrder() throws EmptyCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addElement(T obj) {
        Comparable toadd = (Comparable) obj;
        if (isEmpty()) {
            array[0] = obj;
        } else if (false) {

        }
    }

    protected void refreshHeight() {
        h = (int) Math.ceil(Math.log(count + 1) / Math.log(2)) - 1;

    }

    @Override
    public T removeMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

}
