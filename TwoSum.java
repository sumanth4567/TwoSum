import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the values into array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        int answer[]=new int[2];
        answer=ts.twoSum(a, target);
        System.out.println("The indexes at which the added values are equal to target are:");
        for(int i=0;i<2;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
