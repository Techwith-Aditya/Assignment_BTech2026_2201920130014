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

---
