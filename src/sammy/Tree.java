package sammy;

import com.sun.source.tree.WhileLoopTree;

public class Tree {
    public class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

     public void insert (int value){
         if (root == null) {
             root = new Node(value);
             return;
         }
         // MY CODE. THIS CAN BE CHANGE
         var current = root;

         while (true){
             if (current == null)
                 current.value = value;

             if (current.value < value)
                 current = current.rightChild;
             else if (value < current.value)
                 current = current.leftChild;
         }
     }

     public boolean find (int value)
     {
         var current = root;

         while (current != null){
             if (current.value == value)
                 return true;
             else if (current.value < value)
                 current = current.rightChild;
             else if (value < current.value)
                 current = current.leftChild;
         }
         return false;

     }
}
