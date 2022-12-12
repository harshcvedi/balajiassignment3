 public static void main (String args[]) {
        ArrayList <Integer> list=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int M=sc.nextInt();
        int brr[]=new int[M];
        for(int i=0;i<brr.length;i++){
            brr[i]=sc.nextInt();
        }
     
        int i=arr.length-1;
        int j=brr.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=0;
            sum=sum+arr[i]+brr[j]+carry;
            list.add(sum%10);
            carry=sum/10;
            i--;
            j--;

        }
        while(i>=0){
            int sum=0;
            sum+=arr[i]+carry;
            list.add(sum%10);
            carry=sum/10;
            i--;

        }
    
    while(j>=0){
        int sum=0;
        sum+=brr[j]+carry;
        list.add(sum%10);
        carry=sum/10;
        j--;

    }
    if(carry!=0){
        list.add(carry);
    }
    
    for(int k=list.size()-1;k>=0;k--){
        System.out.print(list.get(k)+","+" ");
    }System.out.println("END");

           

      



    }
}
