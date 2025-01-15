import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class HospitalService {
    private final Database database = new Database();

    // Add Product
    public void addMedikament(Scanner scanner) {
        System.out.println("Medikament hinzufügen:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Preis: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Krankheit: ");
        String krankheit = scanner.nextLine();

        database.addMedikament(new Medikamente(name, price, krankheit));
    }

    // Edit Product
    public void editMedikament(Scanner scanner) {
        System.out.println("Medikament bearbeiten:");
        System.out.print("Medikamentname: ");
        String name = scanner.nextLine();

        Medikamente medikamente = database.findMedikamentByName(name);
        if (medikamente == null) {
            System.out.println("Produkt nicht gefunden.");
            return;
        }

        System.out.print("Neuer Name: ");
        medikamente.setName(scanner.nextLine());
        System.out.print("Neuer Preis: ");
        medikamente.setPrice(scanner.nextDouble());
        scanner.nextLine(); // Consume newline
        System.out.print("Neue Jahreszeit: ");
        medikamente.setKrankheit(scanner.nextLine());
    }

    // Delete Product
    public void deleteMedikament(Scanner scanner) {
        System.out.print("Medikamentname: ");
        String name = scanner.nextLine();

        if (database.deleteMedikament(name)) {
            System.out.println("Medikament gelöscht.");
        } else {
            System.out.println("Medikament nicht gefunden.");
        }
    }

    public void viewAllMedikaments() {
        List<Medikamente> products = database.getMedikamente();
        if (products.isEmpty()) {
            System.out.println("Es gibt keine Medikamente im System.");
        } else {
            System.out.println("\nAlle Medikamente:");
            products.forEach(product ->
                    System.out.println("Name: " + product.getName() + ", Preis: " + product.getPrice() + ", Saison: " + product.getKrankheit())
            );
        }
    }

    public void addPatient(Scanner scanner) {
        System.out.println("Patient hinzufügen:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Diagnose: ");
        String diagnose = scanner.nextLine();
        System.out.print("Krankheit: ");
        String krankheit = scanner.nextLine();
        System.out.print("Alter: ");
        String alter = scanner.nextLine();
        System.out.print("Medikament: ");
        String medikament = scanner.nextLine();



        database.addPatient(new Patienten(id, name, diagnose, krankheit, alter, medikament));
    }

    public void viewAllPatients() {
        List<Patienten> customers = database.getPatienten();
        if (customers.isEmpty()) {
            System.out.println("Es gibt keine Patienten im System.");
        } else {
            System.out.println("\nAlle Patienten:");
            customers.forEach(customer ->
                    System.out.println()
            );
        }
    }
}
