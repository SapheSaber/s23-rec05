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
public class DelegationSortedIntList implements IntegerList
{
    private IntegerList SortedIntList;
    private int totalAdded;

    public DelegationSortedIntList(){
        this.SortedIntList = new SortedIntList();
        this.totalAdded = 0;

    }

    @Override
    public boolean add(int num){
        this.totalAdded++;
        return this.SortedIntList.add(num);
    }

    public int getTotalAdded(){
        return this.SortedIntList.get(totalAdded);
    }

    public boolean remove(int num){
        return this.SortedIntList.remove(num);
    }

    public int size(){
        return this.SortedIntList.size();
    }

}

// Question 1: 

// question 3: it is double added - need to know the implementation details of the superclass
// question 4: inheritance is simplier to understand, subclass is a proper sub type to the superclass when the class and subclass are more related and subclass changing the method of the super class but not too much of the inner working of teh superclass -> just add on 

// question 5: delegation reduce the coupling, all components behavior the same in every class -> for consistantancy, in this class recommend the delegation 