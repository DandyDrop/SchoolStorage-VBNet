import java.util.Scanner;
import unit4.collectionsLib.*;
class s3011 {
    public static void HouseOfShaws(Stack<Integer> i){
        Stack<Integer> temp = new Stack<Integer>();
        while(!i.isEmpty()){
            int x = i.pop();
            if (x%2 == 0 || !(x%5 == 0)) temp.push(x);
        }
    }
    
}
