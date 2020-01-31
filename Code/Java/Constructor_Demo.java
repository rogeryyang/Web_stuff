class Constructor_Demo{
  int  value1;
  int  value2;
  Constructor_Demo(){
     value1 = 10;
     value2 = 20;
     System.out.println("Inside Constructor");
 }

 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}

public static void main(String args[]){
  Constructor_Demo d1 = new Constructor_Demo();
  d1.display();
  }
}


class Constructor_Overloading_Demo{
    int  value1;
    int  value2;
    Constructor_Overloading_Demo(){
     value1 = 10;
     value2 = 20;
     System.out.println("Inside 1st Constructor");
   }
   Constructor_Overloading_Demo(int a){
    value1 = a;
    System.out.println("Inside 2nd Constructor");
  }
  Constructor_Overloading_Demo(int a,int b){
  value1 = a;
  value2 = b;
  System.out.println("Inside 3rd Constructor");
 }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}

public static void main(String args[]){
  Constructor_Overloading_Demo d1 = new Constructor_Overloading_Demo(); //this will trigger the first constructor because no args are specified | if the first constructor is commented out, this results in an error because no constructors accept zero args
  Constructor_Overloading_Demo d2 = new Constructor_Overloading_Demo(30); //this will trigger the second constructor because one arg is specified
  Constructor_Overloading_Demo d3 = new Constructor_Overloading_Demo(30,40); //this will trigger the third constructor because 2 args are specified
  //Constructor_Overloading_Demo d4 = new Constructor_Overloading_Demo(1,2,3); //this will error out because no constructors accept 3 args
  d1.display();
  d2.display();
  d3.display();
  //d4.display();
}
}

class Constructor_Chaining_Demo{
  int  value1;
  int  value2;
  Constructor_Chaining_Demo(){
     value1 = 1;
     value2 = 2;
     System.out.println("Inside 1st Parent Constructor");
  }
  Constructor_Chaining_Demo(int a){
     value1 = a;
     System.out.println("Inside 2nd Parent Constructor");
  }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
 }
 public static void main(String args[]){
    DemoChild d1 = new DemoChild();
    d1.display();
 }
}
class DemoChild extends Constructor_Chaining_Demo{
   int value3;
   int value4;
   DemoChild(){
   super(5);
    value3 = 3;
    value4 = 4;
   System.out.println("Inside the Constructor of Child");
   }
   public void display(){
     System.out.println("Value1 === "+value1);
     System.out.println("Value2 === "+value2);
     System.out.println("Value1 === "+value3);
     System.out.println("Value2 === "+value4);
  }
}