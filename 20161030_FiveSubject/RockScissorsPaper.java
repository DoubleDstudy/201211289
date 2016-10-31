class RockScissorsPaper {
  static void GameStart(String ab,String ac){
    if(ab.equals("gawi")&& ac.equals("jumuk")){
      System.out.println("YSM Win");
    }else if(ab.equals("bo")&& ac.equals("gawi")){
      System.out.println("YSM Win");
    }else if(ab.equals("jumuk")&& ac.equals("bo")){
      System.out.println("YSM Win");
    }else if(ab.equals(ac)){
      System.out.println("Draw");
    }else
      System.out.println("JSJ Win");
  }
  public static void main(String[] args) {
    System.out.println("Rock scissors Paper!");
    String ac = "bo";
    String ab = "gawi";
    System.out.println("YSM : "+ac);
    System.out.println("JSJ : "+ab);
    GameStart(ab, ac);
  }
}