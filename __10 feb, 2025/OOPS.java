// Problem: Design HashSet

class MyHashSet {
    public boolean[] set=new boolean[1000001];

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        set[key]=true;
    }
    
    public void remove(int key) {
        set[key]=false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
}
