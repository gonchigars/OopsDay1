package com.example.blogapp;

public class RegularUser extends User implements UserActions {
    public RegularUser(int userId, String username, String email) {
        super(userId, username, email);
    }

    @Override
    public void writePost(String title, String content) {
        System.out.println(getUsername() + " writes post: " + title);
    }

    @Override
    public void editPost(int postId, String content) {
        System.out.println(getUsername() + " edits post ID: " + postId + " with new content: " + content);
    }

    @Override
    public void deletePost(int postId) {
        System.out.println(getUsername() + " deletes post ID: " + postId);
    }

    @Override
    public void greetUser() {
        System.out.println("Hello Regularuser");
    }

    @Override
    public void commentPost(int postId , String comment) {
        System.out.println(getUsername() + " comments on post by Regularuser " + postId + " with comment: " + comment);
    }
}
