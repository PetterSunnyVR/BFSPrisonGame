package bfsMatrixNxN;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neighboutList;
	
	public Vertex(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.neighboutList = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighboutList() {
		return neighboutList;
	}

	public void setNeighboutList(List<Vertex> neighboutList) {
		this.neighboutList = neighboutList;
	}
	
	public void addNeighbourVertex(Vertex vertex) {
		this.neighboutList.add(vertex);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return this.data +"";
	
	}
}
