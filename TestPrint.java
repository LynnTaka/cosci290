//Lynn Takahashi
//CoSci 290
//Testing different print examples

public class TestPrint{

  //main method, where the application starts
  public static void main(String[]large){
    System.out.println("cat");
  //"cat" is a string, called a string literal
    System.out.println(2 + 2);
    System.out.println("cat" + 2);
  //The 2 is called an int (integer, whole numbers)
    System.out.println("cat" + 2 + 'c');
  /* 'c'is a char (character), a character is always 
    a single symbol w/ 1 quotation */
    System.out.println(2 + 'c' + "cat");
  /* thought it was doing arthimatic, the character 'c' 
    in java means 99 so answer was 101cats*/
    System.out.print("'S\n");
  /* makes so it doesnt go to next linw w/o ln
     \n= a new line */
    System.out.println("Hello \t World!");
  // Makes a tab
    System.out.println("._.___________                                 ._. \n"
                      +"| |\\_   _____/ ______ ____ _____  ______   ____| | \n"
                      +"| | |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ | \n"
                      +" \\| |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\| \n"
                      +"  _/_______  /____  >\\___  >____  /   __/ \\___  >_ \n"
                      +" \\/        \\/     \\/     \\/     \\/|__|        \\/\\/");
  }
}