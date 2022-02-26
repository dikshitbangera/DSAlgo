package LinearDS;

import java.util.ArrayList;
import java.util.Stack;

public class GraphSearchDFS {
	
	int V;
	ArrayList<Integer> adj[];
	
	GraphSearchDFS(int noofvertex){
		V=noofvertex;
		adj=new ArrayList[noofvertex];
		for(int i=0;i<noofvertex;i++) {
			adj[i]=new ArrayList<>();
		}
	}
	
	void edge(int x,int y) {
		adj[x].add(y);
	}
	
	void depthfirstsearch(int sourcevertex) {
		boolean[] visited=new boolean[V];
		//visited[sourcevertex]=true;
		Stack<Integer> s1=new Stack<>();
		int node;
		s1.push(sourcevertex);
		while(!s1.isEmpty()) {
			sourcevertex=s1.peek();
			s1.pop();
		
		
		for(int i=0;i<adj[sourcevertex].size();i++) {
			node=adj[sourcevertex].get(i);
			if(!visited[node]) {
				s1.push(node);
			}
		}
		
		if(visited[sourcevertex]==false) {
			System.out.print(sourcevertex+" ");
			visited[sourcevertex]=true;
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphSearchDFS gs=new GraphSearchDFS(6);
		gs.edge(0, 1);
		gs.edge(0, 2);
		gs.edge(0, 3);
		gs.edge(0, 4);
		gs.edge(1, 0);
		gs.edge(2, 0);
		gs.edge(3, 0);
		gs.edge(3, 5);
		gs.edge(4, 0);
		gs.edge(4, 5);
		gs.edge(5, 4);
		gs.edge(5, 3);
		
		gs.depthfirstsearch(0);

	}

}
