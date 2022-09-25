package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntList extends SortedIntList {
    // the number of attempted element insertions
    private int totalAdded;

    /**
     * Constructor for the InheritanceSortedIntList
     */
    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }

    /**
     * Adds the specified int to the list and increments the total number of ints
     * added to the list
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        this.totalAdded++;
        System.out.println("child added is called, add number " + num);
        return super.add(num);
    }

    /**
     * Adds all of the elements of the IntegerList to the list and increments
     * the total number of ints added by the size of the list being added.
     *
     * @param list
     * @return
     */
    @Override
    public boolean addAll(IntegerList list) {
        //this.totalAdded += list.size();
        return super.addAll(list);
    }

    /**
     * Gets the total number of attempted int insertions to the list since it
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return this.totalAdded;
    }

}