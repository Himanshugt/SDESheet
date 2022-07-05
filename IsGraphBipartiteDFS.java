class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean vis[]=new boolean[n];
        boolean temp[]=new boolean[n];
        for(int i=0;i<n;++i)
            adj.add(new ArrayList<Integer>());
        
        for(int i=0;i<n;++i){
            for(int j=0;j<graph[i].length;++j)
                adj.get(i).add(graph[i][j]);
        }
        
        for(int i=0;i<n;++i){
            if(!vis[i]){
                if(!checkbipartitedfs(i,true,temp,vis,adj)){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
    
    
    boolean checkbipartitedfs(int node, boolean check,boolean[] temp, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        if(check){
            temp[node]=true;
        }
        
        for(int it:adj.get(node)){
            if(!vis[it]){
                if(!checkbipartitedfs(it,!check,temp,vis,adj)){
                    return false;
                }
            }
            else{
                if(!check!=temp[it]){
                    return false;
                }
            }
        }
        
        return true;
    }
}