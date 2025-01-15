import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSportartikelgeschäft - Menü:");
            System.out.println("1. Medikament hinzufügen");
            System.out.println("2. Medikament bearbeiten");
            System.out.println("3. Medikament löschen");
            System.out.println("4. Patienten hinzufügen");
            System.out.println("5. Patienten bearbeiten");
            System.out.println("6. Patienten löschen");
            System.out.println("7. Patienten nach Diagnose filtern");
            System.out.println("8. Patienten mit verschriebene Medikamente");
            System.out.println("9. Medikamente sortieren");
            System.out.println("10. Medikamente zeigen");
            System.out.println("11. Patienten zeigen");
            System.out.println("12. Beenden");
            System.out.print("Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> service.addMedikament(scanner);
                case 2 -> service.editMedikament(scanner);
                case 3 -> service.deleteMedikament(scanner);
                case 4 -> service.addPatienten(scanner);
                case 5 -> service.editCustomer(scanner);
                case 6 -> service.deleteCustomer(scanner);
                case 10 -> service.viewAllMedikaments();
        }
    } while (choice != 12);
}
}