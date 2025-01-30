// Problem: Design HashMap

class MyHashMap {
    int[] map=new int[10000001];
    public MyHashMap() {
        for(int i=0; i<map.length; i++)
        {
            map[i]=-1;
        }
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key]=-1;
    }
}
