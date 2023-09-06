//BFS
package lab_bfs;

import java.util.LinkedList;
import java.util.Queue;


public class LAB_BFS {

  
       public static void main(String[] args) {
            int adj[][]={
                 {0, 1, 0, 1},
                 {1, 0, 1, 1},
                 {0, 1, 0, 1},
                 {0, 1, 0, 1},
                 {1, 1, 0, 1,},
                 {0, 0, 0, 1,}
         
    };
        int color[] = new int [4];   // 0= White 1=Gray 2=Black 
        int d[] = new int[4];
        int prev[] = new int [4];
         int cB[] = new int[4];
        Queue<Integer> q = new LinkedList<Integer>();
         
        //initalization
        
        int s = 0;
         for(int i=0;i<4;i++){
             color[i] = 0; //white
             d[i] = 999;   //infinity
             prev[i] = -1;
             cB[i] = 0;
         }
         color[s] = 1;
         d[s] =0;
         prev[s] = -1;
        
         
         q.add(s);
         int u;
         int v;
         while(!q.isEmpty()){
         
             u = q.remove();
             for(v=0;v<4;v++){
                 
             
                if(adj[u][v]==1) {
                    if(color[v]==0){
                            cB[v] = 1-cB[u];
                        color[v] = 1;
                        d[v] = d[u]+1;
                        prev[v] =  u;
                        q.add(v);
                    }
                    else if(cB[v]==cB[u]) {
                    System.out.println("is not a bipartate");
                        break;
                    }
                    
                }
                 
             }
             color[u] = 2;   //color = 2 Black
             System.out.println(u);
             
             
    }
         printPath(prev,0,2);  //  0=source 3=destination   path printing 
         System.out.println();
}
       
static void printPath(int prev[],int s, int v){
    if (s==v){
        System.out.print(" "+s);
    }
    else if(prev[v] == -1){
        System.out.println("Path does not exist.");
    }
    else{
        printPath(prev, s, prev[v]);  //recursive call
        System.out.print("- ->"+v);
    }
    
    
}
}
