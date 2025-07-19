class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<numCourses;i++) g.add(new ArrayList<>());
        int[] in=new int[numCourses],res=new int[numCourses];
        for(int[] p:prerequisites){
            g.get(p[i]).add(p[0]);
            in[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++) if(in[i]==0) q.add(i);
        int i=0;
        while(!q.isEmpty()){
          int curr=q.poll();
          res[i++]=curr;
          for(int nei:g.get(curr)) if(--in[nei]==0) q.add(nei);
        }
        return i==numCourses?res:new int[0];
    }
}