package com;

public class X {
    private String name;
    protected X(String name){
        this.name=name;
    }
    protected X(){
    }
    public void Show() {
        System.out.print(name+" ");
    }

    public void setName(String name) {
        this.name = name;
    }
}
