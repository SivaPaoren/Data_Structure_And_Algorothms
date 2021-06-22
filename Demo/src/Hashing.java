

public class Hashing {
    public static void main(String[] args) {
      int arr[] = new int[10];
       for(int i=0;i<10;i++){
         arr[i] = i+1;
       }

      

       for(int i=0;i<10;i++){
        int randomNumber = (int)(Math.random()*5);
        System.out.println(arr[randomNumber]);
       }

    }
}

class HashTable_CloseHashing{
    static final int SIZE = 5;
    int arr[] = new int[SIZE];
    
    public HashTable_CloseHashing(){
        for(int i=0;i<SIZE;i++){
           arr[i] = -1;
        }
    }

    public int insert(int val){
        int key = val % SIZE;
        int index = key;

        while(arr[index] != -1){
            index = (index+1)% SIZE;
            if(index == key){
                System.out.println("The HashTable is full");
                return 0;
            }
        }
        arr[index] = val;
        return 1;
    }

    public boolean delete(int val){
         int key = val % SIZE;
         int index = key;

         while(arr[index] != val){
             index = (index+1)%SIZE;
             if(index == key){
                 return false;
             }
         }
         arr[index] = -1;
         return true;
    }

    public boolean Contains(int val){
         int key = val % SIZE;
         int index  = key;

         while(arr[index] != val){
            index = (index+1) % SIZE;
            if(index == key)return false;
         }
         return true;
    }

    public void show(){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}


class HashTable_OpenHashing{
       static final int size = 7;
       Node [] chain = new Node[size];
        
       public void insert(int val){
          Node node = new Node(val);
          int key = val % size;
          
          if(chain[key] == null){
             chain[key] = node;
          }else{
              Node temp = chain[key];

              while(temp.next != null){
                  temp = temp.next;
              }
              temp.next = node;
          }
       }

       public boolean search(int val){
            int key = val % size;

               Node temp = chain[key];  
               while(temp != null){
                  if(temp.val == val){
                    return true;
                  }
                 temp = temp.next;
               }
            return false;
       }

       public boolean delete(int val){
           int key = val % size;
           Node temp = chain[key];
           
           if(temp != null){
                    if(temp.val == val){
                        temp = temp.next;
                        return true;
                    }else{

                          while(temp.next != null){
                              if(temp.next.val == val){
                                  temp.next = temp.next.next;
                                  return true;
                              }
                              temp = temp.next;
                          }
                    }
                 
           }
           return false;
       }


       public void show(){
           for (Node node : chain) {
               Node temp = node;
               while(temp != null){
                   System.out.print(temp.val +" ");
                   temp = temp.next;
               }
               System.out.println("");
           }
       }

}

class Node{
    int val;
    Node next;
    
    public Node(){

    }
    public Node(int val){
       this.val = val;
       next = null;
    }
}


