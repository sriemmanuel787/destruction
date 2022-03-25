import java.io.*;

class Main{
  public static void main(String[] args)throws FileNotFoundException{
    String fileName = "";
    for(int i = 0; i >= 0; i++){
      fileName = i + ".txt";
      PrintStream create = new PrintStream(fileName);
      create.print("haha");
    }
  }
}
