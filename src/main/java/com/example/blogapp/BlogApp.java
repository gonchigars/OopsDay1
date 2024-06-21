package com.example.blogapp;

public class BlogApp {
    public static void main(String[] args) {
        UserActions regularUser = new RegularUser(1, "JohnDoe", "john@example.com");
        AdminActions adminUser = new AdminUser(2, "AdminJane", "jane@example.com");
        AdminActions groupAdmin = new GroupAdmin(3, "GroupAdminJoe", "joe@example.com", "Tech Group");

        // Perform actions as a regular user
        performUserActions(regularUser, "Regular Post", "This is a regular post.");
        regularUser.editPost(1, "Updated content of regular post.");
        regularUser.deletePost(1);

        // Perform actions as an admin user
        performAdminActions(adminUser, "Admin Post", "This is an admin post.");
        adminUser.editPost(2, "Updated content of admin post.");
        adminUser.deletePost(2);
        adminUser.approvePost(2);
        adminUser.banUser(3);
        adminUser.greetFromChild();
        adminUser.functionWithParameter("Mahammad");
        // Perform actions as a group admin
        performAdminActions(groupAdmin, "Group Post", "This is a group post.");
        groupAdmin.editPost(3, "Updated content of group post.");
        groupAdmin.deletePost(3);
        groupAdmin.approvePost(3);
        groupAdmin.banUser(4);
        adminUser.greetFromChild();
        adminUser.functionWithParameter("Mahammad");
    }

    public static void performUserActions(UserActions user, String title, String content) {
        user.writePost(title, content);
    }

    public static void performAdminActions(AdminActions admin, String title, String content) {
        admin.writePost(title, content);
    }
}
