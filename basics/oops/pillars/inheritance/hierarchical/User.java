package com.basics.oops.pillars.inheritance.hierarchical;

public class User {
    void role(){
        System.out.println("Generic user");
    }
}
class Admin extends User{
    @Override
    void role(){
        System.out.println("Admin User");
    }
}
class Guest extends User{
    @Override
    void role(){
        System.out.println("Guest User");
    }
}
class Demo {
    public static void main(String[] args) {
        User user = new User();
        user.role();
        User user1 = new Admin();
        user1.role();
        User user2 = new Guest();
        user2.role();
    }
}
// ✅❕ The reference does'nt matter - the object matters