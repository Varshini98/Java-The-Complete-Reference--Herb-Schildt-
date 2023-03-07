class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int num) {
        if (tos == (stck.length - 1)) {
            System.out.println("Stack Full");
        } else {
            stck[++tos] = num;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        for (int i = 0; i < st.stck.length; i++) {
            st.push(i);
        }

        for (int i = 0; i < st.stck.length; i++) {
            System.out.println(st.pop());
        }
    }

}
