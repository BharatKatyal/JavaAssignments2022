// import java.util.*;
// class Main {
//   public static void main(String[] args) {
//     String [] cars = {"Mercedes","BMW","Audi","Lamborgini","Honda"};
//     List<String> currentcarsingarage = new ArrayList<String>();

//     // add array items to list
//     for(String x: cars){
//       currentcarsingarage.add(x);
//     }

//     String[] carsleaving = {"Hondo","BMW"};
//         List<String> carsingarage = new ArrayList<String>();
//     // add array items to list
//     for(String y: carsleaving){
//       carsingarage.add(y);
//     }

// for(int i =0;i<carsingarage.size(); i++)
//       System.out.printf("%s ", carsingarage.get(i));


//     editlist(carsingarage,carsingarage);
//         System.out.println();
// for(int i =0;i<carsingarage.size(); i++)
//       System.out.printf("%s ", carsingarage.get(i));
    
//   }

//   public static void editlist(Collection<String> l1, Collection<String> l2){
//      Iterator<String> it = l1.iterator();
// while(it.hasNext()){
//   if(l2.contains(it.next()))
//     it.remove();
// }
//   }
 
  
// }







// import java.util.*;
// class Main {
//   public static void main(String[] args) {

//     String[] cars = {"Mercedes","Audi","BMW","Lamborghini","Ferrari"};
//     List<String> list1 = new LinkedList<String>();
//         for(String x : cars)
//     list1.add(x);

//     String[] newcars = {"Honda", "Audi", "Lexus","Toyota"};
//     List<String> list2 = new LinkedList<String>();
//     for(String y : newcars)
//       list2.add(y);

//     list1.addAll(list2);
//     list2 = null;

//     printInventory(list1);
//     removeInventory(list1, 2,5);
//     printInventory(list1);
//     newestToOldestInventory(list1);
    
//   }
//   //printInventory method
//   private static void printInventory(List<String> l){
//     for (String b: l)
//       System.out.printf("%s ", b);
//           System.out.println();

//   } 
//   // remove stuff method
//   private static void removeInventory(List<String> l,int from, int to){
//     l.subList(from,to).clear();
//   }
//   private static void newestToOldestInventory(List<String> l){
//     ListIterator<String> sortCars = l.listIterator(l.size());
//     while(sortCars.hasPrevious())
//             System.out.printf("%s ", sortCars.previous());

//   }
  
// }



// Stack


// import java.util.*;
// class Main {
//   public static void main(String[] args) {
//     Stack<String> serviceBay = new Stack<String>();
//     serviceBay.push("Ferrari");
//     printStack(serviceBay);
//        serviceBay.push("Lamborgini");
//     printStack(serviceBay);
//        serviceBay.push("Hondo");
//     printStack(serviceBay);
//     serviceBay.pop();
//     printStack(serviceBay);
//     serviceBay.pop();
//     printStack(serviceBay);
//     serviceBay.pop();
//     printStack(serviceBay);

    
//     // System.out.printf("%s\n", l1);
    
//   }  
//   private static void printStack(Stack<String> s){
//     if(s.isEmpty())
//           System.out.println("You have nothing in your stack");
//     else
//           System.out.printf("%s TOP\n", s);

//   }

// }






//Queue

// import java.util.*;
// class Main {
//   public static void main(String[] args) {
//     PriorityQueue<String> serviceQueue =  new PriorityQueue<String>();
//     serviceQueue.offer("Lamborgini");
//         serviceQueue.offer("Ferrari");
//         serviceQueue.offer("Honda");

//         System.out.printf("%s ", serviceQueue);
//         System.out.println();
//         System.out.printf("%s", serviceQueue.peek());
//             System.out.println();
//     serviceQueue.poll();
//         System.out.printf("%s ", serviceQueue);
//         System.out.println();



    
//     // System.out.printf("%s\n", l1);
    
//   }  


// }


//hashset

import java.util.*;
class Main {
  public static void main(String[] args) {
    String[] cars = {"Ferrari", "Lamborgini", "Honda", "Ferrari", "Toyota", "Honda"};
    List<String> serviceList = Arrays.asList(cars);
        System.out.printf("%s ", serviceList);
            System.out.println();

    Set<String> totalList = new HashSet<String>(serviceList);
            System.out.printf("%s ", totalList);



    // System.out.printf("%s\n", l1);
    
  }  


}