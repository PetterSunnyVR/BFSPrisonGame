package bfsMatrixNxN;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public void bfs(Vertex root) {
		//queue fifo structure - takes into consideration the order of adding
		Queue<Vertex> queue = new LinkedList<>();
		
		//set root (Vertex) to vidited
		root.setVisited(true);
		//add root to the Queue
		queue.add(root);
		
		//if there are more elements in the queue
		while(!queue.isEmpty()) {
			//take first item that was inserted into the Queue (left in the queue), assign it to actualVertex and remove it from Queue.
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex+" ");
			
			//visit all the neighbours/ adjacent vertices
			for(Vertex v : actualVertex.getNeighboutList()) {
				//check if the vertex was visited 
				if(!v.isVisited()) {
					//if not set it to visited
					v.setVisited(true);
					//add the vertex to the queue
					queue.add(v);
				}
			}
		}
		
	}
}
