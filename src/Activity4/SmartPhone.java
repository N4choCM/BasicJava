package Activity4;

public class SmartPhone extends SmartDevice{
    String sCpu;
    int iRam;
    int iBattery;
    double dScreenInches;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String sBrand, String sModel, String sColour, int iYear, String sCpu,
                      int iRam, int iBattery, double dScreenInches) {
        super(sBrand, sModel, sColour, iYear);
        this.sCpu = sCpu;
        this.iRam = iRam;
        this.iBattery = iBattery;
        this.dScreenInches = dScreenInches;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sCpu='" + sCpu + '\'' +
                ", iRam=" + iRam +
                ", iBattery=" + iBattery +
                ", dScreenInches=" + dScreenInches +
                ", sBrand='" + sBrand + '\'' +
                ", sModel='" + sModel + '\'' +
                ", sColour='" + sColour + '\'' +
                ", iYear=" + iYear +
                '}';
    }
}
