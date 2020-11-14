package com;

public class A{
    protected String a;
    X x= new X("Huggies");
    protected A(String a,String b){
        this.a="A";
        this.x.setName(b);
    }

    public A(String s) {
        this.a="A";
    }
    public void Show() {
        System.out.print(a+" ");
        x.Show();
    }
}
