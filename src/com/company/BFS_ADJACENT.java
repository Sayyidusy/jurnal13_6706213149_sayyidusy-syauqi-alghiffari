package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS_ADJACENT {
    private Queue<NodeAdjacent> queue = new LinkedList<>(); //daftar Queue
    ArrayList<NodeAdjacent> nodes = new ArrayList<NodeAdjacent>();

    public BFS_ADJACENT(ArrayList<NodeAdjacent> nodes) {
        this.nodes = nodes;
    }
    /*
    Method ini digunakan untuk mencari daftar tetangga dari suatu simpul.
    Daftar tetangga didapatkan dari matrik adjacent.
    */
    public ArrayList<NodeAdjacent> listTetangga(int matriks[][], NodeAdjacent node) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == node.getData()) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx][j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }
    //bagian BFS
    public void bfs(int matriks[][], NodeAdjacent node) {
        queue.add(node);
        while (!queue.isEmpty()) {
            NodeAdjacent element = queue.remove();
            System.out.print(element.getData() + " "); //langsung memunculkan BFS nya
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }

}

