package week006.day3;

public class LSH_03 {
    public int solution(int n, String control) {
        for(int i = 0; i<control.length(); i++){
            if('w' == control.charAt(i)){
                n += 1;
            }
            else if('s' == control.charAt(i)){
                n -= 1;
            }
            else if('d' == control.charAt(i)){
                n += 10;
            }
            else if('a' == control.charAt(i)){
                n -= 10;
            }
        }
        System.out.println("n : " + n);
        return n;
    }

    public static void main(String[] args) {
        LSH_03 lsh03 = new LSH_03();
        lsh03.solution(0, "wsdawsdassw");
    }
}
