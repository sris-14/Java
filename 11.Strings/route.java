public class route {

    public static float shortestPath(String route){
        int x = 0, y = 0;
        for(int i =0; i< route.length(); i++){
            char dir = route.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            else if(dir =='N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            } else {
                x++;
            }
        } 
        int X2 = x*x;
        int Y2 = y*y;  
        return (float)(Math.sqrt(X2+Y2));
     }
    public static void main(String args[]){
        String route = "WNEENESENNN";
        System.out.print(shortestPath(route));
    }
}
