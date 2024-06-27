package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author pw7563
 * @Date 2023/11/9 21:42
 * usage
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Deque<TreeNode> deque = new ArrayDeque();
        deque.offerLast(root);
        while(deque.size() > 0){
            int n = deque.size();
            List<Integer> list = new ArrayList();
            for(int i=0;i<n;i++){
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if(node.left != null){
                    deque.offerLast(node.left);
                }
                if(node.right != null){
                    deque.offerLast(node.right);
                }
            }
            lists.add(list);
        }
        return lists;

    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

