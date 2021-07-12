
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i,j,data_sisip;
        int[] tabInt = {4,16,2,8,26};
    System.out.print("sebelum dilakukan pengurutan insertingsort \n");

        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
        
     
         for(i=1; i<tabInt.length; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
        System.out.print("\n setelah dilakukan pengurutan insertingsort \n");

        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }   
    }
    
}