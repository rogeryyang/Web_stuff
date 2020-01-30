import java.util.*;


public class Sample_String{
  public static void main(String args[]){
    //String Concatenation
    String str1 = "Rock";
    String str2 = "Star";
    //Method 1 : Using concat
    String str3 = str1.concat(str2);
    System.out.println(str3);
    //Method 2 : Using "+" operator
    String str4 = str1 + str2;
    System.out.println(str4);
    String str_Sample = "RockStar";
    //Length of a String
    System.out.println("Length of String: " + str_Sample.length());
    System.out.println("Character at position 5: " + str_Sample.charAt(5));
    //Index of a given character
    System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
    System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
    //Compare to - Ignore case
    System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
    System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
    System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
    System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
    System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
    //Convert to UpperCase
    System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());

    str_Sample = "This is Index of Example";
    //Character at position
    System.out.println("Index of character 'x': " + str_Sample.indexOf('x'));
    //Character at position after given index value
    System.out.println("Index of character 's' after 3 index: " + str_Sample.indexOf('s', 2));
    //Give index position for the given substring
    System.out.println("Index of substring 'is': " + str_Sample.indexOf("is"));
    //Give index position for the given substring and start index
    System.out.println("Index of substring 'is' form index:" + str_Sample.indexOf("is", 4));
    System.out.println("--------------------");
    String s1 = "This is String CharAt Method";
    //returns the char value at the 0 index
    System.out.println("Character at 0 position is: " + s1.charAt(0));
    //returns the char value at the 5th index
    System.out.println("Character at 5th position is: " + s1.charAt(5));
    //returns the char value at the 22nd index
    System.out.println("Character at 22nd position is: " + s1.charAt(22));
    //returns the char value at the 23th index
/*     char result = s1.charAt(-1);
    System.out.println("Character at 23th position is: " + result); */
    
    System.out.println("\n");
    System.out.println("--------------------");
    System.out.println("Java String replace(), replaceFirst() & replaceAll() Method EXAMPLES");
    System.out.println("--------------------");
    System.out.println("Example 1");
    String S1 = new String("the quick fox jumped");
    System.out.println("Original String is ': " + S1);
    System.out.println("String after replacing 'fox' with 'dog': " + S1.replace("fox", "dog"));
    System.out.println("String after replacing all 't' with 'a': " + S1.replace('t', 'a'));
    System.out.println("\n");
    
    //personal notes: replace seems functionally identical to replaceAll

    System.out.println("Example 2");
    String str = "Guru99 is a site providing free tutorials";
    //remove white spaces
    str2 = str.replaceAll("\\s", "");
    //str2 = str.replaceAll("t", "-");
    System.out.println(str2);
    System.out.println("\n");

    System.out.println("Example 3");
    str = "This website providing free tutorials";
    //Only Replace first 's' with '9' 
    str1 = str.replaceFirst("s", "9");
    System.out.println(str1);
    System.out.println("\n");

    System.out.println("--------------------");
    System.out.println("Java String toLowercase() and toUpperCase() Methods");
    System.out.println("--------------------");
    System.out.println("Example 1");
    S1 = new String("UPPERCASE CONVERTED TO LOWERCASE");
    //Convert to LowerCase
    System.out.println(S1.toLowerCase());
    System.out.println("\n");

    S1 = new String("lowercase converted to uppercase");
    //Convert to UpperCase
    System.out.println(S1.toUpperCase());
    System.out.println("\n");

    System.out.println("--------------------");
    System.out.println("How to easily Convert String to Integer in JAVA");
    System.out.println("--------------------");
    String strTest = "100";
    int iTest = Integer.parseInt(strTest);
    System.out.println("Actual String:"+ strTest);
    System.out.println("Converted to Int:" + iTest);
    //This will now show some arithmetic operation
    System.out.println("Arithmetic Operation on Int: " + (iTest/4));
    System.out.println("\n");

    //Convert the String to Integer using Integer.valueOf
    iTest = Integer.valueOf(strTest);
    System.out.println("Actual String:"+ strTest);
    System.out.println("Converted to Int:" + iTest);
    //This will now show some arithmetic operation
    System.out.println("Arithmetic Operation on Int:" + (iTest/4));
    System.out.println("\n");

    System.out.println("--------------------");
    System.out.println("HashMaps");
    System.out.println("--------------------");
    Map<String, String> objMap = new HashMap<String, String>();
    objMap.put("Name", "Suzuki");
    objMap.put("Power", "220");
    objMap.put("Type", "2-wheeler");
    objMap.put("Price", "85000");
    System.out.println("Elements of the Map:");
    System.out.println(objMap);
    // ***remove doesn't work by array number. need to use the hash key.***
    //"The method takes one parameter *KEY* whose mapping is to be removed from the Table."
    objMap.remove("Power");         
    System.out.println("After Remove:");
    System.out.println(objMap);
    System.out.println("\n");



    // create and populate hash map  
   HashMap<Integer, String> map = new HashMap<Integer, String>();           
   map.put(1,"Java");  
   map.put(2, "Python");  
   map.put(3, "PHP");  
   map.put(4, "SQL");
   map.put(5, "C++");
   System.out.println("Tutorial in Guru99: "+ map);    
   // Remove value of key 5
   map.remove(5);  
   System.out.println("Tutorial in Guru99 After Remove: "+ map);

  }
} 