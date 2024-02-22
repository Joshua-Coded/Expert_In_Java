public class Main {
    public static void main(String[] args) {
        int decimal1 = "A".charAt(0);
        String binaryA = Integer.toBinaryString(decimal1);
        System.out.println(binaryA);


        System.out.println("--------CHARS ENCODING-----");
        // let's encode the word "JOSHUA ALANA THE BEST JAVA DEVELOPER ON EARTH!"
        
        char[] chars = "JOSHUA ALANA THE BEST JAVA DEVELOPER ON EARTH!".toCharArray();
        for (char ch : chars) {
            System.out.println("0" + Integer.toBinaryString(ch) + "");
        }
    }
}