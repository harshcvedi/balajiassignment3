 public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int arr[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();

            }
        }
    
    rotate_matrix(arr);
        
    
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                    System.out.print(arr[i][j]+" ");
            }System.out.println();
}
}
    
public static void transpose_matrix(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        }
        public static void rotate_matrix(int arr[][]){
            transpose_matrix(arr);
            for(int i=0;i<arr.length;i++){
          
        
           int low = 0;  
int high = arr.length-1;  
while(low < high)  
{  
int temp = arr[low][i];  
arr[low][i] = arr[high][i];  
arr[high][i] = temp;  
low++;  
high--;  
}  
}  
        }
}
    

