public class auto {
    private final String marke;
    private final String model;
    private int speedMax;
    public auto(String pMarke,String pModel,int pSpeedMax){
        this.marke = pMarke;
        this.model = pModel;
        this.speedMax = pSpeedMax;
    }

    public void drive(){
        System.out.println("The Car: " + marke+"\nOf the Model: "+model+"\nWith the speed: "+speedMax+"kmh"+"\n Is now driving!");
    }
    public void tuning(int speedMax){
        this.speedMax = speedMax;
        System.out.println("The Car: " + marke+"\nOf the Model: "+model+"\nWith the new speed: "+speedMax+"kmh"+"\n Is now driving!");
    }
}
