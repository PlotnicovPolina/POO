package com;

public class G extends F {
    protected String g="G";

    protected G(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public G(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(g+" ");
        super.Show();
    }
}
