import ch.aplu.turtle.*;
class SwirlSquare{
  static void makeSwirlSquare(int size,int bigger,int turns,double degree){
    Turtle t1 = new Turtle();
    for(int i =0;i<turns;i++){
     if(i%2 !=0){
               size+=bigger;
      }
    t1.forward(size);
    t1.right(degree);
    }
  }
  public static void main(String[] args){
  int size =5;
  int turns = 20;
  int bigger = 15;
  float degree = (float)90.0;
  makeSwirlSquare(size,bigger,turns,degree);
  }
}