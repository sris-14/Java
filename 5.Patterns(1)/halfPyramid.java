public class halfPyramid {
    public static void main(String args[]){
// 1.
        
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        /* Qs -->
        output :
        1234
        234
        34
        4
        */ 
// 2.
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        /*
        output :
            1
            12
            123
            1234
        */ 
        
// 3.
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        /*
        output :
             1
             22
             333
             4444
        */ 
// // 4.   inverted & rotated half-pyramid:
        for(int i=1;i<=4;i++){
            for(int j=i;j<=3;j++){                
                System.out.print(" ");
            }
            for(int j=5-i;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        /*
        output :
              *
             ** 
            *** 
           ****  
        */ 

// 5. Solid Rhombus:
        for(int i=1;i<=4;i++){
            for(int j=i;j<=3;j++){                
                System.out.print(" ");
            }
            for(int j=5-i;j<=4;j++){
                System.out.print("*");
            }
            for(int j=i;j<=4;j++){
              System.out.print("*");
            }
            System.out.println();
        }  

        /*
        output :
               *****
              *****
             *****
            *****
        */ 

//6.  
        for(int i=1;i<=4;i++){
           for(int j=i;j<=3;j++){                
            System.out.print(" ");
           }
           for(int j=5-i;j<=4;j++){
            System.out.print("*");
           } 
           for(int j=1;j<=i+1;j++){
            System.out.print("*");
           }
           System.out.println();
        }
        /* output :
                   ***
                  *****
                 *******
                *********
        */ 

// 7.
        for(int i=1;i<=4;i++){
            for(int j=i;j<=3;j++){                
                System.out.print(" ");
            }
            for(int j=5-i;j<=4;j++){
                System.out.print(i);
            }
            for(int j=i;j<=4;j++){
              System.out.print(i);
            }
            System.out.println();
        }   
            /*
            output :
                     11111
                    22222
                   33333
                  44444
            */  
// 8.
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        output :
                    *
                   ***
                  *****
                 *******
                *********
        */ 
    }
}
