class Solution {
  public boolean isValid(String s) {
    Stack<Character> expression =  new Stack();

    boolean valida = true;

    for(int i = 0;i<s.lenght();i++) {

      char c = s.charAt();

      if(c == '(') {
        expression.push(c);
      }else if(c == ')' && !(expression.isEmpty())) {
        expression.pop();
      }else if(c == ')' || c =="}" || c == ']') {
        valida = false;
      }


    if(c == '{') {
      expression.push(c);
    }else if(c == '}' && !(expression.isEmpty())){
      expression.pop();
    }else if(c == '}' || c == ')' || c == ']') {
      valida = false;
    }

    if(c == '[') {
      expression.push(c);
    }else if(c == ']' && !(expression.isEmpty())){
      expression.pop();
    }else if(c == ']' || c == ')' || c == '}') {
      valida = false;
    }


      
    }

  
    return valida;
  }
}
