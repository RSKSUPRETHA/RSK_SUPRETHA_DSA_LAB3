package packagecom.greatlearning.q2.service;

import java.util.*;

public class FindSumPair {

	public Node insert (Node root, int key) 
	{
		/*
		 * key = 50
		 * 
		 * root = 40
		 * root.left = 20
		 * root. right = 60
		 * 
		 * root.left.left =10
		 * root.left.right = 30
		 * 
		 * root. right.left = 50
		 * root = 60
		 * root.left = 50
		 * 
		 */
		if (root == null)
			return new Node(key);
		
		if (key < root.data) // 50<60
			root.leftNode = insert(root.leftNode,key); //insert(null,50;
		
		else
			root.rightNode = insert(root.rightNode,key); //insert(60,50);
		return root;
	}
	
	public boolean findpairutil(Node root, int sum, HashSet<Integer> set) 
	
	{
			if (root == null)
				return false;
			
			if (findpairutil(root.leftNode, sum, set))
				return true;
			
			if ( set.contains(sum-root.data)) 
			{
				System.out.println(" Pair is found : "  + ((sum-root.data) + ","+ (root.data)));
				return true;
				//  	set.add(root.nodeData);
		}
			else
				set.add(root.data); // 10
			
			return findpairutil(root.rightNode, sum, set);
		}
		public void findPairWithGivenSum(Node root, int sum)	
		{
			HashSet<Integer> set = new HashSet<Integer>();
			if (!findpairutil(root, sum, set))
				System.out.print("pairs do not exit"+"\n");
			}
	}