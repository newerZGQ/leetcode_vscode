/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 *
 * https://leetcode.com/problems/min-stack/description/
 *
 * algorithms
 * Easy (38.29%)
 * Likes:    2435
 * Dislikes: 255
 * Total Accepted:    390.1K
 * Total Submissions: 969.9K
 * Testcase Example:  '["MinStack","push","push","push","getMin","pop","top","getMin"]\n[[],[-2],[0],[-3],[],[],[],[]]'
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * 
 * 
 * 
 * 
 */

// @lc code=start
class MinStack {

    private Node top;

    class Node {
        int value, minValue;
        Node next;
        Node(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
        }
    }

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        int minValue = top == null ? x : Math.min(x, top.minValue);
        Node tmp = new Node(x, minValue);
        tmp.next = top;
        top = tmp;
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.value;
    }
    
    public int getMin() {
        return top.minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

