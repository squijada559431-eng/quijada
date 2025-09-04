
Here is my explanations about my program how it works.
1ST is stack, when we say STACK we can push (add) numbers, pop (remove the last added number), and display the stack.
2nd one is Queue, We can enqueue which is ADD numbers, while the other one is DEQUEUE means "remove the first added number", and display the queue. It works like a waiting line — first in line goes out first.
3rd is Linked List, We can insert numbers at the end, delete numbers from the beginning, and display the list.
The last one is, Circular Linked List → Similar to a linked list, but the last node connects back to the first.
Like this
Insert → adds a new node at the end.
Display → shows all nodes by looping through until it returns to the start.
Delete → removes the first node.
And lastly but not the least is EXIT, If I/Youchoose 5, program prints "Exiting the program..." and stops.

However, I create another class named Circular Linked List. Why have this class? because to make a circular linked list data structure with three operations such as, Insert (add a new node at the end. 2nd, Display (show all nodes in a circle. Lastly, Delete (remove the first node). "private static class Node" This is the blueprint for each element in the list. and each nodes stores such as, "data" - the value (number) and "next" - the link to the next node. Without this, we/i cannot build the chain of nodes. "private Node last = null;" (Keeps track of the last node in the circular list.) & (From last, we can always find the first node using last.next.) Also, (insert(int data) - (Adds a new node.)
and If list is empty, it should connect the node to itself (to form a circle). If not empty, put new node after last, then move last pointer to new node.
This class exists so my menu program can use a circular linked list just like it uses stack, queue, and normal linked list.


here is my output(screenshot)
![953D8FF9-8035-40E7-BBDC-EDC61F749169](https://github.com/user-attachments/assets/95de70b9-c1ab-48c9-9da4-fc93cf0529c4)
