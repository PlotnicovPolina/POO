package com;

public class F extends E {
    protected String f="F";

    protected F(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public F(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(f+" ");
        super.Show();
    }
}
