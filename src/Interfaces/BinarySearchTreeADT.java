package Interfaces;

import Exceptions.ElementNotFoundException;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Interface that
 * </p>
 */
/**
 * BinarySearchTreeADT defines the interface to a binary search tree.
 *
 * @param <T>
 */
public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T> {

    /**
     * Adds the specified element to the proper location in this tree.
     *
     * @param element the element to be added to this tree
     */
    public void addElement(T element);

    /**
     * Removes and returns the specified element from this tree.
     *
     * @param targetElement the element to be removed from this tree
     * @return the element removed from this tree
     * @throws Exceptions.ElementNotFoundException
     */
    public T removeElement(T targetElement) throws ElementNotFoundException;

    /**
     * Removes all occurences of the specified element from this tree.
     *
     * @param targetElement the element that the list will have all instances of
     * it removed
     * @throws Exceptions.ElementNotFoundException
     */
    public void removeAllOccurrences(T targetElement);

    /**
     * Removes and returns the smallest element from this tree.
     *
     * @return the smallest element from this tree.
     * @throws Exceptions.ElementNotFoundException
     */
    public T removeMin() throws ElementNotFoundException;

    /**
     * Removes and returns the largest element from this tree.
     *
     * @return the largest element from this tree
     * @throws Exceptions.ElementNotFoundException
     */
    public T removeMax() throws ElementNotFoundException;

    /**
     * Returns a reference to the smallest element in this tree.
     *
     * @return a reference to the smallest element in this tree
     */
    public T findMin();

    /**
     * Returns a reference to the largest element in this tree.
     *
     * @return a reference to the largest element in this tree
     */
    public T findMax();
}
