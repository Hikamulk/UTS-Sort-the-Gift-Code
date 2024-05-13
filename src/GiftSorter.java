import java.util.Arrays;

public class GiftSorter {
    public static String sortGiftCode(String code) {
        // Konversi string ke array karakter
        char[] charArray = code.toCharArray();
        // Urutkan array karakter
        Arrays.sort(charArray);
        // Konversi array karakter kembali menjadi string
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(sortGiftCode("abcdef"));  // Output: "abcdef"
        System.out.println(sortGiftCode("pqksuvy")); // Output: "kpqsuvy"
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba")); // Output: "abcdefghijklmnopqrstuvwxyz"
    }
}