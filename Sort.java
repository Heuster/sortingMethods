
/**
 * Write a description of class Sort here.
 *
 * @author Danny Heu
 * @version 1.25.2018
 */
public class Sort
{
    int [] num = {7,5,1,2,4,8};
    
    
    public void bubbleSort(){
        
        for (int i = 0; i < num.length-1; i++){
            if (num[i] > num[i+1]){
                int temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
            
        }
    }
    
    public void insertSort(){
        
    }
    
    public void selectSort(){
        
    }
    
    public Sort(){
        boolean check = false;
        while (check == false){
            bubbleSort();
            for (int x = 0; x < num.length-1 ;x++){
                if (num[x] <= num[x+1]){
                    check = true;
                }
            }
            
        }
        
    }
}
