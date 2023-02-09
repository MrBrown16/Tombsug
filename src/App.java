import java.util.Scanner;

public class App {

    public static double calcRadius(double side, double alfa){
        
        double rad = alfa * Math.PI / 180;
        double radius = 0.5 * side * Math.sin(rad);
        
        return radius;
    }

    public static void feladat0213(){
        System.out.println("0213 megoldás");
        System.out.println("Rombuszba írható kör sugara: ");
        //Bekérés, példányosítás
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oldal: ");
        double side = Double.parseDouble(scanner.nextLine());
        System.out.print("Alfa szög: ");
        double alfa = Double.parseDouble(scanner.nextLine());
        scanner.close();

        double radius = calcRadius(side, alfa);
        System.out.println("Sugár: " + radius);
    }
    public static void main(String[] args) throws Exception {
        feladat0213();
    }

}
