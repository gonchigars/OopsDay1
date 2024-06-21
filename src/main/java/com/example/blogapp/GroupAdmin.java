package com.example.blogapp;

public class GroupAdmin extends User implements AdminActions {
    private String groupName;

    public GroupAdmin(int userId, String username, String email, String groupName) {
        super(userId, username, email);
        this.groupName = groupName;
    }

    @Override
    public void writePost(String title, String content) {
        System.out.println(getUsername() + " writes post in group " + groupName + ": " + title);
    }

    @Override
    public void editPost(int postId, String content) {
        System.out.println(getUsername() + " edits post ID: " + postId + " in group " + groupName + " with new content: " + content);
    }

    @Override
    public void deletePost(int postId) {
        System.out.println(getUsername() + " deletes post ID: " + postId + " in group " + groupName);
    }

    @Override
    public void approvePost(int postId) {
        System.out.println(getUsername() + " approves post ID: " + postId + " in group " + groupName);
    }

    @Override
    public void banUser(int userId) {
        System.out.println(getUsername() + " bans user ID: " + userId + " in group " + groupName);
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void greetUser() {
        System.out.println("Hello Groupadmin");
    }

    @Override
    public void commentPost(int postId , String comment) {
        System.out.println(getUsername() + " comments on posts by Groupadmin " + postId + " with comment: " + comment);
    }
}
