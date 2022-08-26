package Activity4;

public class SmartDevice {
    String sBrand;
    String sModel;
    String sColour;
    int iYear;

    public SmartDevice() {
    }

    public SmartDevice(String sBrand, String sModel, String sColour, int iYear) {
        this.sBrand = sBrand;
        this.sModel = sModel;
        this.sColour = sColour;
        this.iYear = iYear;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "sBrand='" + sBrand + '\'' +
                ", sModel='" + sModel + '\'' +
                ", sColour='" + sColour + '\'' +
                ", iYear=" + iYear +
                '}';
    }
}
