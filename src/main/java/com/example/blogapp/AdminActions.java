package com.example.blogapp;

public interface AdminActions extends UserActions {
    void approvePost(int postId);
    void banUser(int userId);
    void greetFromChild();
    void functionWithParameter(String param);
}
