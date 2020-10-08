package com;

public class Box {
    int width,height, depth, A, V;
    public Box(){
        width=1;
        height=1;
        depth=1;
    }
    public Box(int a){
        width=a;
        height=a;
        depth=a;
    }
    public Box(int a, int b,int c){
        width=a;
        height=b;
        depth=c;
    }
    public void ShowBox(){
        System.out.println("width="+width+" | "+"height="+height+" | "+"depth="+depth);
    }
    public void Area(){
        A=2*(width*height+height*depth+width*depth);
        System.out.println("Area:"+A);

    }
    public void Volume(){
        V=width*height*depth;
        System.out.println("Volume:"+V);

    }
}
