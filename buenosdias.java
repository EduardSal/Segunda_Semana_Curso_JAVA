import java.util.Scanner;


class buenosdias {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("Ingrese su nombre: ");
    String nombre = scanner.nextLine();

    System.out.println();

    System.out.println("Buenos días " + nombre + " :D");
    System.out.println();
  }
}