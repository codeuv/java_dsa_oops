import java.util.Optional;

public class CustomStack<T> {
    private T[] stack;
    int size;
    int top = - 1;
    @SuppressWarnings("unchecked")
    public CustomStack(int size){
        this.size = size;
        this.stack = (T[]) new Object[size];
    }

    public boolean isEmpty(){
        return top == -1 ;
    }
    public boolean isFull(){
        return top == stack.length - 1;
    }
    public void display(){
        for(int i = 0 ; i <= top ;i++){
            System.out.print(this.stack[i]+" ");
        }
        System.out.println();
    }
    public void push(T element){
        if(isFull()){
//            System.out.println("Stack is full. Cannot add "+element+"\"");
            return;
        }
        stack[++top] = element;
    }
    public T peek(){
        if (isEmpty()){
//            System.out.println("Stack is Empty. Don't have elements to peek");
            return null;
        }
        return stack[top];
    }



    public T pop(){
        if(isEmpty()){
            return null;
        }
        T element = this.peek();
        stack[top] = null;
        top--;
        return element;
    }
}
