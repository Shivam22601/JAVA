import java.util.*;

class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {

        MyQueue obj = new MyQueue();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println(obj.peek()); // 1
        System.out.println(obj.pop());  // 1
        System.out.println(obj.peek()); // 2
        System.out.println(obj.empty()); // false
    }
}