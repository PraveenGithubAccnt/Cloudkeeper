import java.util.*;
public class NonRpetChar {
    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
}

public static void main(String []args){
    String str = "aahbeebcdd";
    Character result = firstNonRepeatingChar(str);

    if (result != null) {
        System.out.println("First non-repeating character: " + result);
    } else {
        System.out.println("No non-repeating character found");
    }
}

}