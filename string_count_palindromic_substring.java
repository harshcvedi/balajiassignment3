    public static void main(String args[]) {
   
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
               if(ispalindrom(s.substring(i,j)))
               count++;
            }
        }
        System.out.print(count);
    }
    public static boolean ispalindrom(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
               if(s.charAt(i)!=s.charAt(j))
               return false ;
               i++;
               j--;

        }
        return true ;
    }
}
