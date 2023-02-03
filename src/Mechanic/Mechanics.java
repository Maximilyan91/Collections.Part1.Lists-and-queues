package Mechanic;


public class Mechanics {

    private String name;
    private String surName;
    private String workCompany;
    private TransportType transportType;

    public Mechanics(String name, String surName, String workCompany, TransportType transportType) {
        this.name = name;
        this.surName = surName;
        this.workCompany = workCompany;
        this.transportType = transportType;
    }


    public void doService() {
        System.out.println("Механик - " + getSurName() + " " + getName()  +
                "Работающий в компании - " + getWorkCompany() + " обслуживает автомобиль" );
    }

    public void fixTransport() {
        System.out.println("Механик - " + getSurName() + " " + getName() +
                "Работающий в компании - " + getWorkCompany() + " ремонтирует автомобиль");
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

    public TransportType getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return "Mechanic.Mechanics{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", workCompany='" + workCompany + '\'' +
                '}';
    }
}
