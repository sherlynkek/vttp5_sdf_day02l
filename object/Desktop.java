package object;

public class Desktop extends Computer {
    private String operatingSystem;
    private Integer weight;
    private Boolean wateringCooling;

    
    public Desktop(String operatingSystem, Integer weight, Boolean wateringCooling) {
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.wateringCooling = wateringCooling;
    }
    public Desktop(String cpu, String model, Integer ram, Integer yearMade, String operatingSystem, Integer weight,
            Boolean wateringCooling) {
        super(cpu, model, ram, yearMade);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.wateringCooling = wateringCooling;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Boolean getWateringCooling() {
        return wateringCooling;
    }
    public void setWateringCooling(Boolean wateringCooling) {
        this.wateringCooling = wateringCooling;
    }
        
        @Override
    public void displaySpecs(){
        System.out.println("This Desktop specifications");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYearMade());
        System.out.println(this.getOperatingSystem());
        System.out.println("Water Cooling System: " + this.getWateringCooling());
    }

}
