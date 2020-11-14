package com;

public class J extends I {
    protected String j="J";

    protected J(String a, String b) {
        super(a);
        super.x.setName(b);
    }
    protected J(String a) {
        super(a);
    }


    public void Show() {
        System.out.print(j+" ");
        super.Show();
    }
}
