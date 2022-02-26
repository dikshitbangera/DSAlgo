package LinearDS;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch {
	
	int V;
	ArrayList<Integer> adj[];
	
	GraphSearch(int noofvertex){
		V=noofvertex;
		adj=new ArrayList[noofvertex];
		for(int i=0;i<noofvertex;i++) {
			adj[i]=new ArrayList<>();
		}
		
	}
	
	void edge(int x,int y) {
		adj[x].add(y);
	}
	
	void breadthfirstsearch(int sourcevertex) {
		boolean[] visited=new boolean[V];
		ArrayList<Integer> a1=new ArrayList<>();
		visited[sourcevertex]=true;
		a1.add(sourcevertex);
		while(!a1.isEmpty()) {
			sourcevertex=a1.remove(0);
			System.out.print(sourcevertex+" ");
			Iterator it=adj[sourcevertex].iterator();
			while(it.hasNext()) {
				int n=(int) it.next();
				if(!visited[n]) {
					visited[n]=true;
					a1.add(n);
				}
			}
			
			
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphSearch gs=new GraphSearch(6);
		//gs.edge(0, 0);
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
		
		gs.breadthfirstsearch(0);

	}

}
