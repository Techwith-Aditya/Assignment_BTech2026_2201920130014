// Problem: Insert Delete GetRandom O(1)

class RandomizedSet {
    private HashMap<Integer, Integer> map; 
    private ArrayList<Integer> a;
    private Random random;

    public RandomizedSet() {
        map=new HashMap<>();
        a=new ArrayList<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) 
        {
            return false;
        }
        a.add(val);
        map.put(val, a.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) 
        {
            return false;
        }
        int index=map.get(val);
        int last=a.get(a.size()-1); 

        a.set(index, last);
        map.put(last, index);

        a.remove(a.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return a.get(random.nextInt(a.size()));
    }
}
