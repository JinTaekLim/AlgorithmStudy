package week9.day1;

import java.util.Arrays;

public class HYB_01 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] tmp= {a, b, c, d};

        Arrays.sort(tmp);

        int x=tmp[0];
        int y=tmp[1];
        int z=tmp[2];
        int q=tmp[3];

        if(a==b&b==c&c==d){ //모두 같을 때
            return a*1111;
        }


        else if(x==y&&y==z){//세개 같고 두개 다를때
            return (10*x+q)*(10*x+q);
        }
        else if(y==z&&z==q){
            return (10*y+x)*(10*y+x);
        }

        else if(x==y&&z==q){//두개씩 같을 때
            System.out.print(""+x+y+z+q);
            return (x+z)*Math.abs(x-z);

        }

        else if(x==y&&z!=q){
            return z*q;

        }
        else if(y==z&&x!=q){
            System.out.print(""+x+y+z+q);
            return x*q;
        }
        else if(z==q&&x!=y){
            return x*y;
        }

        else if(a!=b&b!=c&c!=d&a!=d){ //모두 다를 때
            return x;
        }

        else
            return 0;

    }

}


