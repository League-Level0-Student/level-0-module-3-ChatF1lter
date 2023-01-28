
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 
  //Use an if statement and remainder to alternate the color of your rings.
for(int b=20;b>0;b--){
  if(b % 2 == 0){
    fill(255,0,0);
  }else if(b % 2 == 1){
   fill(0,0,0); 
  }
  ellipse(250,250,b*20,b*20);
 

}
}
