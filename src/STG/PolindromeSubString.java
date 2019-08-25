package STG;

import java.util.HashSet;
import java.util.Set;

public class PolindromeSubString {



    public Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes;
    }

    boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }
    
    public static void main(String arg[]){
        
        PolindromeSubString polindromeSubString= new PolindromeSubString();

       // forgeeksskeegfor

        Set<String> hash_Set = new HashSet<String>();

        hash_Set=polindromeSubString.findAllPalindromesUsingBruteForceApproach("geeksskeeg");
        
        System.out.println(hash_Set);
        
    }
}
