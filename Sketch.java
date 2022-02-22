import processing.core.PApplet;
/**
* This program Sketch.java draws a scene by calling functions.
* @author: Garv Choudhry
 */
public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// Calling size function
    size(720, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Calling background function and defining a colour
    background(0, 200, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // ENVIRONMENT DESIGNS
    // Draw a yellow circle to be the sun
    stroke(255, 255, 0);
    fill(255, 255, 0);
    ellipse(700, 2, 90, 90);

    // Draw 2 birds
    stroke(255);
    line(220, 100, 240, 120);
    line(240, 120, 260, 100);
    line(260, 80, 280, 100);
    line(280, 100, 300, 80);

    // Draw sun rays
    stroke(255, 255, 0);
    line(640, 5, 600, 20);
    line(650, 30, 625, 55);
    line(675, 50, 660, 80);
    line(706, 60, 700, 95);

    // Draw base grass
    stroke(0, 120, 0);
    fill(0, 120, 0);
    rect(0, 350, 720, 200);

    // Draw hill in the background
    stroke(0, 120, 0);
    fill(0, 120, 0);
    arc(40, 350, 250, 120, 0, 10);

    // RED HOUSE DESIGNS
    // Draw the body 
    stroke(0);
    fill(160, 55, 63);
    rect(495, 230, 200, 200);

    // Draw the roof
    fill(0);
    triangle(485, 230, 590, 110, 705, 230); 

    // Draw the door 
    fill(0);
    rect(520, 350, 50, 80); 

    // Draw the doorknob 
    fill(200, 60, 65);
    ellipse(560, 400, 15, 15); 

    // Draw windows
    fill(0);
    rect(520, 260, 40, 40);
    rect(615, 260, 40, 40);
    rect(590, 350, 90, 40);

    // PURPLE HOUSE DESIGNS
    // Draw the body
    stroke(0);
    fill(100, 100, 250);
    rect(4, 245, 70, 45);

    // Draw the roof 
    fill(255);
    triangle(0, 245, 37, 205, 79, 245); 

    // Draw the door
    rect(10, 270, 10, 20); 

    // Draw the doorknob
    fill(100, 100, 255);
    ellipse(17, 280, 3, 3);

    // Draw a window 
    fill(255);
    rect(40, 250, 20, 25);
  }
}