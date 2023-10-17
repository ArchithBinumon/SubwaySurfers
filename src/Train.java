public class Train {
    private double trainSpeed;
    private double speedIncreaseTrain;
    private int trainLength;

   public Train(boolean trainIsRandom){
       if(trainIsRandom){
           trainSpeed = Math.random()*5+1;
           trainLength = (int)(Math.random()*10+1);
       }
       else {
           trainSpeed = 3;
           trainLength = 5;
       }
   }
    public void speedIncreaseTrain(){
        trainSpeed+=1;//after every x ticks
    }

}
