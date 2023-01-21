package January.Assignment1;

public class FindSuperString {
    public int findString(String x[],String y[]){
        int count=0;
        for(int i=0;i<x.length;i++){
            int tempCount=0;
            for(int j=0;j<y.length;j++){
                char c1[]=x[i].toCharArray();
                char c2[]=y[j].toCharArray();
                sort(c1);sort(c2);
                int m=0,k=0;
                
                while(k<c1.length && m<c2.length){
                    if(c1[k]==c2[m])
                        m++;
                    k++;
                }
                if(m==c2.length)
                    tempCount++;
            }
            if(tempCount==y.length)
                count++;
        }
        return count;
    }
    public void sort(char c[]){
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length-1-i;j++){
                if(c[j]>c[j+1]){
                    char temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String x[]={"ceo","alco","caaeio","ceai"};
        String y[]={"ec","oc","ceo"};
        FindSuperString f=new FindSuperString();
        System.out.println(f.findString(x,y));
    }
}
