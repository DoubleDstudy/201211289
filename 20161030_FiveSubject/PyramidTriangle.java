class PyramidTriangle {
  static void StringStar(){
    char star = '*';
    char blank = ' ';
    for(int i =1;i<5;i++){
      for(int j = 1; j<=5-i;j++){
          System.out.print(blank);
      }
      for(int j = 1;j<=(i*2)-1;j++){
          System.out.print(star);
      }
      System.out.println();
    }
  }
  static void StringBufferStar(){
    String s = "*";
    String s1 = " ";
    StringBuffer sbuf = new StringBuffer();
    for(int i=0;i<5;i++) {
      for(int j=5;j>=i;j--) {
        sbuf.append(s1);
      }
      for(int j=0;j<=i;j++) {
        sbuf.append(s);
      }
      for(int j=0;j<=i;j++) {
        sbuf.append(s);
      }
       System.out.printf("%s\n",sbuf.toString());
       sbuf.delete(0, sbuf.length());
     }
    }
    public static void main(String[] args) {
      StringStar();
      StringBufferStar();
    }
}