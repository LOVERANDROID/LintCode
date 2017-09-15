package com.lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
	int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	Node root;
	public static List<Node> nodeList = null; 
	public static void main(String argc[]){
		BinaryTree test2 = new BinaryTree();
		//test2.createBinaryTree();
		test2.initBinaryTree();
		Node root = test2.root;
		System.out.println("先序遍历");
		preOrder(root);
		System.out.println();
		
		System.out.println("中序遍历");
		inOrder(root);
		System.out.println();
		
		System.out.println("后序遍历");
		lastOrder(root);
		System.out.println();
		
		List<Integer> list = new ArrayList<>();
		System.out.println("层序遍历");
		levelIterator(root, list);
		System.out.println(list);
	}
	
	
	
	public static class Node{
		Node leftChild;
		Node rightChild;
		int data;
		public Node(int newData){
			this.leftChild = null;
			this.rightChild = null;
			this.data = newData;
		}
		public Node(int newData, Node leftChild, Node rightChild){
			this.leftChild = leftChild;
			this.rightChild = rightChild;
			this.data = newData;
		}
	}
	
	//完全二叉树的创建
	public void createBinaryTree(){
		nodeList = new ArrayList<>();
		//将数组的值一次转换为node结点
		for (int i = 0; i < a.length; i++) {
			Node node = new Node(a[i]);
			nodeList.add(node);
		}
		for (int i = 0; i < a.length/2 - 1; i++) {
			//左孩子
			nodeList.get(i).leftChild = nodeList.get(i * 2 + 1);
			//右孩子
			nodeList.get(i).rightChild = nodeList.get(i * 2 + 2);
		}
		int last = a.length/2 - 1;
		nodeList.get(last).leftChild = nodeList.get(last*2 + 1);
		if (a.length%2 == 1) {
			nodeList.get(last).rightChild = nodeList.get(last*2 + 2);
		}	
	}
	//初始化二叉树
	public void initBinaryTree(){
		Node i = new Node(9, null, null);
		Node h = new Node(8, null, null);
		Node g = new Node(7, null, null);
		Node f = new Node(6, null, i);
		Node e = new Node(5, null, null);
		Node d = new Node(4, g, h);
		Node c = new Node(3, e, f);
		Node b = new Node(2, d, null);
		Node a = new Node(1, b, c);
		root = a;		
	}
	
	//先序遍历
	public static void preOrder(Node node){
		if (node == null) {
			return;
		}
		System.out.print(node.data + ",");
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
	
	//中序遍历
	public static void inOrder(Node node){
		if (node == null) {
			return;
		}
		inOrder(node.leftChild);
		System.out.print(node.data + ",");
		inOrder(node.rightChild);
	}
	
	//后序遍历
	public static void lastOrder(Node node){
		if (node == null) {
			return;
		}
		lastOrder(node.leftChild);
		lastOrder(node.rightChild);
		System.out.print(node.data + ",");
	}
	
	//层序遍历
	public static void levelIterator(Node node, List<Integer> list){
		if (node == null) {
			return;
		}
		LinkedList<Node> queue = new LinkedList<>();		
		Node current = null;
		queue.offer(node);  //将根节点入队
		while(!queue.isEmpty()){
			current = queue.poll(); //出队队头元素并访问
			//System.out.print(current.data + ",");
			list.add(current.data);
			if(current.leftChild != null){
				queue.offer(current.leftChild); // 如果当前节点的左节点不为空入队
			}
			if (current.rightChild != null) {
				queue.offer(current.rightChild);
			}
		}
	}
	
}
