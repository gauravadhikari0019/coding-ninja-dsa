public class Solution {

	public static int numConnected(int[][] edges, int n) {
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
        boolean[] visited=new boolean[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                dfs(edges, i, visited, n);
                count++;
            }
        }
        return count;
	}
    private static void dfs(int[][]edges, int v1, boolean[] visited, int n){
        visited[v1]=true;
        
        for(int i=0; i<n; i++){
            if(visited[i] == false && edges[v1][i] == 1){
                dfs(edges, i, visited, n);
            }
        }
    }
}
