class Solution {
  public boolean isValid(String s) {
    Stack<Character> expression =  new Stack();

    boolean valida = true;

    for(int i = 0;i<s.length();i++) {

        char c = s.charAt(i);

        if(c == '(' || c == '{' || c =='[') {
            expression.push(c);                                   //Utiliza-se de uma pilha, a fim de garantir a inserção dos elementos que valida uma expressão
        }else if(c == ')' || c == '}' || c == ']') {              //Se o outro elemento for um carectere que valida a mesma, o único elemento na pilha recebe pop
            if(expression.isEmpty()) {                            //e a expressão é determinada como válida. A pila dessa forma fica vazia, garantindo maior eficiência. 
                valida = false;
            } else {
                char top = expression.pop();

                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||                     //--> Seria melhor declararar um map para cada carectere a fim de evitar chegagem de condições grandes.
                   (c == ']' && top != '[')) {
                    valida = false;
                   }                                             //Essa abordagem garante uma complexidade O(n);   
            }
        }

        

     
    }

  
    return valida && expression.isEmpty();
  }
}

