package January.Assignment1;

public class FindSubArray {
    public void findSubArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end);
        int sum=0;
        for(int i=0;i<=end;i++){
            sum+=arr[i];
        }
        if(sum%2!=0)
            return;
        while(true){
            int sum1=0,sum2=0;
            for(int i=0;i<mid;i++){
                sum1+=arr[i];
            }
            for(int i=mid;i<=end;i++){
                sum2+=arr[i];
            }
            if(sum1==sum2){
                break;
            }
            else if(sum1<sum2){
                mid++;
            }
            else if(sum1>sum2){
                mid--;
            }
        }
        for(int i=0;i<mid;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=mid;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        FindSubArray f=new FindSubArray();
        f.findSubArray(arr);
    }
}
