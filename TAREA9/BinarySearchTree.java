package TAREA9;
import java.util.Locale;


public class BinarySearchTree {

    
    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    
    private Node root;

    
    public BinarySearchTree() {
        root = null;
    }

    
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    
    private Node insertRecursive(Node current, int value) {
    
        if (current == null) {
            return new Node(value);
        }

        
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            
            return current;
        }

        return current;
    }

   
    public Node search(int value) {
        return searchRecursive(root, value);
    }

   
    private Node searchRecursive(Node current, int value) {
        
        if (current == null) {
            return null;
        }
        
        
        if (current.value == value) {
            return current;
        }

       
        return value < current.value
                ? searchRecursive(current.left, value)  
                : searchRecursive(current.right, value); 
    }

    
    public void remove(int value) {
        root = removeRecursive(root, value);
    }

   
    private Node removeRecursive(Node current, int value) {
        if (current == null) {
            return null; 
        }

        
        if (value < current.value) {
            current.left = removeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = removeRecursive(current.right, value);
        } else {
            

            
            if (current.left == null && current.right == null) {
                return null;
            }

            
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

           
            int smallestValue = findSmallestValue(current.right);
            
            current.value = smallestValue;
            
            current.right = removeRecursive(current.right, smallestValue);
        }
        return current;
    }

    
    private int findSmallestValue(Node node) {
        return node.left == null ? node.value : findSmallestValue(node.left);
    }

    
    public void transversal(String format) {
       
        switch (format.toLowerCase()) {
            case "inorden":
                System.out.print("Recorrido In-Orden: ");
                inOrden(root); // 
                break;
            case "preorden":
                System.out.print("Recorrido Pre-Orden: ");
                preOrden(root); // 
                break;
            case "postorden":
                System.out.print("Recorrido Post-Orden: ");
                postOrden(root); // 
                break;
            default:
                System.out.println("Formato de recorrido no válido. Use: inorden, preorden o postorden.");
                break;
        }
        System.out.println(); 
    }

   
    private void inOrden(Node node) {
        if (node != null) {
            inOrden(node.left);
            System.out.print(node.value + " ");
            inOrden(node.right);
        }
    }

   
    private void preOrden(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrden(node.left);
            preOrden(node.right);
        }
    }

    
    private void postOrden(Node node) {
        if (node != null) {
            postOrden(node.left);
            postOrden(node.right);
            System.out.print(node.value + " ");
        }
    }

    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        System.out.println("--- Insertando Valores ---");
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        

        System.out.println("\n--- Recorridos ---");
        bst.transversal("inorden");   
        bst.transversal("preorden"); 
        bst.transversal("postorden"); 

        System.out.println("\n--- Búsqueda ---");
        Node nodo = bst.search(40);
        if (nodo != null) {
            System.out.println("search(40) encontró el nodo con valor: " + nodo.value);
        } else {
            System.out.println("search(40) no encontró el nodo.");
        }
        
        nodo = bst.search(99);
        if (nodo != null) {
            System.out.println("search(99) encontró el nodo con valor: " + nodo.value);
        } else {
            System.out.println("search(99) no encontró el nodo.");
        }

        System.out.println("\n--- Eliminación ---");
        
        
        System.out.println("Eliminando 20 (nodo hoja)...");
        bst.remove(20);
        bst.transversal("inorden"); 

        
        System.out.println("Eliminando 30 (un hijo)...");
        bst.remove(30);
        bst.transversal("inorden"); 

        
        System.out.println("Eliminando 50 (dos hijos)...");
        bst.remove(50); 
        bst.transversal("inorden"); 
        
        System.out.println("Raíz actual (después de eliminar 50): " + bst.root.value);
    }
}