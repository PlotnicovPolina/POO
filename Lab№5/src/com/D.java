package com;

public class D extends C {
    protected String d="D";
    X x =new X("Libero");

    protected D(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public D(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(d+" ");
        x.Show();
        super.Show();
    }
}
