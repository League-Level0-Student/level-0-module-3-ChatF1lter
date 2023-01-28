for(int b=99;b>0;b--){
 if(b==1){
  System.out.println(b + " bottle of beer on the wall. " + b + " bottles of beer. " + " Take one down and pass it around, no more bottles of beer on the wall. No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall. "); 
 }
 else if(b==2){
  System.out.println(b + " bottles of beer on the wall. " + b + " bottles of beer. Take one down and pass it around, " + (b-1) + " bottle of beer on the wall "); 
 }
else{
  System.out.println(b + " bottles of beer on the wall. " + b + " bottles of beer. Take one down and pass it around, " + (b-1) + " bottles of beer on the wall. ");
}
} 
