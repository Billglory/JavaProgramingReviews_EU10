package day26_CustomMethodsPractice;
import java.util.ArrayList;
import java.util.List;
public class ArrayMethodOlusturma {

    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        isimler.add("Ali");
        isimler.add("Veli");

        System.out.println(isimler); // [Ali, Veli]


    }
}
