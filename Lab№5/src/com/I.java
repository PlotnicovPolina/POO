package com;

public class I extends H {
    protected String i="I";

    protected I(String a, String b) {
        super(a);
        super.x.setName(b);
    }

    public I(String a) {
        super(a);
    }

    public void Show() {
        System.out.print(i+" ");
        super.Show();
    }
}
