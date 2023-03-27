package Model;

import java.util.Scanner;

public abstract class Staff {
    //data
    protected String id;
    protected String name;
    protected int type_of_contr;
    protected int job_pos; // 1. ban hang , 2. quan li
    protected float salary;
    //method
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.println("Nhap id NV : ");id = sc.next();
        System.out.println("Nhap ten NV : ");name = sc.next();
        System.out.println("Nhap loai hop dong : 1.Chinh thuc \t 2.Thu viec : ");type_of_contr = sc.nextInt();

    }
    public void xuat() {
        System.out.print("ten NV : " + name+ "\n");
        System.out.print("id NV : " + id+ "\n");
        String temp = (type_of_contr==1) ? "Chinh thuc" : "Thu viec";
        System.out.print("loai hop dong : "+ temp+ "\n" );
    }

    public abstract double getSalary();

    public int get_job_pos() {
        return job_pos;
    }

    public String to_String () {
        String temp = (type_of_contr==1) ? "Chinh thuc" : "Thu viec";
        return ("ten NV : " + name + "\n" + "id NV : " + id + "\n" + "loai hop dong : "+ temp + "\n");
    }
}
