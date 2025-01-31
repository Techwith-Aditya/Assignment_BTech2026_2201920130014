// Problem: Peeking Iterator

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> i=null;
    private Integer nextval=null;

	public PeekingIterator(Iterator<Integer> iterator) {
	    i=iterator;
        if(hasNext())
        {
            nextval=i.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextval;
	}
	
    // Returns the next element in the array and moves the pointer to the next element.
	@Override
	public Integer next() {
	    Integer val=nextval;
        if(i.hasNext())
        {
            nextval=i.next();
        }
        else
        {
            nextval=null;
        }
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return nextval!=null || i.hasNext();
	}
}
// ___________________________________________________________________

// Explanation with table: [1, 2, 3]

// Initially, nextval ko null declare kra h, aur constructor me jake check kra h agr koi value h to nextval will store the first element of the list...

// Operation	  Output	                 nextval	        Comments
// peek()		  1  	                     1                  Returns next element without moving
// next()		  1	                         2                  Moves to the next element
// peek()		  2	                         2                  Still 2, no movement
// next()		  2	                         3                  Moves to 3
// hasNext()	  true		                 3                  nextval is not null
// next()		  3	                         null               No more elements left
// hasNext()	  false		                 null               No elements left

// ___________________________________________________________________

// Assume that the iterator is initialized to the beginning of the list: [1,2,3].

// Call next() gets you 1, the first element in the list...and moves pointer to 2... 
// Now you call peek() and it returns 2, the next element. Calling next() after that still returns 2...but moves pointer to 3...

// You call next() the final time and it returns 3, the last element...and pointer moves to null...
// Calling hasNext() after that should return false.
