package geeksforgeekssolutions;

public class sieve {
   
    static int[] sieven(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i]=true;

        }
        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;

                }
            }
        }

            int count =0;
            for(int p =2;p<=n;p++){
                if (prime[p]) {
                    count++;
                   
                }
            }
                int[] res = new int[count];
                int index=0;
                for(int p =2;p<=n;p++){
                    if (prime[p]) 
                    {
                    res[index++]=p;    
                    }
                }
                return res;
            
        

    }
    public static void main(String[] args) {
        int n=35;
        int[]res =sieven(n);
        for(int ele:res){
            System.out.println(ele+"");
        }
    }

}
