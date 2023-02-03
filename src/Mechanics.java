
public class Mechanics {

    private String name;
    private String surName;
    private String workCompany;

    public Mechanics(String name, String surName, String workCompany) {
        this.name = name;
        this.surName = surName;
        this.workCompany = workCompany;
    }

    public void doService() {
        System.out.println("Механик - " + getName() + "Работающий в компании - " + getWorkCompany() + " обслуживает автомобиль");
    }

    public void fixTransport() {
        System.out.println("Механик - " + getName() + "Работающий в компании - " + getWorkCompany() + " ремонтирует автомобиль");
    }





    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", workCompany='" + workCompany + '\'' +
                '}';
    }
}
