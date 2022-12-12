 public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        int max=Integer.MIN_VALUE;
        char c=' ';
        int arr[]=new int[127];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;

             if(max<arr[s.charAt(i)]){
            max=arr[s.charAt(i)];
            c=s.charAt(i);
        }

        }
       System.out.println(c);
    }
}
