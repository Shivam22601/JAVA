public class RomanToInt{
      public int romanToInt(String s) {
        int num = 0;

        for(int i = 0; i < s.length(); i++){
            int curr = value(s.charAt(i));
            
            if(i < s.length()-1 && curr < value(s.charAt(i+1))){
                num -= curr;
            }else{
                num += curr;
            }
        }
        return num;
    }

    public int value(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        return 1000;
    }
       

    public static void main(String[] args) {
        RomanToInt solution = new RomanToInt();
        String s = "MCMXCIV";
        int result = solution.romanToInt(s);
        System.out.println("The integer value of " + s + " is: " + result);
    }
}