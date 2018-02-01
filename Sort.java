
/**
 * Write a description of class Sort here.
 *
 * @author Danny Heu
 * @version 1.25.2018
 */
public class Sort
{
    int [] num = {7,5,10,2,4,8};
    boolean check = false;
    
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
        for (int i = 1; i < num.length-1; i++){
            for (int index = i-1; index >= 0; index--){
                if (num[index] > num[i]){
                    int temp = num[index];
                    num[index] = num[i];
                    num[i] = temp;
                }
            }
        }
    }
    
    public void selectSort(){
        for (int i = 0; i < num.length-1; i++){
            for (int index = 1; index < num.length-1; index++){
                if (num[index] < num[i]){
                    int minIdx = num[i];
                    num[index] = num[i+1];
     
                }
                
            }
        }
    }
    
    public boolean checkList(){
        check = true;
        for (int i = 0; i < num.length-1; i++){
            if (num[i] >= num[i+1]){
                check = false;
            }
    
        }
        return check;
    }
    
    public Sort(){
        while (check == false){
            bubbleSort();
            insertSort();
            selectSort();
            if (checkList()){
                check = true;
            }
        }
        
    }
}
