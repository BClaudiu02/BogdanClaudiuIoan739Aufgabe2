import java.util.List;

public class Patienten {
    private int id;
    private String name;
    private int alter;
    private String diagnose;
    private List<Medikamente> medikamente;

    public Patienten(int id, String name, String diagnose, List<Medikamente> medikamente) {
        this.id = id;
        this.name = name;
        this.alter = alter;
        this.diagnose = diagnose;
        this.medikamente = medikamente;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public List<Medikamente> getMedikamente() {
        return medikamente;
    }

    public void setMedikamente(List<Medikamente> medikamente) {
        this.medikamente = medikamente;
    }

    @Override
    public String toString() {
        return "Patienten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alter=" + alter +
                ", diagnose='" + diagnose + '\'' +
                ", medikamente=" + medikamente +
                '}';
    }
}
