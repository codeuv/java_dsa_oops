import java.util.ArrayList;
import java.util.List;

public class Main7_2 {
    //only left and right
    static void findPath(int i , int j , int[] dest , String path ){
        if(i == dest[0] && j == dest[1]){
            System.out.println(path);
        }
        else if(i == dest[0]) findPath(i,j+1, dest,path + "R");
        else if(j == dest[1]) findPath(i+1,j, dest,path + "D");
        else {
            findPath(i,j+1, dest,path + "R");
            findPath(i+1,j, dest,path + "D");
        }

    }

    //left right and right
    static void findPathwithDiagonal(int i , int j , int[] dest , String path ){
        if(i == dest[0] && j == dest[1]){
            System.out.println(path);
            return;
        }

        if(j <= dest[1]) findPathwithDiagonal(i,j+1, dest,path + "R");
        if(i <= dest[0])findPathwithDiagonal(i+1,j, dest,path + "D");
        if(i <= dest[0] && j<=dest[0]) findPathwithDiagonal(i+1,j+1, dest,path + "d");

    }

    static void pathWithRestriction(int i , int j ,boolean[][] map, int[] dest , String path){
        if(!(i < map.length) || !(j < map[0].length)) return;
        if( i == dest[0] && j == dest[1]){
            System.out.println(path);
            return;
        }
        if(!map[i][j]) return;
        if( j <= dest[1]) pathWithRestriction(i,j+1,map,dest , path + 'R');
        if( i <= dest[0]) pathWithRestriction(i+1,j,map,dest , path + 'D');
    }

    //backtracking
    static void findPathAllDirection(int i , int j ,boolean[][] map ,int[] dest , String path ){
        if(i < 0 || j < 0 ||  i >= map.length || j >= map[0].length) return ;
        if(i == dest[0] && j == dest[1]){
            System.out.println(path);
            return ;
        }
        //if already visited return
        if(map[i][j])  return;

        //true means visited
        map[i][j] = true;
        if(i != 0 )  findPathAllDirection(i-1,j,map,dest,path+"U") ;
        if(i <= dest[0])  findPathAllDirection(i+1,j,map, dest,path + "D") ;
        if(j != 0)  findPathAllDirection(i,j-1,map,dest,path+"L") ;
        if(j <= dest[1]) findPathAllDirection(i,j+1, map,dest,path + "R");

        map[i][j] = false;


    }

    static void findPathAllDirectionandPrint(int i , int j ,boolean[][] map ,int[] dest , String path ){
        if(i < 0 || j < 0 ||  i >= map.length || j >= map[0].length) return ;
        if(i == dest[0] && j == dest[1]){
            System.out.println(path);
            return ;
        }
        //if already visited return
        if(map[i][j])  return;

        //true means visited
        map[i][j] = true;
        if(i != 0 )  findPathAllDirection(i-1,j,map,dest,path+"U") ;
        if(i <= dest[0])  findPathAllDirection(i+1,j,map, dest,path + "D") ;
        if(j != 0)  findPathAllDirection(i,j-1,map,dest,path+"L") ;
        if(j <= dest[1]) findPathAllDirection(i,j+1, map,dest,path + "R");

        map[i][j] = false;


    }
    static List<String> perumutaionOfstring(String s , String ans){
        List<String> storingAns = new ArrayList<String>();
        if(s.equals("")) {
            storingAns.add(ans);
            return storingAns;
        }
        else {
            for(int i = 0 ; i <= ans.length() ; i++){
                String f = ans.substring(0,i);
                String l = ans.substring(i,ans.length());
                storingAns.addAll(perumutaionOfstring(s.substring(1) ,f+s.charAt(0)+l));
            }
        }
        return storingAns;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        System.out.println(findPathwithDiagonal2(0,0,new int[]{5,5},"").size());
//        pathWithRestriction(0,0,new boolean[][]{
//                {true,true,true},
//                {true,true,true},
//                {false,true,true}
//        },new int[]{2,2},"");

        boolean[][] map = new boolean[3][3];
        findPathAllDirection(0,0,map,new int[]{1,1},"");
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");
//        List<String> ans = perumutaionOfstring("AAB","");
//        System.out.println(ans);
    }
}
