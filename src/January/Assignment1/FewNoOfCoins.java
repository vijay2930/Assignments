package January.Assignment1;

import java.util.HashMap;

public class FewNoOfCoins {
    public int findFewerNoOfCoins(int coins[],int money){
        HashMap<Integer,Integer> map=new HashMap<>();
        int temp=money;
        for(int i=0;i<coins.length;i++){
            map.put(coins[i], 0);
        }
        sort(coins);
        for(int i=0;i<coins.length;i++){
            int count=temp/coins[i];
            map.put(coins[i],count);
            temp%=coins[i];
            if(temp==0)
                break;
        }
        map.put(coins[coins.length-1],map.get(coins[coins.length-1])+temp);
        int totalCoins=0;
        int sum=0;
        for(int i=0;i<coins.length;i++){
            int val=map.get(coins[i]);
            totalCoins+=val;
            sum+=val*coins[i];
            if(sum>money)
                return -1;
        }

        return totalCoins;
    }
    public void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        FewNoOfCoins f=new FewNoOfCoins();
        int coins[]={2,8};
        int money=101;
        System.out.println(f.findFewerNoOfCoins(coins,money));
        
    }
}
