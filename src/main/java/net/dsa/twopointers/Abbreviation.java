package net.dsa.twopointers;

public class Abbreviation {

    public static boolean isAbbreviation(String s1, String s2){
        int n = s1.length(), m=s2.length();
        int i=0, j=0;
        while (i<n && j<m){
            if(s2.charAt(j) >= '0' && s2.charAt(j) <='9'){
                int temp = 0;
                while (j<m && s2.charAt(j) >= '0' && s2.charAt(j) <='9'){
                    temp = temp*10 + s2.charAt(j)-'0';
                    j++;
                }
                i = i+temp;
            }else if (s2.charAt(j) == s1.charAt(i)){
                i++;
                j++;
            }else {
                return false;
            }
        }
        return (i==n && j==m);
    }
    public static void main(String[] args) {
        String s1 = "calender";
        String s2 = "c6r";

        System.out.println(isAbbreviation(s1, s2));
    }
}
