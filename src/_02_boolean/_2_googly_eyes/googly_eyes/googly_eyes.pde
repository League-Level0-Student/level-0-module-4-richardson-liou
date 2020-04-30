PImage face;

void setup() {
  face = loadImage("Rigby.jpg");
    size(1000,1000);
    face.resize(width,height);
}
void draw() {
  background(face);
  fill(#FFFCFC);
  ellipse(600,375,90,90);
  ellipse(525,330,90,90);
       fill(#000000);
  ellipse(525,330,10,10);
         fill(#000000);
  ellipse(600,375,10,10);
if (mousePressed){
  print("x =" + mouseX + " y = " + mouseY);
}
}
//x=491 y= 302
//x=554 y=362
