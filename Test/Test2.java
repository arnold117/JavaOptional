// /**
//  * Test2
//  */
// public class Test2 {

//     public static void main(String[] args) {
        // int x= 2, y = 3;
        // System.out.println((y-x==1)?(!true?1:2):(false?3:4));

        // int result; 

        // int a = 17, b = 6; 
      
        // result = (a % b > 4)? a % b : a / b ;
      
        // System.out.println(result); 

//         outer: for( int i =1; i<3 ;i++) {
//             inner : for (int j= 1;j<3;j++) {

//                 if (j==2) continue outer;
//                 System.out.println("i= " + i + ",j = " + j);

//             }
            
//         }

//     }     
    
// }

// class Loop{

//     public static void main(String[ ] args) {

//         int x=0;int y=0;

//        outer: for(x=0;x<100;x++){

//        middle: for(y=0;y<100;y++){

//                         System.out.println("x="+x+"; y="+y);

//                         if (y==10) { break outer; }

//                     }

//                  }

//    }

// }

// class test {

//     public static void main(String args[]) { 
  
//         int i = 1;
  
//         do {
  
//              i--;
  
//         } while (i > 2);
  
//         System.out.print(i);
  
//     }
  
//   }

//   class N7 {
//       public static void main(String[] args) {
//         int x = 23659;

//         String m = "result=";
        
//         while (x>0) {
        
//         m = m + x%10;
        
//         x = x/10;
        
//         }
        
//         System.out.print(m);
//       }
//   }

//   class N8 {
//       public static void main(String[] args) {
//         int i = 10, j = 10;

//         boolean b = false;
      
//         if ( b = i == j)
      
//            System.out.print("True");
      
//        else
      
//           System.out.print("False");
      
      
//       }
//   }

/**
 * Test2
 */
public class Test2 {

    public static void main(String[] args) {
        int x= 2, y = 3;
        System.out.println((y-x==1)?(!true?1:2):(false?3:4));
    }    
}

class Test {

    public static void main(String args[ ]) { 
  
         int i=0, j=2;
  
         do {
  
             ++i;
  
             j--;
  
         } while(j>0);
  
         System.out.println(i);
  
    }
  
  }

  class Ex2{

    public static void main(String args[ ]) {

          int k ,f=1;

          for (k=2;k<5;k++)

                f = f * k;

          System.out.println(k); 

    }

}

class N4 {
    public static void main(String args[]) { 

        int i = 1;
  
        do {
  
             i--;
  
        } while (i > 2);
  
        System.out.print(i);
    }
}

class N5 {
    public static void main(String[] args) {
        outer: for( int i =1; i<3 ;i++) {

            inner : for ( int j= 1;j<3;j++) {
           
                         if (j==2) continue outer;
           
                        System.out.println("i= " + i + ",j = " + j); 
           
                   }
           
             }      
    }
}

class N6 {
    public static void main(String[] args) {
        String c="red";

        switch (c) {

        default:  System.out.print("white");

                    break;

        case "red":  System.out.print("red");

                    break;

            case "blue":  System.out.print("blue");

}


    }
}

class N8 {
    public static void main(String[] args) {
        int i = 10,j = 10;

        boolean b = false;
      
        if ( b = i == j)
      
           System.out.print("True");
      
       else
      
          System.out.print("False");
    }
}