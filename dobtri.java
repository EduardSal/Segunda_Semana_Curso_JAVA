import java.util.Scanner;


class dobtri {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("Ingrese un número: ");
    int numero = scanner.nextInt();
    
    System.out.println();
    System.out.println("El doble del número es: " + (numero * 2));
    System.out.println("El triple del número es: " + (numero *3));
    System.out.println();
  }
}