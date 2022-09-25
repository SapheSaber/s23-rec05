import { DelegationSortedIntList } from "../src/DelegationSortedIntList";
import { IntegerList } from "../src/IntegerList";
import { printList } from "../src/main";

// uncomment the following tests

/**
* Tests for the add() method.
*/
test("test add()", () => {
    let list1 = new DelegationSortedIntList();
    // add 5 elements to our list.
    list1.add(1);
    list1.add(3);
    list1.add(2);
    list1.add(4);
    list1.add(2);

    // check that the total number of elements added is 5.
    expect(list1.getTotalAdded()).toBe(5);

    //printList(list1);
});

//   /**
//   * Test for the addAll() method.
//   */
//   @Test
test("test addAll()",()=>{
    let list1 = new DelegationSortedIntList();
    let list2 = new DelegationSortedIntList();

      // add 5 elements to our first list.
      list1.add(1);
      list1.add(3);
      list1.add(2);
      list1.add(4);
      list1.add(2);

      // check that the total number of elements added is 5.
      expect(list1.getTotalAdded()).toBe(5);

      //printList(list1);

      // add 2 elements to a second list.
      list2.add(3);
      list2.add(0);

      // check that the total number of elements added is 2.
      expect(list2.getTotalAdded()).toBe(2);

      // add the first list (5 elements) to our second list (2 elements).
      list2.addAll(list1);

      // check that the total number of elements added to our second list is 7.
      expect(list2.getTotalAdded()).toBe(7);

      //printList(list2);
});

