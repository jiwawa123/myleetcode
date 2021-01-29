package com.ji.algo.L1701_1750;

/**
 * user ji
 * data 2021/1/28
 * time 2:52 下午
 */
public class L1717 {
    public static void main(String[] args) {
        System.out.println(maximumGain("aabbaaxybbaabb",4,5));
    }

    public static int maximumGain(String s, int x, int y) {
        StringBuffer stringBuffer=new StringBuffer(s);
        int i=0,j=1;
        int res=0;
        if(x>=y){
            while (j<stringBuffer.length()){//优先删除"ab"
                if(stringBuffer.charAt(i)=='a'&&stringBuffer.charAt(j)=='b'){
                    res+=x;
                    stringBuffer=stringBuffer.replace(i,j+1,"");
                    i=Math.max(0,i-1);
                    j=i+1;
                }else{//不是"ab"就先不删除
                    i++;
                    j++;
                }
            }
            i=0;
            j=1;
            while (j<stringBuffer.length()){//看还有没有"ba",有的话再删除
                if(stringBuffer.charAt(i)=='b'&&stringBuffer.charAt(j)=='a'){
                    res+=y;
                    stringBuffer=stringBuffer.replace(i,j+1,"");
                    i=Math.max(0,i-1);
                    j=i+1;
                }else{
                    i++;
                    j++;
                }
            }
        }else{
            while (j<stringBuffer.length()){//优先删除"ba"
                if(stringBuffer.charAt(i)=='b'&&stringBuffer.charAt(j)=='a'){
                    res+=y;
                    stringBuffer=stringBuffer.replace(i,j+1,"");
                    i=Math.max(0,i-1);
                    j=i+1;
                }else{//不是"ab"就先不删除
                    i++;
                    j++;
                }
            }
            i=0;
            j=1;

            while (j<stringBuffer.length()){//看还有没有"ab",有的话再删除
                if(stringBuffer.charAt(i)=='a'&&stringBuffer.charAt(j)=='b'){
                    res+=x;
                    stringBuffer=stringBuffer.replace(i,j+1,"");
                    i=Math.max(0,i-1);
                    j=i+1;
                }else{
                    i++;
                    j++;
                }
            }
        }
        return res;
    }
}
