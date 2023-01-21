package January.Assignment1;

import java.util.HashMap;
class FindFrequency {
    public boolean isEqual(char arr[],char c){
        boolean isMatch=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c)
                isMatch=true;
        }
        return isMatch;
    }
    public void frequency(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char arr[]=s2.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            map.put(arr[i], 0);
        }
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(isEqual(arr,c)){
                map.put(c, map.get(c)+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+":"+map.get(arr[i]));
            if(i!=arr.length-1)
                System.out.print(",");
        }
    }
    public static void main(String[] args) {
        String s1="Hello World Please";
        String s2="Help";
        FindFrequency f=new FindFrequency();        
        f.frequency(s1,s2);
    }
}
