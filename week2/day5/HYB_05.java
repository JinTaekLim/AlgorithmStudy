package week2.day5;
class HYB_05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String tmp = "";
        String first = "";
        String last = "";
        int cnt=overwrite_string.length();
        
        for(int i=0; i<s ; i++)
            first+=my_string.charAt(i);
        
        for(int i=s; cnt>0 ; i++){
            tmp+=my_string.charAt(i);
            cnt--;
        }
        
        int cnt2=first.length();
        int aaa=cnt2+overwrite_string.length();
        
        last=my_string.substring(aaa);
        
        answer=first+overwrite_string+last;
        
        return answer;
    }
}
