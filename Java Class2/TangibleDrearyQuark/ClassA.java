public class ClassA 
{
          public String name;
        public int age;
  protected double passingWeight = 0;
    // fields declaration 
          public ClassA(String name, int age) {
            this.name= name;
            this.age = age;
        }
        
  public String toString(){
        return name+","+age;
      }

}