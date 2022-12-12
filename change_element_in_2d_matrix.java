  public static void main (String args[]) {
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int ar[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j]=scn.nextInt();
            }
        }
               int br[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                br[i][j]=1;
            }
        }
        
        for(int i=0;i<n;i++)
        { 
            
            for(int j=0;j<m;j++)
            {
                
                if(ar[i][j]==0)
                {
                  
                    for(int a=0;a<m;a++)
                         br[i][a]=0;
                    for(int b=0;b<n;b++)
                        br[b][j]=0;
                    
                }
            }
        }
      for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(br[i][j]+" ");
            }
            System.out.println();
        }


    }
}
