package com.example.profiles;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Profile: " + p.getEmail());
        UserProfile updated = svc.updateDisplayName(p, "New Name");
        System.out.println("Original email: " + p.getEmail());
        System.out.println("Updated displayName: " + updated.getDisplayName());
    }
}