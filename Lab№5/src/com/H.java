package com;

public class H extends G {
    protected String h="H";

    X x =new X("Insinse");
    protected H(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public H(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(h+" ");
        x.Show();
        super.Show();
    }
}
