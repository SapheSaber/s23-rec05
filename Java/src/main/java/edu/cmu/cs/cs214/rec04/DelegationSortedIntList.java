package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList extends SortedIntList {
    // the number of attempted element insertions
    private final SortedIntList sortedIntList;

    private int totalAdded;

    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return totalAdded;
    }

    public DelegationSortedIntList() {
        this.totalAdded = 0;
        this.sortedIntList = new SortedIntList();
    }

    /**
     * Add the specified int to the list and increment the totalAdded
     * @param num to be added
     * @return true if added successfully
     */
    public boolean add(int num) {
        totalAdded++;
        return this.sortedIntList.add(num);
    }

    /**
     * Add all the elements of the IntegerLIst to the list and increment the
     * totalAdded
     * @param list IntegerList containing elements to be added
     * @return true if added success
     */
    public boolean addAll(IntegerList list) {
        totalAdded += list.size(); //This works in delegation
        return this.sortedIntList.addAll(list);
    }


    /**
     * Return the integer at the specified position in the list
     * @param index index of the return element
     * @return the element at the specified index
     */
    public int get(int index) {
        return this.sortedIntList.get(index);
    }

    /**
     * Remove all the elements that are contained in the specified list
     *
     * @param list IntegerList containing elements that are to be removed
     * @return true if success
     */
    public boolean removeAll(IntegerList list) {
        return this.sortedIntList.removeAll(list);
    }

    /**
     * @return the number of elements in this list.
     */
    public int size() {
        return this.sortedIntList.size();
    }
}