public class Solution {
    private bool isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return(true);
        }

        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return(true);
        }

        return(false);
    }
    
    public bool HalvesAreAlike(string s) {
        int fh = 0;
        int sh = 0;
        for(int i = 0; i < s.Length / 2; i++){
            if(isVowel(s[i])) fh++;
            if(isVowel(s[i + s.Length / 2])) sh++;
        }

        return(fh == sh);
    }
}
