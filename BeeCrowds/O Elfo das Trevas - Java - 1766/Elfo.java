import java.util.*;

public class Elfo {

  static class Renas {
    String nome;
    int peso;
    int idade;
    float altura;
  }

  public static void swap(Renas[] arr, int i, int j) {
    Renas temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }

  public static boolean comparaRenas(Renas r1, Renas r2) {

    boolean troca = false;

    if(r1.peso !=  r2.peso) {
      troca = r1.peso < r2.peso;
    }else if(r1.idade != r2.idade) {
      troca = r1.idade > r2.idade;
    }else if(r1.altura != r2.altura) {                                   //Se realiza a comparação dos parâmetros de maneira separada, de forma à tornar a ordenação mais organizada.
      troca = r1.altura > r2.altura;
    }else if(r1.nome != r2.nome) {
      troca = r1.nome.compareTo(r2.nome) > 0;
    }

    return troca;
  }

  public static void ordenar(Renas[] renas) {
    int tam = renas.length;
    for(int i=0;i<tam;i++) {
      for(int j = 0;j< tam - 1 - i;j++) {
        if(comparaRenas(renas[j], renas[j+ 1])) {                       //Utiliza-se do "bubblesort" para ordenar os elementos.  --> 0(n²).
          swap(renas, j, j + 1);                                        //Essa não é a maneira mais eficiente, a abordagem mais eficiente utiliza de um "MergeSort" --> O(n log k).
        }
      }
    }
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int caseTeste = scanner.nextInt();

    

    for(int teste = 0;teste <caseTeste;teste++){
      int n = scanner.nextInt();

      int tamTreno = scanner.nextInt();

      Renas[] renasTotais = new Renas[n];

      for(int i =0;i<n;i++) {
        String nome = scanner.next();
        int peso = scanner.nextInt();
        int idade = scanner.nextInt();
        float altura = scanner.nextFloat();

        renasTotais[i] = new Renas();
        renasTotais[i].nome = nome;
        renasTotais[i].peso = peso;
        renasTotais[i].altura = altura;
        renasTotais[i].idade = idade;
      }

      ordenar(renasTotais);

      System.out.println("CENARIO {"+(teste + 1)+"}");

      for(int i=0;i<tamTreno && i < n;i++) {
        System.out.println((i + 1) +  " - "  + renasTotais[i].nome);

      }

    }

    scanner.close();

    

    
  }
}
