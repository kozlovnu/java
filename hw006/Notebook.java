package HomeWork.hw006;

public class Notebook {
    private String manufacture;
    private String ram;
    private String color;
    private String operatingSystem;
    private String hddCapacity;

    public Notebook(String manufacture, String ram, String color, String operatingSystem, String hddCapacity) {
        this.manufacture = manufacture;
        this.ram = ram;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.hddCapacity = hddCapacity;
    }

    

    @Override
    public String toString() {
        return "Notebook [manufacture=" + manufacture + ", ram=" + ram + ", color=" + color + ", operatingSystem="
                + operatingSystem + ", hddCapacity=" + hddCapacity + "]";
    }



    public String getManufacture() {
        return manufacture;
    }



    public String getRam() {
        return ram;
    }



    public String getColor() {
        return color;
    }



    public String getOperatingSystem() {
        return operatingSystem;
    }



    public String getHddCapacity() {
        return hddCapacity;
    }




    
}
