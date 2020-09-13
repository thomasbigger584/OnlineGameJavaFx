package com.jpro.hellojpro;

import java.util.ArrayList;

public class ModelList { 
	  
    private static Node head;
    private static int count;
    
    static class Node { 
  
        String player;
        String title;
        String article;
        Node next; 
   
        Node(String p, String t, String a){ 
            player = p;
            title = t;
            article = a;
            next = null; 
        } 
    }
    
    private static ModelList list;
    public ModelList() {
    	list.head = null;
    	count = 0;
    }
    
    public void insert(String player,String title,String article) { 
        Node new_node = new Node(player,title,article); 
        new_node.next = null;
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else {  
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            }  
            last.next = new_node; 
        }  
    }
    public static int getNumOFTitle(){ 
        Node currNode = list.head;
        int num = 0;
        while (currNode != null) { 
        	num += 1;
//            System.out.print(currNode.player + " "); 
            currNode = currNode.next; 
        }
        return num;
    }
    
    public static ArrayList getTitleList() {
    	ArrayList<String> titles = new ArrayList<String>();
    	Node currNode = list.head;
        while (currNode != null) { 
            titles.add(currNode.title); 
            currNode = currNode.next; 
        }
        return titles;
    }
    
    public static String getArticle(String titleName) {
    	String artcl = "";
    	Node currNode = list.head;
        while (currNode != null) { 
            if(titleName.equals((currNode.title))) {
            	artcl = currNode.article; 
            }
            currNode = currNode.next; 
        }
        return artcl;
    }
    
    public static String getPlayer(String titleName) {
    	String plr = "";
    	Node currNode = list.head;
        while (currNode != null) { 
            if(titleName.equals((currNode.title))) {
            	plr = currNode.player; 
            }
            currNode = currNode.next; 
        }
        return plr;
    }
   
} 
