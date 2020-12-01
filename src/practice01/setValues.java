package practice01;

public class setValues {
    public static void main(String[] args){
        String stringObj = "Hello";
        int intValue = 0;
        Float floatObj = new Float(1.0);

        setValues(stringObj, intValue, floatObj);

        System.out.println(stringObj + "," + intValue + "," + floatObj + "");

    }

    private static void setValues(String strValue, int intValue, Float floatObj){
        strValue.replace("H", "h");

        strValue += "Wolrd";
        intValue = 99;
        floatObj.valueOf((float)2.0);

    }
}
