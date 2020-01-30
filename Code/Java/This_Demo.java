class This_Demo{
  int a = 50;
  int b = 40;

  public void setData(int a, int b){
    this.a = a;
    this.b = b;
  }

  public void showData(){
    System.out.println("Value of A = " + a);
    System.out.println("Value of B = " + b);
  }

  public static void main(String args[]){
    This_Demo obj = new This_Demo();
    obj.setData(2,3);
    obj.showData();
  }
  
}