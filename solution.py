class Solution:
    def halvesAreAlike(self, s):
        fh = 0
        sh = 0
        c = set("aeiouAEIOU")
        for i in range(len(s) // 2):
            if s[i] in c: fh += 1
            if s[i + len(s) // 2] in c: sh += 1
        
        return fh == sh
