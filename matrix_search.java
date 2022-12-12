    public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M=sc.nextInt();
    int arr[][]=new int[N][M];
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            arr[i][j]=sc.nextInt();
        }
    }int x=sc.nextInt();
    System.out.println(search(arr,x));
    }
    public static int search( int arr[][],int x){
    int row=0;
    int col=arr[0].length-1;
    while(row<arr.length && col>=0){
        if(arr[row][col]==x){
            return 1;
        }else if(arr[row][col]>x){
            col--;
        }else{
            row++;
        }
    }return 0;
    }
}
