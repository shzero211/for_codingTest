package kakao_tech_internship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두큐연관문제_백준2003_수들의합2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int[] arr=new int[m];
        int start=0;
        int end=0;
            int cnt=0;
        st=new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int sum=arr[0];
        while(true){
         try{
             if(sum>n){
                 sum-=arr[start++];
             }else if(sum<n){
                 sum+=arr[++end];
             }else if(sum==n){
                 System.out.println(start+","+end);
                 cnt++;
                 sum=sum-arr[start++]+arr[++end];
             }
         }catch (Exception e){
             break;
         }
        }
        System.out.println(cnt);
    }
}
