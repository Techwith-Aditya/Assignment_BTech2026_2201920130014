// Problem: Flatten Nested List Iterator

public class NestedIterator implements Iterator<Integer> {
    ArrayList<Integer> ans=new ArrayList<>();;
    int curr=0;

    public NestedIterator(List<NestedInteger> nestedList) {
        for(NestedInteger integer:nestedList)
        {
            helper(integer);
        }
    }

    @Override
    public Integer next() {
        return ans.get(curr++);
    }

    @Override
    public boolean hasNext() {
        return curr<ans.size();
    }

    public void helper(NestedInteger value) {
        if(value.isInteger())
        {
            ans.add(value.getInteger());
        }
        else
        {
            for(NestedInteger integer:value.getList())
            {
                helper(integer);
            }
        }
    }
}
