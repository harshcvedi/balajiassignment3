  public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

int sum=1;

String out="";

for(int i=0;i<s.length()-1;i++)

{

if(s.charAt(i)==s.charAt(i+1))

{

sum++;

}

else

{

out=out+s.charAt(i) ;
if(sum>1){
out=out+sum;


sum=1;
}

}

}

out=out+s.charAt(s.length()-1);
if(sum>1){

out=out+sum;
}

System.out.println(out);

}

}
      
