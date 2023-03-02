import top.lower.bottom.CoalingaMain;
import niteknightt.cities.fresno.FresnoInfo;

public class IvanpahMain {

    public static String getTextToPrint() {
        return "Here is the Ivanpah text";
    }

    public static void main(String[] args) {
        String textToPrint = getTextToPrint();
        System.out.println(textToPrint);
        System.out.println("Next value is: " + CoalingaMain.getNextValue(132));
        FresnoInfo fresnoInfo = new FresnoInfo();
        System.out.println("About Fresno: " + fresnoInfo.getSomeInfo());
    }
}
