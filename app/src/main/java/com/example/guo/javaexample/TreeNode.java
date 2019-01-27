package com.example.guo.javaexample;

public class TreeNode<T> {

    T value;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;
    TreeNode(T value){
        this.value=value;
    }

    public void addLeft(T value){
        this.leftChild=new TreeNode<>(value);
    }

    public  void addRight(T value){
        rightChild=new TreeNode<T>(value);
    }

    @Override
    public String toString() {
        return this.value==null?"":this.value.toString();
    }
}
