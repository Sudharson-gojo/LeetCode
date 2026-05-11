class Solution {
    public int romanToInt(String s) {
        int i  = s.length()-1, prev  =0;
        int total = 0;
        while(i>=0){
            int curr  = value(s.charAt(i));
            if(curr<prev){
                total-= curr;
            }else{
                total+= curr;
            }
            prev  =  curr;
             i--;
        }
        return total;
       
    }
    public int value(char i){
        switch(i){
            case 'I': return 1;
         
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C':   return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}