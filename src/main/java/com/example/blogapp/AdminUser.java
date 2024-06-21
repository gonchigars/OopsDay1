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
        System.out.println(getUsername() + " approves post ID: " + postId);
    }

    @Override
    public void banUser(int userId) {
        System.out.println(getUsername() + " bans user ID: " + userId);
    }
    @Override
    public void greetFromChild() {
        System.out.println(getUsername() + " says hello from AdminUser child method.");
    }

    @Override
    public void functionWithParameter(String param) {
        System.out.println(getUsername() + " executes function with parameter: " + param);
    }
}
