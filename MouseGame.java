import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class MouseGame extends PApplet {

public void setup() {
  //set size of thw window
  
  surface.setResizable(true);
  background(50);
};

public void draw() {
  stroke(255);
  strokeWeight(2);
  line(pmouseX, pmouseY, mouseX, mouseY);
};

public void mousePressed() {
  background(50);
};
  public void settings() {  size (640, 360); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "MouseGame" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
