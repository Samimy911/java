

public class Array2DprintSo12 {
    public static void print2D(int mat[][]){
        
        
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++)
                System.out.print(mat[i][j]+ "");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int mat[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};
        
        
        
        print2D(mat);
                
            
        }
    }

