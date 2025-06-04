class MyQueue {

     class Celula {
            int elemento;
            Celula prox;

            public Celula() {
                this(0);
            }

            public Celula(int elemento) {
                this.elemento = elemento;
                this.prox = null;
            }
            
        }

        class Stack {
            private Celula topo;

            public Stack() {
                topo = null;
            }

            public void push(int x) {
                Celula nova = new Celula(x);
                nova.prox = topo;
                topo = nova;
            }

            public int pop() {
                int removido = topo.elemento;
                topo = topo.prox;
                return removido;
            }

            public boolean empty() {
                return topo == null;
            }

            public int peek() {
                return topo.elemento;
            }
        }


        private Stack input;
        private Stack output;
    public MyQueue() {

        input = new Stack();
        output = new Stack();

    }
    
    public void push(int x) {

        input.push(x);       
        
    }
    
    public int pop() {
        if(output.empty()) {
            while(!(input.empty())) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    public int peek() {
        if(output.empty()) {
            while(!input.empty()) {
                output.push(input.pop());

            }
        }

        return output.peek();
        
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
    }
}







        

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
