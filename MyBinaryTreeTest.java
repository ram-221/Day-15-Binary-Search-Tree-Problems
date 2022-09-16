package com.bridgelabzbstuc1;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		givenNumberWhenAddedToBSTShouldReturnSize3();
	}

	public static void givenNumberWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		Integer size = myBinaryTree.getSize();
		System.out.println(size);
		boolean result = size.equals(3);
		System.out.println(result);
	}
}
