class Solution {
    private boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return(true);
        }

        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return(true);
        }

        return(false);
    }

    public boolean halvesAreAlike(String s) {
        int fh = 0;
        int sh = 0;
        for(int i = 0; i < s.length() / 2; i++){
            if(isVowel(s.charAt(i))) fh++;
            if(isVowel(s.charAt(i + s.length() / 2))) sh++;
        }

        return(fh == sh);
    }
}
