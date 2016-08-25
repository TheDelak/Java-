void setup() {
  //set size of thw window
  size (640, 360);
  surface.setResizable(true);
  background(50);
};

void draw() {
  stroke(255);
  strokeWeight(2);
  line(pmouseX, pmouseY, mouseX, mouseY);
};

void mousePressed() {
  background(50);
};