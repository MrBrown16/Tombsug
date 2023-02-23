import java.util.Scanner;
public class Tombsug {
    
    public Tombsug() {
        this.feladat0213();
    }

    public void feladat0213(){
        System.out.println("0213 megoldás");
        System.out.println("Rombuszba írható kör sugara: ");
        //Bekérés, példányosítás
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oldal: ");
        double side = Double.parseDouble(scanner.nextLine());
        System.out.print("Alfa szög: ");
        double alfa = Double.parseDouble(scanner.nextLine());
        scanner.close();
        Rhombus rhombus = new Rhombus();
        double radius = rhombus.calcRadius(side, alfa);
        System.out.println("Sugár: " + radius);
    }
}
