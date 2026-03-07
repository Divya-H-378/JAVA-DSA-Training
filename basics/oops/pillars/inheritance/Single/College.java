package com.basics.oops.pillars.inheritance.Single;

public class College {
    static String name = "SNPSU";
    String address;
    int pincode;
    public College(String address, int pincode ){
        this.address = address;
        this.pincode = pincode;
    }
}
class Department extends College {
    String block;
    int lecturerCount;

    Department(String address, int pincode, String block, int lecturerCount) {
        super(address, pincode);
        this.block = block;
        this.lecturerCount = lecturerCount;
    }

    void departmentDetails() {
        System.out.println(block + " " + lecturerCount + " " + address + " " + pincode + " " + College.name);
    }

    public static void main(String[] args) {
        Department department = new Department("Bangalore", 560057, "A", 15);
        department.departmentDetails();
    }
}
/*
Points to remember:
✅ super.something -> variable from Parent Class
✅ super() -> constructor of the Parent Class
❌ Don't use super. for constructor
 ❕ These are important for interviews & vivas
 */
