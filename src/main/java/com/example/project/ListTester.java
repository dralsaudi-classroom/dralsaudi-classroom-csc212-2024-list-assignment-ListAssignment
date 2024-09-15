package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
      for(int i = 0; i<n; i++){
            list.findFirst();
            T first = list.retrieve();
            list.remove();

            while (!list.empty() && !list.last()) {
                list.findNext();
            }
            list.insert(first);
        }
    }
    }
   public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2) {
    if (l1.empty()) {
        return; 
    }
    l1.findFirst();
    while (!l1.last()) {
        l1.findNext();
    }

   
    do {
        l2.insert(l1.retrieve());  
        if (!l1.first()) {
            l1.findPrevious();  
        }
    } while (!l1.first());

    l2.insert(l1.retrieve());
}

        // Write the method reverseCopy, user of DoubleLinkedList, which copies the elements
        // of l1 to l2 in reverse order. The list l1 must not change. Assume that l2 is empty.
        // The method signature is public static <T> void reverseCopy(DoubleLinkedList<T> l1,
        // DoubleLinkedList<T> l2).
        // Example 4.1. If l1 : A ↔ B ↔ C ↔ D, then calling reverseCopy(l1, l2) results in
        // l2 : D ↔ C ↔ B ↔ A.
    
}
