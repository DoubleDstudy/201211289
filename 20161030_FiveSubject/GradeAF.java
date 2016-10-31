class GradeAF{
  static void examScore(double score){
    if(score >= 90 && score <=100){
      System.out.println("grade of "+score+" is A!!");
    }else if(score >= 80 && score <90){
      System.out.println("grade of "+score+" is B!!");
    }else if(score >= 70 && score <80){
      System.out.println("grade of "+score+" is C!!");
    }else if(score >= 60 && score <70){
      System.out.println("grade of "+score+" is D!!");
    }else
      System.out.println("grade of "+score+" is F!!");
  }
  public static void main(String[] args){
    double score = 79.5;
    examScore(score);
  }
}