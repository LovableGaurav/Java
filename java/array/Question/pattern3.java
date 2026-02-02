package Question;

public class pattern3 {
    public void main(String[] args){
//        String [] arr ={"a","b","c","d","e","f"};
        char  arr = 'a';
        int n = 26;
//        int n = arr.length;
        int l =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(arr);
                arr++;
            }
            System.out.println(" ");
        }
    }
}
