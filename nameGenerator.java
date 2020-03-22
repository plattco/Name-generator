 import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class nameGeneratorfinal
{
  /**
  *This program takes in some choices from the user in order to generate some names based on the users preferences.
  */
  public static void main(String[] args) throws FileNotFoundException
  {
    
    Scanner console = new Scanner(System.in);
    System.out.println("Filename to write to: ");
    String filewrite = console.next();
    
    PrintWriter out = new PrintWriter(filewrite);
    
    
    //Display that the user can input three options for each categories. 
    //explain the users category choices so that they can choose
    System.out.println("Enter the three categories in the shown format. For the first category (Alignment) you can choose between Good or Evil. For the second category (Gender) you can choose between Male, Female, or Any. For the third category (media) you can choose between Movie, Book, TV, Bible, or any.");
    //explain the proper format of the input
    System.out.println("For the first choice: 1 = Good and 2 = Evil.");
    System.out.println("For the second choice: 1 = Male. 2 = Female. 3 = Any.");
    System.out.println("For the third choice: 1 = Movie. 2 = Book. 3 = TV. 4 = Bible. 5 = Any.");
    System.out.println("Format For Good Male Movie is 111");
   
    //Create the arrays listed in the end of this document. 
    //create all array lists here.
      //The array lists are the different databases of names that each category will pull from. 
    
    out.close();
    //begin good category lists
   ArrayList<String> GoodMaleMovie = new ArrayList<String>();
   GoodMaleMovie.add("Gandalf");
  GoodMaleMovie.add("Harry");
   GoodMaleMovie.add("Frodo");
  GoodMaleMovie.add("Neo");
   
   ArrayList<String> GoodMaleBook = new ArrayList<String>();
   GoodMaleBook.add("Obi");
   GoodMaleBook.add("John");
   GoodMaleBook.add("Sierra");
  GoodMaleBook.add("Jack");
   
   ArrayList<String> GoodMaleTV = new ArrayList<String>();
   GoodMaleTV.add("Picard");
   GoodMaleTV.add("Eddard");
   GoodMaleTV.add("Tyrion");
   GoodMaleTV.add("Kirk");
   
   ArrayList<String> GoodMaleBible = new ArrayList<String>();
   GoodMaleBible.add("John");
   GoodMaleBible.add("Isaac");
   GoodMaleBible.add("Keith");
   GoodMaleBible.add("Jesus");
   
   ArrayList<String> GoodMaleAny = new ArrayList<String>();
   GoodMaleAny.add("Gandalf");
  GoodMaleAny.add("Harry");
   GoodMaleAny.add("Frodo");
  GoodMaleAny.add("Neo");
   GoodMaleAny.add("John");
   GoodMaleAny.add("Isaac");
   GoodMaleAny.add("Keith");
   GoodMaleAny.add("Jesus");
   GoodMaleAny.add("Picard");
   GoodMaleAny.add("Eddard");
   GoodMaleAny.add("Tyrion");
   GoodMaleAny.add("Kirk");
   GoodMaleAny.add("Obi");
   GoodMaleAny.add("John");
   GoodMaleAny.add("Sierra");
   GoodMaleAny.add("Jack");
   ArrayList<String> GoodFemaleMovie = new ArrayList<String>();
   GoodFemaleMovie.add("Katniss");
   GoodFemaleMovie.add("Julia");
   GoodFemaleMovie.add("Hermoine");
   GoodFemaleMovie.add("Bride");
   
   ArrayList<String> GoodFemaleBook = new ArrayList<String>();
   GoodFemaleBook.add("Katniss");
   GoodFemaleBook.add("Cinderella");
   GoodFemaleBook.add("Bella");
   GoodFemaleBook.add("Hermoine");
   
   ArrayList<String> GoodFemaleTV = new ArrayList<String>();
   GoodFemaleTV.add("Catlin");
   GoodFemaleTV.add("Daenarys");
   GoodFemaleTV.add("Sansa");
   GoodFemaleTV.add("Jessica");
   
   ArrayList<String> GoodFemaleBible = new ArrayList<String>();
   GoodFemaleBible.add("Abigail");
   GoodFemaleBible.add("Bethel");
   GoodFemaleBible.add("Claudia");
   GoodFemaleBible.add("Grace");
    
  
   ArrayList<String> GoodFemaleAny = new ArrayList<String>();
   GoodFemaleAny.add("Abigail");
   GoodFemaleAny.add("Sauron");
   GoodFemaleAny.add("Smith");
   GoodFemaleAny.add("Vader");
   GoodFemaleAny.add("Katniss");
   GoodFemaleAny.add("Julia");
   GoodFemaleAny.add("Hermoine");
   GoodFemaleAny.add("Bride");
   GoodFemaleAny.add("Bella");
   GoodFemaleAny.add("Cinderella");
   GoodFemaleAny.add("Catlin");
   GoodFemaleAny.add("Daenarys");
   GoodFemaleAny.add("Sansa");
   GoodFemaleAny.add("Jessica");
   
   
   ArrayList<String> GoodAnyMovie = new ArrayList<String>();
   GoodAnyMovie.add("Katniss");
   GoodAnyMovie.add("Julia");
   GoodAnyMovie.add("Hermoine");
   GoodAnyMovie.add("Bride");
   GoodAnyMovie.add("Gandalf");
   GoodAnyMovie.add("Harry");
   GoodAnyMovie.add("Frodo");
   GoodAnyMovie.add("Neo");
  
  
   ArrayList<String> GoodAnyBook = new ArrayList<String>();
   GoodAnyBook.add("Obi");
   GoodAnyBook.add("John");
   GoodAnyBook.add("Sierra");
   GoodAnyBook.add("Jack");
   GoodAnyBook.add("Katniss");
   GoodAnyBook.add("Cinderella");
   GoodAnyBook.add("Bella");
   GoodAnyBook.add("Hermoine");
   
   ArrayList<String> GoodAnyTV = new ArrayList<String>();
   GoodAnyTV.add("Catlin");
   GoodAnyTV.add("Daenarys");
   GoodAnyTV.add("Sansa");
   GoodAnyTV.add("Jessica");
   GoodAnyTV.add("Picard");
   GoodAnyTV.add("Eddard");
   GoodAnyTV.add("Tyrion");
   GoodAnyTV.add("Kirk");
   
   ArrayList<String> GoodAnyBible = new ArrayList<String>();
   GoodAnyBible.add("Abigail");
   GoodAnyBible.add("Bethel");
   GoodAnyBible.add("Claudia");
   GoodAnyBible.add("Grace");
   GoodAnyBible.add("John");
   GoodAnyBible.add("Isaac");
   GoodAnyBible.add("Keith");
   GoodAnyBible.add("Jesus");
   
   
   ArrayList<String> GoodAnyAny = new ArrayList<String>();
   GoodAnyAny.add("Abigail");
   GoodAnyAny.add("Bethel");
   GoodAnyAny.add("Claudia");
   GoodAnyAny.add("Grace");
   GoodAnyAny.add("John");
   GoodAnyAny.add("Isaac");
   GoodAnyAny.add("Keith");
   GoodAnyAny.add("Jesus");
   GoodAnyAny.add("Catlin");
   GoodAnyAny.add("Daenarys");
   GoodAnyAny.add("Sansa");
   GoodAnyAny.add("Jessica");
   GoodAnyAny.add("Picard");
   GoodAnyAny.add("Eddard");
   GoodAnyAny.add("Tyrion");
   GoodAnyAny.add("Kirk");
   GoodAnyAny.add("Obi");
   GoodAnyAny.add("John");
   GoodAnyAny.add("Sierra");
   GoodAnyAny.add("Jack");
   GoodAnyAny.add("Katniss");
   GoodAnyAny.add("Cinderella");
   GoodAnyAny.add("Bella");
   GoodAnyAny.add("Hermoine");
   GoodAnyAny.add("Katniss");
   GoodAnyAny.add("Julia");
   GoodAnyAny.add("Hermoine");
   GoodAnyAny.add("Bride");
   GoodAnyAny.add("Gandalf");
   GoodAnyAny.add("Harry");
   GoodAnyAny.add("Frodo");
   GoodAnyAny.add("Neo");
   
   
   
   //begin evil category lists
   ArrayList<String> EvilMaleMovie = new ArrayList<String>();
   EvilMaleMovie.add("Saruman");
   EvilMaleMovie.add("Sauron");
   EvilMaleMovie.add("Smith");
   EvilMaleMovie.add("Vader");
   
   ArrayList<String> EvilMaleBook = new ArrayList<String>();
   EvilMaleBook.add("Voldemort");
   EvilMaleBook.add("Claudius");
   EvilMaleBook.add("Lago");
   EvilMaleBook.add("Golem");
   
   ArrayList<String> EvilMaleTV = new ArrayList<String>();
   EvilMaleTV.add("Joffrey");
   EvilMaleTV.add("Kilgrave");
   EvilMaleTV.add("Fisk");
   EvilMaleTV.add("Hannibal");
   
   ArrayList<String> EvilMaleBible = new ArrayList<String>();
   EvilMaleBible.add("Herod");
   EvilMaleBible.add("Gain");
   EvilMaleBible.add("Judas");
   EvilMaleBible.add("Juda");
   
   ArrayList<String> EvilMaleAny = new ArrayList<String>();
   EvilMaleAny.add("Saruman");
   EvilMaleAny.add("Sauron");
   EvilMaleAny.add("Smith");
   EvilMaleAny.add("Vader");
   EvilMaleAny.add("Herod");
   EvilMaleAny.add("Gain");
   EvilMaleAny.add("Judas");
   EvilMaleAny.add("Juda");
   EvilMaleAny.add("Joffrey");
   EvilMaleAny.add("Kilgrave");
   EvilMaleAny.add("Fisk");
   EvilMaleAny.add("Hannibal");
   EvilMaleAny.add("Voldemort");
   EvilMaleAny.add("Claudius");
   EvilMaleAny.add("Lago");
   EvilMaleAny.add("Golem");
   
   ArrayList<String> EvilFemaleMovie = new ArrayList<String>();
   EvilFemaleMovie.add("Bellatrix");
   EvilFemaleMovie.add("Cersei");
   EvilFemaleMovie.add("Harley");
   EvilFemaleMovie.add("Elle");
   
   ArrayList<String> EvilFemaleBook = new ArrayList<String>();
   EvilFemaleBook.add("Umbridge");
   EvilFemaleBook.add("Suzanne");
   EvilFemaleBook.add("Veruca");
   EvilFemaleBook.add("Scarlett");
   
   ArrayList<String> EvilFemaleTV = new ArrayList<String>();
   EvilFemaleTV.add("Cersei");
   EvilFemaleTV.add("Alyson");
   EvilFemaleTV.add("Constance");
   EvilFemaleTV.add("Lydia");
   
   ArrayList<String> EvilFemaleBible = new ArrayList<String>();
   EvilFemaleBible.add("Gomer");
   EvilFemaleBible.add("Delilah");
   EvilFemaleBible.add("Herodias");
   EvilFemaleBible.add("Jezebel");
   
   ArrayList<String> EvilFemaleAny = new ArrayList<String>();
   EvilFemaleAny.add("Gomer");
   EvilFemaleAny.add("Delilah");
   EvilFemaleAny.add("Herodias");
   EvilFemaleAny.add("Jezebel");
   EvilFemaleAny.add("Cersei");
   EvilFemaleAny.add("Alyson");
   EvilFemaleAny.add("Constance");
   EvilFemaleAny.add("Lydia");
   EvilFemaleAny.add("Umbridge");
   EvilFemaleAny.add("Suzanne");
   EvilFemaleAny.add("Veruca");
   EvilFemaleAny.add("Scarlett");
   EvilFemaleAny.add("Bellatrix");
   EvilFemaleAny.add("Cersei");
   EvilFemaleAny.add("Harley");
   EvilFemaleAny.add("Elle");
   
   ArrayList<String> EvilAnyMovie = new ArrayList<String>();
   EvilAnyMovie.add("Saruman");
   EvilAnyMovie.add("Sauron");
   EvilAnyMovie.add("Smith");
   EvilAnyMovie.add("Vader");
   EvilAnyMovie.add("Bellatrix");
   EvilAnyMovie.add("Cersei");
   EvilAnyMovie.add("Harley");
   EvilAnyMovie.add("Elle");
   
   ArrayList<String> EvilAnyBook = new ArrayList<String>();
   EvilAnyBook.add("Umbridge");
   EvilAnyBook.add("Suzanne");
   EvilAnyBook.add("Veruca");
   EvilAnyBook.add("Scarlett");
   EvilAnyBook.add("Voldemort");
   EvilAnyBook.add("Claudius");
   EvilAnyBook.add("Lago");
   EvilAnyBook.add("Golem");
   
   ArrayList<String> EvilAnyTV = new ArrayList<String>();
   EvilAnyTV.add("Cersei");
   EvilAnyTV.add("Alyson");
   EvilAnyTV.add("Constance");
   EvilAnyTV.add("Lydia");
   EvilAnyTV.add("Joffrey");
   EvilAnyTV.add("Kilgrave");
   EvilAnyTV.add("Fisk");
   EvilAnyTV.add("Hannibal");
   
   ArrayList<String> EvilAnyBible = new ArrayList<String>();
   EvilAnyBible.add("Gomer");
   EvilAnyBible.add("Delilah");
   EvilAnyBible.add("Herodias");
   EvilAnyBible.add("Jezebel");
   EvilAnyBible.add("Herod");
   EvilAnyBible.add("Gain");
   EvilAnyBible.add("Judas");
   EvilAnyBible.add("Juda");
   
   
   ArrayList<String> EvilAnyAny = new ArrayList<String>();
   EvilAnyAny.add("Gomer");
   EvilAnyAny.add("Delilah");
   EvilAnyAny.add("Herodias");
   EvilAnyAny.add("Jezebel");
   EvilAnyAny.add("Herod");
   EvilAnyAny.add("Gain");
   EvilAnyAny.add("Judas");
   EvilAnyAny.add("Juda");
   EvilAnyAny.add("Cersei");
   EvilAnyAny.add("Alyson");
   EvilAnyAny.add("Constance");
   EvilAnyAny.add("Lydia");
   EvilAnyAny.add("Joffrey");
   EvilAnyAny.add("Kilgrave");
   EvilAnyAny.add("Fisk");
   EvilAnyAny.add("Hannibal");
   EvilAnyAny.add("Umbridge");
   EvilAnyAny.add("Suzanne");
   EvilAnyAny.add("Veruca");
   EvilAnyAny.add("Scarlett");
   EvilAnyAny.add("Voldemort");
   EvilAnyAny.add("Claudius");
   EvilAnyAny.add("Lago");
   EvilAnyAny.add("Golem");
   EvilAnyAny.add("Saruman");
   EvilAnyAny.add("Sauron");
   EvilAnyAny.add("Smith");
   EvilAnyAny.add("Vader");
   EvilAnyAny.add("Bellatrix");
   EvilAnyAny.add("Cersei");
   EvilAnyAny.add("Harley");
   EvilAnyAny.add("Elle");
   
   
   
   //Allow the user to input their above selection.
   //print a random name from the categories that the user inputs below
   
   //Use If-then statements to select which array to randomly pull a name from.
   //such as:  If choice is “good male movie” then randomly print. a name from the GoodMaleMovie array.
   
   //calling input method below
   int choice = readinput();
   
    if(choice == 111)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodMaleMovie.get(i));
      out.println(GoodMaleMovie.get(i));
    }
    
    if(choice == 112)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodMaleBook.get(i)); 
      out.println(GoodMaleBook.get(i));
    }
    if(choice == 113)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodMaleTV.get(i));  
      out.println(GoodMaleTV.get(i));
    }
    if(choice == 114)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodMaleBible.get(i)); 
      out.println(GoodMaleBible.get(i));
    }
    if(choice == 115)
    {
      int i = (int) (Math.random() * 16) + 1;
      System.out.println(GoodMaleAny.get(i));              
      out.println(GoodMaleAny.get(i));
    }
    if(choice == 121)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodFemaleMovie.get(i)); 
      out.println(GoodFemaleMovie.get(i));
    }
    if(choice == 122)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodFemaleBook.get(i));
      out.println(GoodFemaleBook.get(i));
    }
    if(choice == 123)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodFemaleTV.get(i));  
      out.println(GoodFemaleTV.get(i));
    }
    if(choice == 124)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(GoodFemaleBible.get(i)); 
      out.println(GoodFemaleBible.get(i));
    }
    if(choice == 125)
    {
      int i = (int) (Math.random() * 14) + 1;
      System.out.println(GoodFemaleAny.get(i));   
      out.println(GoodFemaleAny.get(i));
    }
    if(choice == 131)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(GoodAnyMovie.get(i));   
      out.println(GoodAnyMovie.get(i));
    }
    if(choice == 132)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(GoodAnyBook.get(i)); 
      out.println(GoodAnyBook.get(i));
    }
    if(choice == 133)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(GoodAnyTV.get(i)); 
      out.println(GoodAnyTV.get(i));
    }
    if(choice == 134)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(GoodAnyBible.get(i));
      out.println(GoodAnyBible.get(i));
    }
    if(choice == 135)
    {
      int i = (int) (Math.random() * 32) + 1;
      System.out.println(GoodAnyAny.get(i));  
      out.println(GoodAnyAny.get(i));
    }
    if(choice == 211)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilMaleMovie.get(i));               
    }
    if(choice == 212)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilMaleBook.get(i));               
    }
    if(choice == 213)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilMaleTV.get(i));               
    }
    if(choice == 214)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilMaleBible.get(i));               
    }
    if(choice == 215)
    {
      int i = (int) (Math.random() * 16) + 1;
      System.out.println(EvilMaleAny.get(i));               
    }
    if(choice == 221)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilFemaleMovie.get(i));               
    }
    if(choice == 222)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilFemaleBook.get(i));               
    }
    if(choice == 223)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilFemaleTV.get(i));               
    }
    if(choice == 224)
    {
      int i = (int) (Math.random() * 4) + 1;
      System.out.println(EvilFemaleBible.get(i));               
    }
    if(choice == 225)
    {
      int i = (int) (Math.random() * 16) + 1;
      System.out.println(EvilFemaleAny.get(i));               
    }
    if(choice == 231)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(EvilAnyMovie.get(i));               
    }
    if(choice == 232)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(EvilAnyBook.get(i)); 
      out.print(EvilAnyBook.get(i));
    }
    if(choice == 233)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(EvilAnyTV.get(i));               
    }
    if(choice == 234)
    {
      int i = (int) (Math.random() * 8) + 1;
      System.out.println(EvilAnyBible.get(i));               
    }if(choice == 235)
    {
      int i = (int) (Math.random() * 32) + 1;
      System.out.println(EvilAnyAny.get(i));               
    }        
    
  }
  /**
  *Function to scan in an int as "choice".
  *
  */
  public static int readinput()
  {
    Scanner in = new Scanner(System.in);
    int choices = in.nextInt();
    return choices;
  }
    
  
}


/*Two extra features I could have added are:
I could have added an input verification to make sure that the users don't input anything that the code won't take.
I could have added one big array with smaller arrays inside of it to hold my name lists so that I could use strings as input category choices


I incorporated a way to write the output to a file by creating a user named output file and writing the output in my "if statements" to the output file.
I incorporated a method to read the users input by setting the int "choices" to the method (readinput) and inside the method was a standard "int = nextinput".
*/