#include<iostream>
using namespace std;
int vertArr[10][10];
int count = 0;
void displayMatrix(int a) {
   int x, y;
   for(x = 0; x < a; x++) {
      for(y = 0; y < a; y++) {
         cout << vertArr[x][y] << " ";
      }
      cout << endl;
   }
}
void add_edge(int i, int j) {
   vertArr[i][j] = 1;
   vertArr[j][i] = 1;
}
main(int argc, char* argv[]) {
   int a = 6;
   add_edge(0, 4);
   add_edge(0, 3);
   add_edge(1, 2);
   add_edge(1, 4);
   add_edge(1, 5);
   add_edge(2, 3);
   add_edge(2, 5);
   add_edge(5, 3);
   add_edge(5, 4);
   displayMatrix(a);
}



