class RandomizedSet {

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());

        set.print();

    }

    static final int size = 5;
    int[] arr = new int[size];
    static int length;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        length = 0;
        for(int i=0;i<size;i++){
            arr[i] = -1;
        }
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        int key = val%size;
        
        if(arr[key] == -1){
            arr[key] = val;
            length++;
            return true;
        }else{
            return false;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        int key = val%size;
        if(arr[key] == val){
            arr[key] = -1;
            length--;
            return true;
        }else{
            return false;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int randomNumber = (int)(Math.random() * length);
        return arr[randomNumber];
    }

    public void print(){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
