package Activity4;

public class SmartWatch extends SmartDevice{
    int iNumerOfButtons;
    boolean bLargeSize;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String sBrand, String sModel, String sColour, int iYear, int iNumerOfButtons, boolean bLargeSize) {
        super(sBrand, sModel, sColour, iYear);
        this.iNumerOfButtons = iNumerOfButtons;
        this.bLargeSize = bLargeSize;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "iNumerOfButtons=" + iNumerOfButtons +
                ", bLargeSize=" + bLargeSize +
                ", sBrand='" + sBrand + '\'' +
                ", sModel='" + sModel + '\'' +
                ", sColour='" + sColour + '\'' +
                ", iYear=" + iYear +
                '}';
    }
}
