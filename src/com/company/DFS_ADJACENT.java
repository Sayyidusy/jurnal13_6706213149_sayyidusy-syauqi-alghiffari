package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class DFS_ADJACENT {
    ArrayList<NodeAdjacent> nodes = new ArrayList<>();
    public DFS_ADJACENT(ArrayList<NodeAdjacent> nodes){
        this.nodes = nodes;
    }
    public ArrayList<NodeAdjacent> findNeighbours(int matriks[][], NodeAdjacent node) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(node)) {
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

    public void dfsUsingStack(int matriks[][], NodeAdjacent node) {
        Stack<NodeAdjacent> stack = new Stack<>();
        stack.add(node);
        while (!stack.isEmpty()) {
            NodeAdjacent element = stack.pop();
            if (!element.isVisited()) {
                System.out.print(element.getData()+ " ");
                element.setVisited(true);
            }

            ArrayList<NodeAdjacent> tetangga = findNeighbours(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    stack.add(n);
                }
            }
        }
    }
}

/*
Method utama, berisi penentuan matriks dan pemanggilan algoritma.
Daftar simpul, dengan asumsi value unik
*/