package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<NodeAdjacent> nodes = new ArrayList<>();

        NodeAdjacent node1 = new NodeAdjacent('A');
        NodeAdjacent node2 = new NodeAdjacent('B');
        NodeAdjacent node3 = new NodeAdjacent('C');
        NodeAdjacent node4 = new NodeAdjacent('D');
        NodeAdjacent node5 = new NodeAdjacent('E');
        NodeAdjacent node6 = new NodeAdjacent('F');
        NodeAdjacent node7 = new NodeAdjacent('G');
        NodeAdjacent node8 = new NodeAdjacent('H');
        NodeAdjacent node9 = new NodeAdjacent('I');

        nodes.add(node1);   nodes.add(node2);   nodes.add(node3);   nodes.add(node4);   nodes.add(node5);
        nodes.add(node6);   nodes.add(node7);   nodes.add(node8);   nodes.add(node9);

        /*
        Method utama, berisi penentuan matriks dan pemanggilan algoritma.
        Daftar simpul, dengan asumsi value unik
        */


        int matriks[][] = {
           //    A  B  C  D  E  F  G  H  I
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // A : value 1
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // B : value 2
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // C : value 3
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // D : value 4
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // E : value 5
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // F : value 6
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // G : value 7
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // H : value 8
                {0, 0, 0, 0, 0, 1, 0, 0, 0}  // I  : value 9
        };
        //BFS traversal
        BFS_ADJACENT bfsAdjacent = new BFS_ADJACENT(nodes);
        System.out.println("BFS Traversal Graph: ");
        bfsAdjacent.bfs(matriks, node1);
        System.out.println();

        // Rest visited nodes from bfs function
        for(NodeAdjacent node : nodes){
            node.setVisited(false);
        }
//        DFS taversal
        DFS_ADJACENT dfsAdjacent = new DFS_ADJACENT(nodes);
        System.out.println("DFS Traversal Graph: ");
        dfsAdjacent.dfsUsingStack(matriks, node1);
    }
}
