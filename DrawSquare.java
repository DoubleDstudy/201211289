import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
void drawSquare(int size){
for(int i =0; i<4;i++){
t1.forward(size);
t1.right(90);
}
}
drawSquare(50);