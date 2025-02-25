package dto;

public class PatientDTO {

    private String name;
    private int age;
    private String disease;

    // Constructors
    public PatientDTO() {}

    public PatientDTO(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }
}
