package com.example.blogapp;

public interface UserActions {
    void writePost(String title, String content);
    void editPost(int postId, String content);
    void deletePost(int postId);
    void greetAction();
    void commentPost(int commentId, String reply);
}
