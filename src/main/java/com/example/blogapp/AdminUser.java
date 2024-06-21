package com.example.blogapp;

public class AdminUser extends User implements AdminActions {
    public AdminUser(int userId, String username, String email) {
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
    public void approvePost(int postId) {
        System.out.println(getUsername() + " approves posts " + postId);
    }

    @Override
    public void banUser(int userId) {
        System.out.println(getUsername() + " bans user ID: " + userId);
    }

    @Override
    public void greetUser() {
        System.out.println("Hello adminuser");
    }

    @Override
    public void commentPost(int postId , String comment) {
        System.out.println(getUsername() + " comments on post by admin " + postId + " with comment: " + comment);
    }
}
