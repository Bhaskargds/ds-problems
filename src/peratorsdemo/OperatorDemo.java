package peratorsdemo;

public class OperatorDemo
{
    public static void main(String[] args)
    {
        int n=3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || n-i==1 || j==0 || n-j==1)
                    System.out.print("$ ");
                else
                    System.out.print("  ");



            }
            System.out.println();
        }
    }
}