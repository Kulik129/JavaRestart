public class Main {
    public static void main(String[] args) {
        byte variableByteMax = 127;
        byte variableByteMin = -128;
        System.out.println("- byte содержит число от: "+ variableByteMin + " до: "+ variableByteMax+" и занимает 1 байт памяти");

        int variableIntMax = 2147483647;
        int variableIntMin = -214748364;
        System.out.println("- int содержит число от: "+ variableIntMax + " до: "+ variableIntMin+" и занимает 4 байта памяти");

        float variableFlot = 23.32f;
        double variableDouble = 23.23545343243242342d;
        System.out.println("- float это число с плавающей точкой, занимает 4 байта памяти, в конце числа обязательно добавить f " + variableFlot);
        System.out.println("- double в отличии от float занимает 8 байт памяти, в конце числа обязательно добавить d "+variableDouble);

        boolean variableBooleanTrue = true;
        boolean variableBooleanFalse = false;
        System.out.println("- boolean это логическая переменная содержащая 1 или 0, где true это 1, а false это 0");
        System.out.println("- Если это вывести на экран, -TRUE- так и будет, "+" "+variableBooleanTrue+" "+" а -FALSE- как "+variableBooleanFalse);

        char variableChar = 'A';
        System.out.println("- char принимает только один символ например: "+variableChar);

        String variableString = "- String содержит в себе любую строку, например как эту";
        System.out.println(variableString);
    }
}