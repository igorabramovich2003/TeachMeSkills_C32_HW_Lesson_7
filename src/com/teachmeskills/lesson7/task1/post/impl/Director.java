package com.teachmeskills.lesson7.task1.post.impl;

import com.teachmeskills.lesson7.task1.post.IPost;

public class Director implements IPost {

    @Override
    public void showPostName() {
        System.out.println("Director");
    }

}
