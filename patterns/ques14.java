public class ques14{
    public static void main(String args[]){
        
        for(int i = 1; i<= 5; i++){
            if( i % 2 == 1){
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
            }else{
                    for(int j = 0; j < i; j++){
                        System.out.print((char)('A' + j ) + " ");
                    }
                   
                }
                 System.out.println();
            }
        }
    }

            

           
                

          