class KuKuDan {
   static void kukudan(){
   int[] x = {1,2,3,4,5,6,7,8,9};
   for(int i = 0;i<9;i++){
   for(int j = 0; j<9;j++){
   System.out.printf("%d * %d = %2d ",x[i],x[j],x[i]*x[j]);
   }
  System.out.println();
   }
   }
   public static void main(String[] args) {
   kukudan();
   }
}