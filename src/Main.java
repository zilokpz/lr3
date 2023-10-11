// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String unicodeHex1 = "1F923"; // Код &quot;U+1F624&quot; без префикса &quot;U+&quot;
        String unicodeHex2 = "1F642";
        String unicodeHex3 = "1F970";
        int codePoint1 = Integer.parseInt(unicodeHex1, 16);
        int codePoint2 = Integer.parseInt(unicodeHex2, 16);
        int codePoint3 = Integer.parseInt(unicodeHex3, 16);
        String emoji1 = new String(Character.toChars(codePoint1));
        String emoji2 = new String(Character.toChars(codePoint2));
        String emoji3 = new String(Character.toChars(codePoint3));
        System.out.println(emoji1);
        System.out.println(emoji2);
        System.out.println(emoji3);
        System.out.println("Лабораторна робота" + " 4");
}}