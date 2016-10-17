import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
void drawStar(int size, double x ,double y){
t1.setPos(x,y);
for(int i=0;i<5;i++){
t1.forward(size);
t1.right(144);
}
}
drawStar(10,0,0);
drawStar(50,0,0);