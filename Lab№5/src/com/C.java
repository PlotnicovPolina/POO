package com;

public class C extends B {
    protected String c="C";

    protected C(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public C(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(c+" ");
        super.Show();
    }
}
