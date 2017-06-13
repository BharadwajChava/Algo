import java.util.*;
public class Solution {

   public static class Point{
        public int x;
        public int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    } 
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        int n = in.nextInt();
        Map<String, Point> m = new HashMap<String, Point>();
        Point[] pt = new Point[n];
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            pt[i] = new Point(x, y);
            String s = x+"@"+y;
            Point p = new Point(x, y);
            if(!m.containsKey(s))
                m.put(s, p);
        }
        int c = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int x = pt[j].y - pt[i].y;
                int y = pt[i].x - pt[j].x;
                String s1 = (pt[i].x + x) + "@" + (pt[i].y + y);
                String s2 = (pt[j].x + x) + "@" + (pt[j].y + y);
                String s3 = (pt[i].x - x) + "@" + (pt[i].y - y);
                String s4 = (pt[j].x - x) + "@" + (pt[j].y - y);
                if((m.containsKey(s1)&&m.containsKey(s2)) || (m.containsKey(s3)&&m.containsKey(s4))){
                    c+=1;
                }
            }
        }
        System.out.println(c/4);
    }
}
