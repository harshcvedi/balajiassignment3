 public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        String S=sc.next();
        System.out.println(difference(S));
        

    }
    public static String difference(String S){
        StringBuilder sb =new StringBuilder();
        sb.append(S.charAt(0));
        
        for(int i=1;i<S.length();i++){
            char curr = S.charAt(i);
             char prev=S.charAt(i-1);

            int ascii = curr-prev;
            sb.append(ascii);
            sb.append(curr);
            
        
        }
        return sb.toString();
    }
}
