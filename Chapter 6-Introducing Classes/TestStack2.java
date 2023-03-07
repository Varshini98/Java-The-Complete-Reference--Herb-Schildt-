class Stack {
    int stck[];
    int tos;
    int size;

    Stack() {
        stck = new int[0];
        tos = -1;
        
    }

     Stack(int size) {
       this.size=size;
        stck = new int[size];
        tos = -1;
    }

    void push(int i) {
        if (tos == stck.length) {
            System.out.println("Stack full ");
        } else {
            stck[++tos] = i;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        for (int i = 0; i < mystack1.size; i++) {
            mystack1.push(i);
        }
        System.out.println("Stack in mystack1:");
        for (int i = 0; i <  mystack1.size; i++) {
            System.out.println(mystack1.pop());
        }
    }

}
