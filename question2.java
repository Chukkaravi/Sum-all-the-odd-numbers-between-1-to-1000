public class question2
{
    public static void main(String[] args)
    {

        int n=1000;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
           if(i%2!=0)
           {
            sum=sum+i;
           }   
        }
        System.out.println(sum);
    } 
}