class MyStack {

    private Queue<Integer> first;
    private Queue<Integer> second;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    public void push(int x) {
        first.add(x);
    }
    
    public int pop() {
        int top = -1;
        if(!first.isEmpty()){
            while(!first.isEmpty()){
                top = first.remove();
                if(first.isEmpty()){
                    break;
                }
                second.add(top);
            }
        }else{
            while(!second.isEmpty()){
                top = second.remove();
                if(second.isEmpty()){
                    break;
                }
                first.add(top);
            }
        }
        return top;
    }
    
    public int top() {
        int top = -1;
        if(!first.isEmpty()){
            while(!first.isEmpty()){
                top = first.remove();
                second.add(top);
            }
        }else{
            while(!second.isEmpty()){
                top = second.remove();
                first.add(top);
            }
        }
        return top;
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
