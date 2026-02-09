package array;

public class jagged2Darray {
    public static void main (String[] args){
        int [][] jagged = new int[3][];

        jagged[0] =new int [5];
        jagged[1] = new int [3];
        jagged[2] = new int [4];

        for (int i =0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
