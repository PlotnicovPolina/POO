package com;
import java.lang.String;
import java.util.Stack;

public class Test {
    String str;
    boolean tmpres=true;
    boolean result=true;
    Stack<Character> stack= new Stack<>();
    public Test(String str)
    {
        this.str=str;
    }
    public void Modification()
    {
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='(') {
                if ((i+1)==str.length()){
                    stack.push(str.charAt(i));
                }
                else if((i+1)<str.length()) {
                    if ((str.charAt(i + 1) == '(') || (str.charAt(i + 1) == '-') || ((str.charAt(i + 1) >= '0') && (str.charAt(i + 1) <= '9'))) {
                        stack.push(str.charAt(i));
                    } else tmpres = false;
                }

            }
            else if(str.charAt(i)==')'){
                if(!stack.empty()){
                    stack.pop();
                }
                else tmpres=false;
            }
        }
        if(!stack.empty()||!tmpres){
            result=false;
        }
        System.out.println(result);
    }




}
