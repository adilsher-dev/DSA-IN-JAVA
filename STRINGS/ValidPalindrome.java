package STRINGS;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int n = s.length();

        char [] temp = new char[s.length()];
        int index = 0;

        for(int i = 0; i <  n;i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){//remove the alphanumeric characters

                if(ch >= 'A' && ch <= 'Z'){//convert the uppercase to lowercase
                    ch += (char)32;
                }
                temp[index++] = ch;
            }
        }

        int low = 0;
        int high = index - 1;

        while(low < high){
            if(temp[low] != temp[high]){
             System.out.println("False");
            }
            low++;
            high--;
        }
    }
}