package com.xiaoboji.problems.no_010_20_valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        if(chars.length % 2 == 1){
            return false;
        }
        for(char c : chars){
            if(c == '['){
                stack.push(']');
            } else if (c == '{'){
                stack.push('}');
            } else if (c == '('){
                stack.push(')');
                //判空和出栈的顺序很重要
            } else if(stack.empty() || c != stack.pop()){
                return false;
            }
        }

        return stack.empty();
    }

}
