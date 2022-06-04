package com.company;
public class NodeAdjacent {
    //untuk menginputan character
    //class ini untuk membuat graf lalu membuat graf pada setiap node
    private char data;
    private boolean visited = false;
         NodeAdjacent(char abjad) {
         this.data = abjad;
         }
         public char getData() {
         return data;
         }
         public boolean isVisited() {
         return visited;
         }
         public void setVisited(boolean visited) {
         this.visited = visited;
         }
}


