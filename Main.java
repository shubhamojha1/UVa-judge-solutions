import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--!=0){
            System.out.println();
           int columns = sc.nextInt();
           int check=0, checkprev;
           boolean flag=true;
           for(int i=1;i<=columns;i++){
               checkprev = check;
               int y1 = sc.nextInt();
               int y2 = sc.nextInt();
               check = Math.abs(y2-y1)+1;
               if(checkprev!=check && i>1){
                   flag=false;
                //    break;
               }
           }
           if(flag)
           System.out.println("yes");
           else
           System.out.println("no");
        }
    }
}
