package com;

public class B extends A {
    protected String b="B";

    protected B(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public B(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(b+" ");
        super.Show();
    }

}
