/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

import { SortedIntList } from "./hidden/SortedIntListLibrary";
import { IntegerList } from "./IntegerList";

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
class DelegationSortedIntList extends SortedIntList {
    // the number of attempted element insertions
    private sortedIntList: SortedIntList;

    private totalAdded: number;

    constructor() {
        super();
        this.totalAdded = 0;
        this.sortedIntList = new SortedIntList();
    }

    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    getTotalAdded(): number {
            return this.totalAdded;
    }

    /**
     * Add the specified int to the list and increment the totalAdded
     * @param num to be added
     * @return true if added successfully
     */
    add(num: number): boolean {
        this.totalAdded++;
        return this.sortedIntList.add(num);
    }

    /**
     * Add all the elements of the IntegerLIst to the list and increment the
     * totalAdded
     * @param list IntegerList containing elements to be added
     * @return true if added success
     */
     addAll(list: IntegerList): boolean {
        this.totalAdded += list.size(); //This works in delegation
        return this.sortedIntList.addAll(list);
    }


    /**
     * Return the integer at the specified position in the list
     * @param index index of the return element
     * @return the element at the specified index
     */
     ge(index: number): number {
        return this.sortedIntList.get(index);
    }

    /**
     * Remove all the elements that are contained in the specified list
     *
     * @param list IntegerList containing elements that are to be removed
     * @return true if success
     */
     removeAll(list: IntegerList): boolean  {
        return this.sortedIntList.removeAll(list);
    }

    /**
     * @return the number of elements in this list.
     */
    size(): number {
        return this.sortedIntList.size();
    }
}

export { DelegationSortedIntList }