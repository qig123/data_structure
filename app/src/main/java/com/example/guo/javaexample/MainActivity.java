package com.example.guo.javaexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TreeNode<Integer> t=new TreeNode<Integer>(1);
        t.addLeft(2);
        t.addRight(3);
        System.console().printf("树的节点是:"+TreeTools.getTreeNodeNum(t));
    }

}
