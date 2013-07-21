import java.util.Scanner;
class TicTacToe
{
public static final char emp='0';
public static final char round='o';
public static final char cross='x';
public static int BoardSize,R,C;
public static char Board[][],turn;
public static String status;
public static boolean valid;


 TicTacToe()
 {
 System.out.println("Enter the tictactoe board size:");
 Scanner in=new Scanner(System.in);
 BoardSize=in.nextInt();
 Board=new char[BoardSize][BoardSize];
 start(); //start method call
 }


  public static void start()     //Initial Board
  {
  for(int row=0;row<BoardSize;row++)
  {
  for(int col=0;col<BoardSize;col++)
  {
  Board[row][col]=emp;
  }
  }
  printBoard();
  turn=cross;
  status="play";
  PlayGame(turn);
  }

  public static void PlayGame(char turn)   //Play Game
  {
  Scanner in=new Scanner(System.in); 
  valid=false;
  do
  {
  if(turn == cross)
  System.out.println("Player"+cross+" enter the value:");
  else
  System.out.println("Player"+round+" enter the value:");
  R=in.nextInt();
  C=in.nextInt();
  if(!(Board[R][C] == emp))
  System.out.println("invalid input !! \n Enter again:");
  else if((R>BoardSize) && (C>BoardSize))
  System.out.println("invalid input !! \n Enter again:");
  else
  Board[R][C]=turn;
  valid=true;
  }
  while(!valid);

  printBoard();
  Won(turn,R,C);
  if(Won(turn,R,C))
  {
  
  status="won";
  }
  Draw();
  if(Draw())
  {
  status="draw";
  }
  if(status == "play")
  {
  if(turn== cross)
  turn = round;
  else
  turn = cross;
  PlayGame(turn);
  }
  else if(status == "won")
  System.out.println("player"+ turn +"won!!");
  else
  System.out.println("draw!!");
  }

  
  public static boolean Won(char turn,int R,int C)  //won or not
  {
  int i;
  boolean result=false,result1=false,result2=false;
  for(i=0;i<BoardSize;i++)
  {
  if(Board[R][i] == turn)
  {
  if(i== (BoardSize-1))
  result=true;
  }
  else
  break;
  }

  for(i=0;i<BoardSize;i++)
  {
  if(Board[i][C] == turn)
  {
  if(i==(BoardSize-1))
  result1=true;
  }
  else
  break;
  }
  
  for(i=0;i<BoardSize;i++)
  {
  if(Board[i][i]== turn)
  {
  if(i==(BoardSize-1))
  result2=true; 
  }
  else
  break;
  }
 
  if(result == true || result1==true||result2==true)
  return true;
  else
  return false;
  }

  public static boolean Draw()
  {
  for(int i=0;i<BoardSize;i++)
  {
  for(int j=0;j<BoardSize;j++)
  {
  if(Board[i][j]==emp)
  {
  return false;
  }
  }
  }
  return true;
  }
   

   public static void printBoard()   //print Board
   {
   for (int row = 0; row < BoardSize; row++)
   {
   for (int col = 0; col < BoardSize; col++) 
   {
   print0x(Board[row][col]); 
   if (col != BoardSize-1) 
   {
   System.out.print("|");   
   }
   }
   System.out.println();
   if (row != BoardSize-1)
   {
   System.out.println("-------------------------"); 
   }
   }
   System.out.println();
   } 

    public static void print0x(int content)   //print method
    {
  
    switch (content) 
    {
    case emp:  System.out.print("  "); break;
    case cross: System.out.print(" x "); break;
    case round:  System.out.print(" o "); break;
    default: System.out.println("end");break;
    }
    }

}
