class DrawTriangleWithChar {
   static void drawTriangleWithChar(int height,String symbol){
  StringBuffer sbuf = new StringBuffer();
  String white =" ";
  for (int i=0; i<height; i++ ) {
         for(int j=0;j<height-i;j++){
            sbuf.append(white);
         }
         System.out.print(sbuf);
         sbuf.delete(0,sbuf.length());
         for (int j=0; j<i*2+1; j++ ) {
            sbuf.append(symbol);
         }
         System.out.print(sbuf);
         sbuf.delete(0,sbuf.length());
         System.out.println();
      }
   }
   public static void main(String[] args) {
   drawTriangleWithChar(9, "*");
   }
}