package com;

public class E extends D {
    protected String e="E";

    protected E(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public E(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(e+" ");
        super.Show();
    }
}
