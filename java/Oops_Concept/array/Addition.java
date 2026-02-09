package array;

public class Addition {
    public static void main (String[] args){
        int [][] MatA={
                {2,4,7},
                {32,6,0}
        };
        int [][] matb ={
                {23,90,7},
                {23,344,728}
        };
        addTwoMatrices(matb ,MatA);

    }
    private static void addTwoMatrices(int [][] matb ,int [][] MatA){
        int rowsA = MatA.length;
        int rowsB = matb.length;

        int ColumnA = MatA[0].length;
        int ColumnB = matb[0].length;

        if(( rowsA == rowsB) && (ColumnA == ColumnB)) {
            int [][]result = new  int [rowsA][ColumnA];
            for (int i =0;i<rowsA;i++){
                for (int j=0;j<ColumnB;j++){
                    result[i][j]=MatA[i][j]+matb[i][j];
                    System.out.print(result[i][j] + " ");
                }
            System.out.println();
            }
        }
    }
}
