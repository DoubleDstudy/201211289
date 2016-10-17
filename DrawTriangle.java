import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
void drawTriangle(int size){
for(int i =0; i<3;i++){
t1.forward(size);
t1.right(120);
}
}
drawTriangle(40);