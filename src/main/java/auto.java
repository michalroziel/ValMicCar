public class auto {
    private String marke;
    private String model;
    private int speedMax;
    public auto(String pMarke,String pModel,int pSpeedMax){
        this.marke = pMarke;
        this.model = pModel;
        this.speedMax = pSpeedMax;
    }

    public void drive(){
        System.out.println("The Car: " + marke+"\nOf the Model: "+model+"\nWith the speed: "+speedMax+"kmh"+"\n Is now driving!");
    }
}
