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
- **Approach**: Initialized parking slots in the constructor. The addCar method decrements the slot count for the given carType if available and returns true; otherwise, returns false... 
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
- **Approach**: Initialize nums..for sumRange, iterate from left to right & add elements to sum...at last, Return sum...
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
- **Approach**: Initialize a map array of size maximum given...the put method stores a value, get returns it, and remove sets it to -1 for deletion...
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
- **Approach**:
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
   - **PS**:   
   - **Approach**:  
   - **Platform**:  

2. **Problem 2**  
   - **PS**: 
   - **Approach**: 
   - **Platform**:

3. **Problem 3**  
   - **PS**:  
   - **Approach**: 
   - **Platform**: 

### OOPS
- **PS**:   
- **Approach**:   
- **Platform**:  

### DBMS
- **PS**: 
- **Approach**: 
- **Platform**:
