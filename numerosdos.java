import java.util.Scanner;

class numerosdos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("Ingrese su primer numero: ");
    int primernum = scanner.nextInt();
    
    System.out.println("Ingrese su segundo numero: ");
    int segundnum = scanner.nextInt();
    
    System.out.println();
    
    System.out.println("Sus numeros fueron: ");
    System.out.println(primernum + " y " + segundnum);
    System.out.println();
    
  }
}