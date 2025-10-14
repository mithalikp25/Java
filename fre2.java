import java.util.Arrays;

public class fre2 {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,1};
        boolean[] vis = new boolean[arr.length];
        Arrays.fill(vis, false);
        
        for(int i=0;i<arr.length;i++){
            if(vis[i]==false){
                vis[i]=true;
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        vis[j]=true;
                    }
                }
             System.out.println(arr[i]+"->"+count);
            }
        }
    }
}

// output:
// 2->2
// 3->2
// 4->1
// 1->1