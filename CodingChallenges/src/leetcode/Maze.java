package leetcode;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze maze = new Maze();
		int[][] mazeMatrix = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
		int[] start = {0,4};
		int[] destination = {4,4};
		
		System.out.println(maze.hasPath(mazeMatrix, start, destination));
	}
	
	public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if(start[0]==destination[0] && start[1]==destination[1]) return true;
        
        if( isValidMove(start, maze)) {
            //goDown
        	System.out.println("start: " + start[0] + " - " + start[1]);
        	System.out.println("Trying down");
            if(hasPath(maze, new int[]{start[0]+1, start[1]}, destination)) return true;
            //goLeft
            System.out.println("Trying left");
            if(hasPath(maze, new int[]{start[0], start[1]-1}, destination)) return true;
            //goRight
            System.out.println("Trying right");
            if(hasPath(maze, new int[]{start[0], start[1]+1}, destination)) return true;
            //goUp
            System.out.println("Trying up");
            System.out.println("Setting to 1 : " + start[0] + " - " + start[1] );
            maze[start[0]][start[1]] = 1;
            if(hasPath(maze, new int[]{start[0]-1, start[1]}, destination)) return true;
            
            return false;
        }
        return false;
    }
    
    public boolean isValidMove(int[] l, int[][] maze) {
        if (l[0] >=0 && l[1] >= 0 && l[0] < maze.length && l[1] < maze[0].length && maze[l[0]][l[1]] == 0 )
            return true;
        return false;
    }

}
