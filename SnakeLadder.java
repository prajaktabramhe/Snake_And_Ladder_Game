import java.util.Random;
 public class SnakeLadder 
{
    public static final int startPosition = 0;
    public static final int winningPosition = 100;
    public static int position=0;

    public static int throwDie() 
    {
	Random random=new Random();
        int value = random.nextInt(6)+1;
	return value;
     }
     public static int optionForPlay() 
     {
	 Random random=new Random();
         int value1 = random.nextInt(3);
	 return  value1 ;
      }

      public static void main(String[] args) 
      {
         System.out.println("Welcome to Snake and ladder game");
         System.out.println("Start position is: "  + startPosition);
         System.out.println("Winning position is: "  + winningPosition);
        
         int playValue=optionForPlay();
         if(playValue==0) 
         {
            System.out.println("No play");
            position = position + throwDie();
         }
         else if(playValue==1)
         {
            System.out.println("Got Ladder");
            position = position + throwDie();
         }
         else if(playValue==2)
         {
            System.out.println("Snake Attack");
            position = position + throwDie();
         }
         System.out.println("new position is : " +position);

     }
 }
