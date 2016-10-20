import ch.aplu.turtle.*;
class p1_TurtleTriangle{
void drawSquareOrTriangle(int size,int sides, double angle){
    Turtle t1 = new Turtle();
t1.home();
     t1.clear();
     for(int i=0;i<sides;i++){
        t1.forward(size);
        t1.right(angle);
     }
}
public static void main(String[] args){
p1_TurtleTriangle p1= new p1_TurtleTriangle();
p1.drawSquareOrTriangle(60, 30, 120);
  }
}