
package lab.pkg02;

import java.util.LinkedList;
import java.util.Queue;

public class Lab02 {

  
    public static void main(String[] args) {
    int adj[][]={{1, 1, 0, 0, 1, 0},
                 {1, 0, 1, 0, 1, 0},
                 {0, 1, 0, 1, 0, 0},
                 {0, 0, 1, 0, 1, 1},
                 {1, 1, 0, 1, 0, 0},
                 {0, 0, 0, 1, 0, 0}
         
    };
        int n = adj.length;
        //System.out.println(rowNumber);
        //int columnNumber = adj[0].length;
        System.out.println("Neighbour of 1 node");
        
        for (int i=0;i<n;i++){
        
        for (int j=0;j<n;j++){
            
        
            if (adj[i][j]==1){
                System.out.print(" "+j);
            }
        }
        System.out.println();
    }
    Queue<Integer>q = new LinkedList<Integer>();
    
        q.add(4);            //enqueue
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(10);
        
     int a = q.remove();     //dequeue
     int l = q.size();
     System.out.println(a);
     
     boolean b = q.isEmpty();
     System.out.println(b);
        
        
     while(!q.isEmpty()){   
         
     System.out.print(q.remove()+" ");
     }
}
 
}
