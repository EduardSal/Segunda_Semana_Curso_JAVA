import java.util.Scanner;


class circulo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("ingrese el radio del circulo: ");
    int radio = scanner.nextInt();
    System.out.println();

    double longitudcirc = 2 * 3.14 * radio;
    double areacirc = 3.14 * Math.pow(radio, 2);

    System.out.println("La longitud del circulo es: " + longitudcirc);
    System.out.println("El area del circulo es: " + areacirc);
    System.out.println();
  }
}