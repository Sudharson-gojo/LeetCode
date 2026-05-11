class Solution {
    public int[] asteroidCollision(int[] a) {
        int l = a.length;
        Stack<Integer> sb  = new Stack<>();
        for(int i = 0;i<l;i++){
            if(a[i]>0)sb.push(a[i]);
            else{
            while(!sb.isEmpty() &&  sb.peek() >0 && sb.peek()< Math.abs(a[i])){
                sb.pop();
            }
            if( !sb.isEmpty() && sb.peek() == Math.abs(a[i])){
                sb.pop();
            }else if((sb.isEmpty()) || sb.peek()<0){
                sb.push(a[i]);
            }
            }
        }
        int s =  sb.size();
        int[] b = new int[s];
        for(int i = s-1;i>=0;i--){
            b[i] = sb.peek();
            sb.pop();
        }
        return b;
    }
}