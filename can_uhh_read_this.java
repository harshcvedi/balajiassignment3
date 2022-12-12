 public static void main(String args[]) {
        Scanner st=new Scanner(System.in);
       String s=st.next();
       String str="";
       for(int i=0;i<s.length()-1;i++)
       { 
           str+=s.charAt(i);
           if(s.charAt(i+1)>='A'&&s.charAt(i+1)<='Z')
           {
               System.out.println(str);
               str="";
           }
       }
       str+=s.charAt(s.length()-1);
       System.out.println(str);
    }
}
