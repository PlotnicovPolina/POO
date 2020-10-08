package com;
import java.util.ArrayList;

public class Queue {
    int size,i=0;
    ArrayList<Integer>queue=new ArrayList<Integer>();
    public Queue(){
        size=0;
    }
    public Queue(int size){
        if (size==0) { System.out.println("Error zero."); System.exit(1); } else {
            this.size = size;}
    }
    public int Push(int value){

        if (queue.size()==0 && size==0) {
            queue.add(i,value);
            i++;
        }
        else if(queue.size()!=size){
            queue.add(i,value);
            i++;
        }
        return i;
    }
    public void Pop(){
        queue.remove(0);
        i--;
    }
    public void Empty(){
        if(i==0){
            System.out.println("The queue is empty.");
        }
        else {
            System.out.println("The queue have some elements.");
        }
    }
    public void Full(){
        if ((queue.size()==i)&&(size==i)&&(size!=0)){
            System.out.println("The queue is full.");
        }
        else{
            System.out.println("The queue is not full.");
        }
    }
    public void ShowQueue(){
        for (int j=0;j<i;j++) System.out.print(" " + queue.get(j));
    }
}
