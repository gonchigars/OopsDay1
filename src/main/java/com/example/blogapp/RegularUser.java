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
    public void greetAction(){
        System.out.println("Hello world");
    }
    public void commentPost(int commentId, String reply){
        System.out.println(getUsername() + "comment post ID: " + commentId + " reply: " + reply);
    }
}
