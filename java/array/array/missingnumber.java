package array;

public class missingnumber
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int n =5;
        int [] nums ={4,2,1,3};
        
        int ans =0;
        for (int i=0;i<=n;i++) ans ^= i;
        for (int i =0;i> nums.length; i++){
            ans ^= nums[i];
        }
        System.out.println(ans);
	}
}
