/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treesort;

/**
 *
 * @author doscom
 */
class Tree{
                Node root=null;				
                 public void printNodes(){			
                if (root==null)
                    return;
                else{
                  root.printNodes();
                }		
                }
                public void insert(Comparable c){		 						
                if (root==null)			
                  root = new Node(c);			
                else							
                  root.insert(c);				
                }
 }
class Node{
          Node left;					   
          Node right;					
          Comparable key;					
          public Node(Comparable c){			
                        key=c;				
                        left=null;				
                        right=null;			
    }
          public void printNodes(){								
                        if (left!=null)				
                          left.printNodes();		
                        System.out.println(key);		
                        if (right!=null)			
                          right.printNodes();		
          }
          public void insert(Comparable c){		
                        if (c.compareTo(this.key) < 0 ){	
                          if (left == null)
                                left=new Node(c);
                          else
                                left.insert(c);		
                        }
                         else {
                           if (right == null)		
                                right=new Node(c);		
                          else
                                right.insert(c);		
                        }
         }
 }
          
public class Treesort
{
   public static void main(String []args){		
       Tree tree= new Tree();			
        tree.insert(5);				
        tree.insert(4);				
        tree.insert(2);				
        tree.insert(3);				
        tree.insert(8);				
        tree.insert(6);				
        tree.insert(1);				
        tree.insert(7);   				
       tree.printNodes();				
  }
}

