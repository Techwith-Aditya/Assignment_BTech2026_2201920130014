# Assignment_BTech2026_2201920130014

---

## Day 1 - 26th January 2025

### DSA
1. **Problem 1**  
   - **PS**: Binary Tree Level Order Traversal I
   - **Approach**: Used a queue to traverse tree nodes, checking left and right at each node; if present, add to the queue. At the final step of that iteration, add that element to a list, which is then added to the final list. Repeat these steps...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Binary Tree Level Order Traversal II
   - **Approach**: same approach as I's solution, only difference is in style of adding into the answer list...here we are adding every coming list at start...representing last nodes appearing first in final list...
   - **Platform**: Leetcode 

3. **Problem 3**  
   - **PS**: Subtree of Another Tree
   - **Approach**: Used recursion to traverse the main tree, checking if the current subtree matches the given subtree using a helper function. Returned true if a match was found; otherwise, continued with the left and right subtrees...  
   - **Platform**: Leetcode

### OOPS
- **PS**: Design Parking System
- **Approach**: Did by simple checking of slots...
  - Initialized parking slots in the constructor.
  - The addCar method decrements the slot count for the given car type if available and returns true; otherwise, returns false.
- **Platform**: Leetcode

### DBMS
- **PS**: Combine Two Tables  
- **Approach**: Used LEFT JOIN to combine Person and Address tables, selecting firstName, lastName, city, and state, matching rows on personId, and including all Person rows...
- **Platform**: Leetcode 

---

## Day 2 - 27th January 2025

### DSA
1. **Problem 1**  
   - **PS**: Invert Binary Tree
   - **Approach**: Used simple recursive solution to reach till the last depth...and then swapping the nodes at last point...then backtrack to previous nodes for swapping...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Binary Tree Right Side View
   - **Approach**: Starrting from level 0 or from the given root...then recursively go right firstly in the tree and add elements to ArrayList...after traversing all right, move to left subtree for searching right nodes...
   - **Platform**: Leetcode

3. **Problem 3**  
   - **PS**: Binary Tree Zigzag Level Order Traversal
   - **Approach**: Starting from level 0 or the given root, check if the node is null... if not, create a new list for the level if needed...at even levels, append the value...at odd levels, insert it like reverse order...recursively traverse the left subtree first, then the right subtree, adding elements to the result list...
   - **Platform**: Leetcode

### OOPS
- **PS**: Range Sum Query - Immutable
- **Approach**: Used simple looping concept...
  - Initialize the nums array to store the values.
  - For sumRange, iterate from left to right, adding elements to the sum and returning the final sum.
- **Platform**: Leetcode

### DBMS
- **PS**: Second Highest Salary
- **Approach**: Find the second-highest salary by excluding the maximum salary from the Employee table...then select the maximum from the remaining salaries by writing a subquery...
- **Platform**: Leetcode

---

## Day 3 - 28th January 2025

### DSA
1. **Problem 1**  
   - **PS**: Deepest Leaves Sum
   - **Approach**: Initialize maxDepth and sum...perform DFS, updating maxDepth and sum when encountering leaf nodes...if a leaf is at the deepest level, set or add its value to sum...recursively traverse left and right subtrees...return sum after the DFS...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Balanced Binary Tree
   - **Approach**: Check if the height of the tree is -1...recursively calculate the height of left and right subtrees...if the difference in height is more than 1 or either subtree is unbalanced, return -1...otherwise, return the height of the tree...
   - **Platform**: Leetcode

3. **Problem 3**  
   - **PS**: Leaves at Same Level or Not
   - **Approach**: Start at root level 0...when a leaf is found, set firstEncounteredLeafLevel...for subsequent leaves, check if they match this level...recursively traverse left and right subtrees, incrementing the level...return true if all leaves are at the same level, else false...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Design HashMap
- **Approach**: Used simple approach for it...
  - Initialize a map array of maximum size to store values.
  - The put method stores a value, get returns it, and remove sets it to -1 for deletion.
- **Platform**: Leetcode

### DBMS
- **PS**: Duplicate Emails
- **Approach**: Select emails from the Person table, group by email, and return those that appear more than once...
- **Platform**: Leetcode

---

## Day 4 - 29th January 2025

### DSA
1. **Problem 1**  
   - **PS**: Same Tree
   - **Approach**: Compare nodes of both trees recursively...if both nodes are null, return true...if only one is null or values differ, return false...otherwise, check left and right subtrees...return true if both subtrees are identical, otherwise return false...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Isomorphic Trees
   - **Approach**: Checks if two binary trees are isomorphic by comparing their left and right subtrees both with (left of one compared with right of other and vice-versa) and without swapping (left of one is compared with left of other and vice-versa)...It returns true if either comparison is valid, ensuring the trees are isomorphic...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Transform to Sum Tree
   - **Approach**: Converting a binary tree into a sum tree by recursively transforming each node...for each node, it calculates the sum of values from its left and right subtrees, updates the node's value with this sum, and returns the updated value plus the node's old value...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Design Linked List
- **Approach**: Used simple simulation technique in both solutions...
   - The first solution implements a classic linked list approach using a custom Node class with operations like adding, getting, and deleting nodes at specified positions...
   - The second solution uses an ArrayList to achieve the same functionality by built-in list operations for adding, retrieving, and removing elements...
- **Platform**: Leetcode

### DBMS
- **PS**: Delete Duplicate Emails
- **Approach**: Using approach which deletes duplicate rows from the Person table by joining it with itself, and deleting the row with the larger id for each matching email...
- **Platform**: Leetcode

---

## Day 5 - 30th January 2025

### DSA
1. **Problem 1**  
   - **PS**: Construct Binary Tree from Preorder and Inorder Traversal
   - **Approach**: Used a HashMap to store inorder indices for quickly finding of desired root...the first element in preorder is the root, and its position in inorder helps split the left and right subtrees...recursively construct the tree by selecting appropriate segments of both traversals until the base condition is met...like using proper two-two pointers on both preorder and inorder arrays and uppdating at every recursive call...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Find the height of a binary tree
   - **Approach**: Find the height of a binary tree, I used recursion...if the node is null, return -1...otherwise, compute the height of the left and right subtrees, add 1 for the current node, and return the maximum of both...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Diameter of a Binary Tree
   - **Approach**: The diameter of a binary tree is found using recursion...for each node, the left and right subtree heights are calculated, and their sum updates the maximum diameter...the function returns 1 + max(leftH, rightH) as the node’s height is processed...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time
- **Approach**: Used a stack of integer arrays to store each value along with the minimum so far...
  - Push stores both value and current minimum for constant-time retrieval.
  - Pop removes the top element, while top returns the latest value.
  - getMin() efficiently fetches the minimum by tracking it at each push.
- **Platform**: Leetcode

### DBMS
- **PS**: Filter Big Countries
- **Approach**: Used WHERE with OR to filter countries by area (≥ 3M km²) or population (≥ 25M)...retrieved country name, population, and area from the World table...
- **Platform**: Leetcode

---

## Day 6 - 31th January 2025

### DSA
1. **Problem 1**  
   - **PS**: Addition of two Linked-Lists
   - **Approach**: Used pointer-based traversal to iterate both lists, summing node values with carry...created a new node for each sum’s unit digit, updating carry for the next step...linked nodes sequentially to form the result list...continued until both lists and carry were processed, returning the new list’s head...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Top View of Binary Tree
   - **Approach**: Used a queue for level-order traversal, storing nodes with their horizontal distances...maintained a TreeMap to track the first node at each distance...processed nodes by dequeuing, recording the first occurrence per line, and enqueuing children with updated distances...extracted values from the map to form the top view list, ensuring sorted order by horizontal distance...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Bottom View of Binary Tree
   - **Approach**: Used a queue for level-order traversal, storing nodes with their horizontal distances...maintained a TreeMap to update the latest node at each distance...processed nodes by dequeuing, recording the most recent node per line, and enqueuing children with updated distances...extracted values from the map to form the bottom view list, ensuring sorted order by horizontal distance...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Peeking Iterator
- **Approach**: Ussed library Iterator to solve this prob...
  - Initialized nextval in the constructor if the iterator has elements.
  - peek() returns nextval without advancing.
  - next() returns nextval, updates it with the next element, or sets it to null.
  - hasNext() checks if nextval is non-null or if more elements exist.
- **Platform**: Leetcode

### DBMS
- **PS**: Department Highest Salary
- **Approach**: Used a subquery to find the highest salary in each department...joined Employee and Department tables on DepartmentId...filtered employees whose salary matches the department’s maximum salary...selected department name, employee name, and salary...
- **Platform**: Leetcode

---

## Day 7 - 1st Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Diagonal Traverse
   - **Approach**: Traversed the matrix diagonally using a boolean variBLE up...moved diagonally up until the top or right boundary, then adjusted row/column...moved diagonally down until the bottom or left boundary, then adjusted row/column...toggled up after each diagonal traversal...stored elements in a 1D array and returned the result.
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Diagonal Tree Traversal
   - **Approach**: Used a queue to traverse the tree diagonally...added the current node to the queue, then processed its left child if it exists...stored the node’s value in the list and moved to its right child...repeated the steps for all nodes in the queue until traversal was complete...returned the list of diagonal elements.
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Maximum Subarray Sum
   - **Approach**: Used Kadane’s Algorithm to find the maximum subarray sum in O(n) time...iterated through the array while maintaining a running sum...updated the maximum sum encountered so far...reset the sum to zero if it became negative to start fresh from the next element...ensured at least one element contributed to the result...returned the maximum sum found.
   - **Platform**: Leetcode

### OOPS
- **PS**: Implement Queue using Stacks 
- **Approach**: Used two stack to simulate queue operation...
  - Used two stacks (s1 and s2) to simulate queue behavior by reversing order during push()
  - pop() and peek() directly accessed the top element of s1 to maintain FIFO order.
  - empty() checked if s1 was empty, determining if the queue had elements.
- **Platform**: Leetcode

### DBMS
- **PS**: Customers Who Never Order
- **Approach**: Used LEFT JOIN to include all customers, even those without orders...matched customers with orders using customerId but retained unmatched rows...filtered results where Orders.id was NULL to list only customers who never placed an order...
- **Platform**: Leetcode

---

## Day 8 - 2nd Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: 2Sum
   - **Approach**: Used a HashMap to store numbers and their indices for quick access...iterated through the array, checking if the complement (target - current number) exists in the map...if found, returned indices; otherwise, stored the current number for future checks...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: 3Sum
   - **Approach**: Sorted the array and used a fixed pointer with two-pointer approach...iterated through the array, skipping duplicates, and used left and right pointers to find triplets summing to zero...adjusted pointers accordingly to avoid duplicates and find valid combinations efficiently...
   - **Platform**: Leetcode

3. **Problem 3**  
   - **PS**: 4Sum
   - **Approach**: Sorted the array and used two nested loops with a two-pointer approach…iterated through the array, skipping duplicates, and used left and right pointers to find quadruplets summing to the target...adjusted pointers accordingly to avoid duplicates and efficiently find valid combinations...
   - **Platform**: Leetcode

### OOPS
- **PS**: LRU Cache
- **Approach**: Simulated all operations using following operations...
  - Used a DLL for ordering and a HashMap for quick access to nodes...
  - Retrieved node from the map, moved it to the front if found, else returned -1...
  - Updated existing node or added a new one, evicting the least recently used if at capacity...
  - Used helper functions to delete a node and insert it after the head for efficient updates...
- **Platform**: Leetcode

### DBMS
- **PS**: Not Boring Movies
- **Approach**: Filtered movies with odd id and non-"boring" descriptions…sorted results by descending rating...
- **Platform**: Leetcode

---

## Day 9 - 3rd Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Warrior's Minimum Moves on Chessboard - Given an 8x8 chessboard, determine the minimum moves for a warrior to reach a destination, moving like both a knight and a king...
   - **Approach**: Used a BFS approach with a queue to explore possible moves from the starting position, considering both knight and king moves...marked visited positions to avoid revisiting and returned the number of moves when the destination is reached...
   - **Platform**: VSCode (Because it was customised problem given by CDC during interview)

2. **Problem 2**  
   - **PS**: Find a Corresponding Node of a Binary Tree in a Clone of That Tree
   - **Approach**: Used a recursive approach to traverse both the original and cloned binary trees simultaneously...when the target node is found in the original tree, return the corresponding node from the cloned tree...
   - **Platform**: Leetcode

3. **Problem 3**  
   - **PS**: Level of a Node in Binary Tree
   - **Approach**: Used a recursive helper function to traverse the binary tree, tracking the current level...when the target node is found, set the level and return true, otherwise continue the search in both left and right subtrees...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Design Circular Queue
- **Approach**: Simulated all operations using following operations...
  - Created a circular queue using an array, with front and rear pointers to track the first and last elements…initialized both to -1 when the queue is empty.
  - Added (enQueue) and removed (deQueue) elements while wrapping around the array using modular arithmetic…updated pointers to maintain circular behavior.
  - Included helper functions to check if the queue is full or empty (isFull, isEmpty) and to get the first and last elements (Front, Rear).
- **Platform**: Leetcode

### DBMS
- **PS**: Employees Earning More Than Their Managers
- **Approach**: Joined the Employee table to itself using managerId to match employees with their respective managers…compared each employee’s salary with their manager’s salary and selected only those employees who earn more than their managers…returned the names of such employees...
- **Platform**: Leetcode

---

## Day 10 - 4th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Symmetric Tree
   - **Approach**: Used a recursive approach to check if the left and right subtrees are mirror images. If both nodes are null, return true; if only one is null, return false. If values match, recursively compare their children in a mirrored manner....
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Merge K sorted Lists
   - **Approach**: Used a recursive approach to traverse both the original and cloned binary trees simultaneously...when the target node is found in the original tree, return the corresponding node from the cloned tree...
   - **Platform**: Leetcode

3. **Problem 3**  
   - **PS**: Reverse First K elements of Queue
   - **Approach**: Used a stack to reverse the first k elements of the queue while maintaining the order of the remaining elements. Dequeued k elements, pushed them onto the stack, then popped them back into the queue. Rotated the rest to maintain the original order...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Insert Delete GetRandom O(1)
- **Approach**: Simulated all operations using following operations...
  - Used a HashMap to store values with their indices for O(1) insert and remove operations.
  - Used an ArrayList to store elements, allowing O(1) random access.
  - Added the value to the list and stored its index in the map.
  - Swapped the target element with the last element, updated the map, and removed the last element.
  - Used Random to return a random element from the list in O(1) time.
- **Platform**: Leetcode

### DBMS
- **PS**: Rising Temperature
- **Approach**: Used a self-join to compare each day's temperature with the previous day's. The DATEDIFF function ensures the records are exactly one day apart. Selected the id where the current day's temperature is higher than the previous day's...
- **Platform**: Leetcode

---

## Day 11 - 5th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Reorder List
   - **Approach**: Used a two-pointer approach to find the middle of the linked list. If the list has fewer than three nodes, return as no reordering is needed. Split the list into two halves, then reverse the second half. Merge the two halves by alternating nodes from each...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Tree Boundary Traversal
   - **Approach**: Used a traversal-based approach to collect boundary nodes in three steps. First, added the root if it's not a leaf. Collected the left boundary excluding leaves, then all leaf nodes using a recursive traversal. Finally, stored the right boundary in reverse order to maintain the correct sequence...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Remove Nth Node From End of List
   - **Approach**: Used a two-pointer approach to find and remove the Nth node from the end. Initialized a dummy node to handle edge cases. Moved the first pointer N+1 steps ahead, then moved both pointers together until the first reached null. Adjusted the second pointer’s next reference to remove the target node...
   - **Platform**: Leetcode

### OOPS
- **PS**: Binary Search Tree Iterator
- **Approach**: Simulated all operations using following operations...
  - Used a stack-based approach to simulate an in-order traversal of the BST. Pushed all left nodes onto the stack during initialization.
  - The next() function pops the top node, processes its value, and pushes all left descendants of its right child onto the stack.
  - The hasNext() function checks if the stack is empty, determining whether more nodes remain in the traversal.
- **Platform**: Leetcode

### DBMS
- **PS**: Rank Scores
- **Approach**: Used a subquery approach to rank scores. Selected each score and determined its rank by counting distinct scores greater than or equal to it. Ordered the results in descending order to maintain ranking from highest to lowest...
- **Platform**: Leetcode

---

## Day 12 - 6th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Construct Binary Tree from String with bracket representation
   - **Approach**: Used recursion to construct a binary tree from a string with bracket representation. Parsed the numeric values to create nodes, handling negative numbers if present. Used a helper function to recursively build the left and right subtrees by detecting opening and closing brackets. Returned the root of the constructed tree after processing the entire string...
   - **Platform**: GeeksForGeeks

2. **Problem 2**  
   - **PS**: Merge Sort for Linked List
   - **Approach**: Used recursion to implement merge sort for a linked list. First, found the middle node to split the list into two halves. Recursively sorted both halves and then merged them using a helper function. The merge function combined the two sorted lists by comparing node values and linking them accordingly. Returned the head of the fully sorted linked list...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Quick Sort for Linked List
   - **Approach**: Used recursion to implement quick sort on a linked list. Selected the last node as the pivot and partitioned the list into three parts: nodes smaller than, equal to, and greater than the pivot. Recursively sorted the smaller and larger partitions. Finally, concatenated the sorted partitions to form the final sorted list and returned the head of the sorted linked list...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Find Median from Data Stream
- **Approach**: Simulated all operations using following operations...
  - Used two heaps – a max heap (for the first half of numbers) and a min heap (for the second half) to maintain a balanced data structure.
  - Balanced the heaps – ensured the max heap size is never more than one element larger than the min heap by moving elements when necessary.
  - Calculated the median – returned the average of the two heap tops if sizes were equal; otherwise, returned the max heap’s top element.
- **Platform**: Leetcode

### DBMS
- **PS**: User Activity for the Past 30 Days I
- **Approach**: Used SQL to retrieve user activity for the past 30 days. Filtered records within the date range 2019-06-28 to 2019-07-27 and excluded entries outside this range. Grouped data by activity date and counted distinct user IDs to determine daily active users. Returned the date and the corresponding number of active users...
- **Platform**: Leetcode

---

## Day 13 - 7th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Reverse Linked List
   - **Approach**: Used an iterative approach to reverse a singly linked list. Initialized three pointers: prev (to track the previous node), pres (to track the current node), and nex (to track the next node). Iterated through the list, updating pointers to reverse the links. Set pres.next to prev at each step to reverse the direction of the link, moved prev forward, and advanced pres and nex. Returned prev as the new head of the reversed list after traversal...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Linked List Cycle
   - **Approach**: Used Floyd’s Cycle Detection Algorithm (Tortoise and Hare) to detect a cycle in a linked list. Initialized two pointers: slow (moves one step at a time) and fast (moves two steps at a time). Iterated through the list while fast and fast.next are not null. If slow and fast meet at any node, a cycle exists, and true is returned. If the loop exits without a meeting point, false is returned, indicating no cycle...
   - **Platform**: Leetcode

3. **Problem 3**  
   - **PS**: Merge Two Sorted Lists
   - **Approach**: Used an iterative approach with a dummy node to merge two sorted linked lists. Initialized a dummy node to simplify edge cases and a current pointer to build the merged list. Iterated through both lists, comparing node values and linking the smaller node to current. Moved current forward after each selection. If any list remains after traversal, linked the remaining nodes directly. Returned dummy.next as the head of the merged sorted list...
   - **Platform**: Leetcode

### OOPS
- **PS**: Design Add and Search Words Data Structure
- **Approach**: Simulated all operations using following operations...
  - Used a Trie (prefix tree) to store words, where each letter is a node, and the last letter of a word is marked as the end.
  - addWord stores words by going through each letter and creating nodes if they don’t already exist.
  - search checks if a word exists by moving through the Trie, letter by letter.
  - Handled '.' specifically by checking all possible letters at that position, making it work for pattern-based searches.
- **Platform**: Leetcode

### DBMS
- **PS**: Project Employees I
- **Approach**: Joined the Project and Employee tables based on employee_id to match employees with their projects. Grouped the data by project_id and calculated the average experience of employees in each project. Used ROUND() to keep the result up to two decimal places. Returned the project_id along with the average experience of employees working on that project...
- **Platform**: Leetcode

---

## Day 14 - 8th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Best Time to Buy and Sell Stock
   - **Approach**: Used an iterative approach to track the minimum price and maximum profit. Initialized min as the first price and maxProfit as 0. Iterated through prices, updating min and maxProfit accordingly. Returned maxProfit after traversal in O(n) time and O(1) space...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Reverse a Doubly Linked List
   - **Approach**: Used a two-pointer approach to reverse the doubly linked list in place. Initialized prev as null and curr as head. Iterated through the list, swapping the next and prev pointers for each node. Moved curr forward using the updated prev reference. Returned prev.prev as the new head after traversal. Achieves O(n) time complexity with O(1) space complexity...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Flattening a Linked List
   - **Approach**: Used a recursive approach to flatten a linked list where each node has a next and bottom pointer. First, recursively flattened the next list, reducing the problem size. Then, merged the current node with the flattened list using a helper function that merges two sorted lists using the bottom pointer. Maintained a dummy node for easier merging and ensured next pointers were nullified. Achieves O(n * m) time complexity (where n is the number of nodes in the top-level list and m is the average number of bottom nodes) with O(1) extra space...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Flatten Nested List Iterator
- **Approach**: Simulated all operations using following operations...
  - Flattening the List: Used a helper function to extract all numbers from the nested list and store them in a simple list.
  - Preprocessing in Constructor: Converted the nested list into a flat list at the start so that iteration becomes easy.
  - Iterator Functions: next() returns the next number and moves forward, while hasNext() checks if more numbers are left.
  - Fast Access: Since the list is already flattened, getting the next number is quick (O(1) time), and the setup takes O(n) time.
- **Platform**: Leetcode

### DBMS
- **PS**: Exchange Seats
- **Approach**: Used a CASE-based approach to swap adjacent student IDs in the Seat table. Checked if the id is the maximum and odd, keeping it unchanged to handle cases where the total number of rows is odd. Otherwise, swapped adjacent rows by adding 1 to odd ids and subtracting 1 from even ids. Ensured the result was ordered correctly using ORDER BY id. Achieves O(n) time complexity with constant space usage...
- **Platform**: Leetcode

---

## Day 15 - 9th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Longest Valid Parentheses
   - **Approach**: Used two hash maps: one to track element frequency and another to store stacks of elements by frequency. Maintained maxFreq to track the highest frequency. In push, updated frequency, adjusted maxFreq, and added the element to its stack. In pop, removed the most recent element from the highest frequency stack, updated frequency, and reduced maxFreq if needed. Both operations run in O(1) time with O(n) space...
   - **Platform**: Leetcode

2. **Problem 2**  
   - **PS**: Evaluation of Postfix Expression
   - **Approach**: Used a stack-based approach to evaluate a postfix expression. Iterated through the string, pushing digits onto the stack. When encountering an operator, popped the top two elements, applied the operation, and pushed the result back. Repeated this process until the expression was fully evaluated. Returned the final result from the stack. Runs in O(n) time with O(n) space for the stack...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Next Greater Element II
   - **Approach**: Used a recursive approach to flatten a linked list where each node has a next and bottom pointer. First, recursively flattened the next list, reducing the problem size. Then, merged the current node with the flattened list using a helper function that merges two sorted lists using the bottom pointer. Maintained a dummy node for easier merging and ensured next pointers were nullified. Achieves O(n * m) time complexity (where n is the number of nodes in the top-level list and m is the average number of bottom nodes) with O(1) extra space...
   - **Platform**: Leetcode

### OOPS
- **PS**: Maximum Frequency Stack
- **Approach**: Simulated all operations using following operations...
  - Kept track of how often each number appears (freq) and stored numbers in stacks based on their frequency (group). Used maxFreq to remember the highest frequency.
  - Increased the count of the number, updated maxFreq if needed, and added it to the correct stack.
  - Took out the most recent number from the highest frequency stack, reduced its count, and lowered maxFreq if the stack became empty.
  - Both push and pop work very quickly in O(1) time, using extra space for storing numbers.
- **Platform**: Leetcode

### DBMS
- **PS**: Reformat Department Table
- **Approach**: Used a pivot table approach to transform monthly revenue into columns. Grouped by id and used MAX with CASE to extract revenues for each month. Runs in O(n) time...
- **Platform**: Leetcode

---

## Day 16 - 10th Feb 2025

### DSA
1. **Problem 1**  
   - **PS**: Multiply two linked lists
   - **Approach**: Converted two linked lists into numbers by iterating through them and forming the number digit by digit. Used modulo operation to prevent overflow. Multiplied the two numbers and applied modulo again to return the final result. Runs in O(n + m) time with O(1) space...
   - **Platform**: GeeksForGeeks

2. **Problem 2**  
   - **PS**: Delete nodes having greater value on right
   - **Approach**: Recurred to the end of the linked list and processed nodes in reverse order. Updated the next pointers to skip nodes having a greater value on the right. Returned the modified head. Runs in O(n) time with O(n) recursion space...
   - **Platform**: GeeksForGeeks

3. **Problem 3**  
   - **PS**: Next Greater Element
   - **Approach**: Used a stack to efficiently find the next greater element for each array element in reverse order. Popped smaller elements to maintain the stack's decreasing order. Assigned the next greater element or -1 if none existed. Converted the result array to an ArrayList. Runs in O(n) time with O(n) space...
   - **Platform**: GeeksForGeeks

### OOPS
- **PS**: Design HashSet
- **Approach**: Simulated all operations using following operations...
  - Used a boolean array of size 1,000,001 to directly store presence of elements, ensuring O(1) time complexity for add, remove, and contains operations.
  - Eliminated the need for complex hashing or collision handling by utilizing direct indexing, leading to O(n) space usage...
- **Platform**: Leetcode

### DBMS
- **PS**: Swap Salary
- **Approach**: Used a CASE statement in the UPDATE query to swap 'm' with 'f' and vice versa for the sex column. Runs in O(n) time with O(1) space...
- **Platform**: Leetcode
