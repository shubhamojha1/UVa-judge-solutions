import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int t =sc.nextInt();

       while(t--!=0){
           int a = sc.nextInt();
           int b = sc.nextInt();
           System.out.println(a>b ? ">": a<b?"<":"=");
       }
    }
}
       
//        int n =sc.nextInt();
//        while(n--!=0){
//         String s = sc.nextLine();
//         if(checkBalanced(s))
//         System.out.println("YES");
//         else
//         System.out.println("NO");
//        }
//     }

//     public static boolean checkBalanced(String s){

//         Stack<Character> stack = new Stack<Character>();
//         for(int i=0;i<s.length();i++){
//             char c = s.charAt(i);
//             if(c=='{')
//             stack.push('}');
//             else if(c=='[')
//             stack.push(']');
//             else if(c=='(')
//             stack.push(')');
//             else if(stack.isEmpty()||stack.pop()!=c)
//             return false;
//             // else if(c=='}'){
//             //     if(!stack.empty() && stack.peek() == c)
//             //     stack.pop();
//             //     else return false;
//             // }
//             // else if(!stack.empty() && c==']'){
//             //     if(stack.peek() == c)
//             //     stack.pop();
//             //     else return false;
//             // }
//             // else if(!stack.empty() && c==')'){
//             //     if(stack.peek()== c)
//             //     stack.pop();
//             //     else return false;
//             // }
//             // System.out.println(stack);
//         }
//         return stack.empty();
//     }
// }
//     //    int n = sc.nextInt();
//     //    int arr[] = new int[n];
//     //    for(int i=0;i<n;i++)
//     //    arr[i]=sc.nextInt();

//     //    int pos = 0;int sum=0;
//     //    while(pos!=arr.length-1){
//     //        if(arr[pos+1]==1)
//     //        pos+=2;
//     //        else if(pos+2 < arr.length && arr[pos+2]!=1)
//     //        pos+=2;
//     //        else 
//     //        pos+=1;
           
//     //        //System.out.println(pos);
//     //        sum++;
//     //    }
//     //    System.out.println(sum);
// //     }
// // }

// //     // public static List<Integer> sequentialDigits(int low, int high) {
        
// //     //     ArrayList<Integer> arr = new ArrayList<Integer>();
// //     //     int lowDigits = (int)Math.log10(low)+1;
// //     //     System.out.println(lowDigits);
// //     //     // while(true){
// //     //         while(low<=high){
//     //             int zeros = (int)Math.log10(low);
//     //             int ans = (int)(low/Math.pow(10,zeros));
//     //             break;
//     //         }
            
//     //     // }
//     //     return null;
        
//     // }
// // }
//     //     int arr[] = {8,1,2,2,3};
//     //     System.out.println("--"+xorOperation(4,3));
//     // // }

//     // // public static int xorOperation(int n, int start) {
        
        

//     // // // public static int[] smallerNumbersThanCurrent(int[] nums) {
        
//     // // //     HashMap<Integer, Integer> map = new HashMap<>();
//     // // //     //map.putIfAbsent(key, value)
//     // // //     for(int i=0;i<nums.length;i++){
//     // // //         int n = nums[i];
//     // //         if(map.containsKey(n)){
//     //             map.put(n,map.get(n)+1);
//     //         }
//     //         else{
//     //             map.put(n,1);
//     //         }
            
//     //     }
//     //     System.out.println(map);
//     //     return null;
         
//     //  }

//     // public static boolean isPowerOfTwo(int n) {
//     //     // System.out.println(Math.log10(n));
//     //     // System.out.println(Math.log10(2));
//     //     // System.out.println(Math.log10(n)/Math.log10(2));
//     //     // System.out.println(Math.log10(n)%Math.log10(2));
//     //     double n1 = Math.log(n)/Math.log(2);
//     //     double n2 = Math.log(2)/Math.log(2);
//     //     System.out.println(n1);
//     //     //System.out.println(n2);
//     //     System.out.println((int)(n1%n2));
//     //     return (Math.log(n)/Math.log(2))%1==0;

        
//     // }
// // }
