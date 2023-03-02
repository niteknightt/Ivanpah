import top.lower.bottom.CoalingaMain;

public class IvanpahMain {

    public static String getTextToPrint() {
        return "Here is the Ivanpah text";
    }

    public static void main(String[] args) {
        String textToPrint = getTextToPrint();
        System.out.println(textToPrint);
        System.out.println("Next value is: " + CoalingaMain.getNextValue(132));

    }
}
