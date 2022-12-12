public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int arr[][]=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int i=startrow;i<=endrow;i++){
                System.out.print(arr[i][startcol]+","+" ");
            }
    
            for(int j=startcol+1;j<=endcol;j++){
                System.out.print(arr[endrow][j]+","+" ");
            }

            for(int i=endrow-1;i>=startrow;i--){
                System.out.print(arr[i][endcol]+","+" ");
            }

            for(int j=endcol-1;j>startcol;j--){
                System.out.print(arr[startrow][j]+","+" ");
            }
            
            
            startrow++;
            startcol++;
            endcol--;
            endrow--;
         }System.out.print("END");
         }
}

