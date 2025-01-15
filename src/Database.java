import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Medikamente> medikamente = new ArrayList<>();
    private final List<Patienten> patienten = new ArrayList<>();

    // Getter for products
    public List<Medikamente> getMedikamente() {
        return medikamente;
    }

    // Getter for customers
    public List<Patienten> getPatienten() {
        return patienten;
    }

    public Database() {
        // Inițializare produse
        medikamente.add(new Medikamente("Paracetamol", 20.0, "Fieber"));
        medikamente.add(new Medikamente("Nurofen", 10.0, "Fieber"));
        medikamente.add(new Medikamente("Decasept", 5.0, "Halzschmerzen"));
        medikamente.add(new Medikamente("Aspirine", 6.0, "Kopfschmerzen"));

        // Inițializare clienți

    }

    public void addMedikament(Medikamente medikamente) {
        medikamente.add(medikamente);
    }


    public boolean deleteMedikament(String name) {
        return medikamente.removeIf(p -> p.getName().equalsIgnoreCase(name));
    }


    public Medikamente findMedikamentByName(String name) {
        return medikamente.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public void addPatient(Patienten patient) {
        patienten.add(patient);
    }

    public boolean deletePatient(int id) {
        return patienten.removeIf(c -> c.getId() == id);
    }


}


