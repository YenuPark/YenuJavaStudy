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
        strValue.replace("H", "h"); //반환할 변수가 없어서 저장 X
        strValue += "Wolrd"; //새변수 생성 > 변화 x
        intValue = 99; //새변수 생성 > 변화 x
        floatObj.valueOf((float)2.0);

    }
}
