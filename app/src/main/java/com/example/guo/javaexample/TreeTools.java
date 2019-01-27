package com.example.guo.javaexample;

public class TreeTools {
    //递归求解树的节点个数
    public static <T> int getTreeNodeNum(TreeNode<T> root){
        if(root==null){
            return  0;
        }
        return  getTreeNodeNum(root.leftChild)+getTreeNodeNum(root.rightChild)+1;
    }

}
