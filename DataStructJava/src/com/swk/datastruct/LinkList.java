package com.swk.datastruct;

public class LinkList {  
    private class Node{  
        private Object obj;  
        private Node next = null;  
          
        Node(Object obj){  
            this.obj = obj;  
        }  
    }  
      
    private Node head = null;  
      
    public void insertFirst(Object obj){  
        Node node = new Node(obj);  
        node.next = head;  
        head = node;
    }  
      
    public Object deleteFirst() throws Exception{  
        if(head == null)  
            throw new Exception("empty!");  
        Node temp = head;  
        head = head.next;  
        return temp.obj;  
    }  
      
    public Object find(Object obj) throws Exception{  
        if(head == null)  
            throw new Exception("LinkedList is empty!");  
        Node cur = head;  
        while(cur != null){  
            if(cur.obj.equals(obj)){  
                return cur.obj;  
            }  
            cur = cur.next;  
        }  
        return null;  
    }  
      
    public void remove(Object obj) throws Exception{  
        if(head == null)  
            throw new Exception("LinkedList is empty!");  
        if(head.obj.equals(obj)){  
            head = head.next;  
        }else{  
            Node pre = head;  
            Node cur = head.next;  
            while(cur != null){  
                if(cur.obj.equals(obj)){  
                    pre.next = cur.next;  
                }  
                pre = cur;  
                cur = cur.next;  
            }  
        }  
    }  
      
    public boolean isEmpty(){  
        return (head == null);  
    }  
      
    public void display(){  
        if(head == null)  
            System.out.println("empty");  
        Node cur = head;  
        while(cur != null){  
            System.out.print(cur.obj.toString() + " \t ");  
            cur = cur.next;  
        }  
        System.out.print("\n");  
    }  
      
    public static void main(String[] args) throws Exception {  
    	
        LinkList ll = new LinkList();  
        ll.insertFirst(4);  
        ll.insertFirst(3);  
        ll.insertFirst(2);  
        ll.insertFirst(1);  
        ll.display();  
        ll.deleteFirst();  
        ll.display();  
        ll.remove(3);  
        ll.display();  
        System.out.println(ll.find(1));  
        System.out.println(ll.find(4));  
    }  
}  