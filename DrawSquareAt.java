import ch.aplu.turtle.*;
Turtle t = new Turtle();
void drawSquareAt(int size,double x,double y){
t.setPos(x,y);
for(int i =0;i<4;i++){
t.forward(size);
t.right(90);
}
}
drawSquareAt(20,10.0,10.0);
drawSquareAt(20,40.0,10.0);
drawSquareAt(20,100.0,10.0);