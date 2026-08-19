public class ques9 {
    public static void main(String args[]){
        for(int i = 0;i < 4; i++){
            char ch = (char)('a' + i);
            if( i % 2 == 1){
                ch = Character.toUpperCase(ch);

            }
            for(int j = 0; j < 4; j++){
                System.out.print(ch);
            }
            System.out.println();

            
        }
    }
}
    

