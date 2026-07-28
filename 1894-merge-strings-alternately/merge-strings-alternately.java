class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int p = 0;
        StringBuilder sb = new StringBuilder();

        while(i < word1.length() && p < word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(p));
            i++;
            p++;
        }


        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }

    while(p < word2.length()){
            sb.append(word2.charAt(p));
            p++;
        }

    return sb.toString();

    }

}