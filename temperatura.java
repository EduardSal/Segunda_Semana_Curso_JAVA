import java.util.Scanner;


class temperatura {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println();
    System.out.println("Ingrese temperatura en grados centigrados: ");
    
    double centi = scanner.nextDouble();
    double Fare = 32 + (9 * centi/5);
    
    System.out.println();
    System.out.println("Temperatura en fahrenheit: " + Fare);
    System.out.println();
  }
}