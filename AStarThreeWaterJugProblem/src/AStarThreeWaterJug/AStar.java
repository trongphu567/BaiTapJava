
package AStarThreeWaterJug;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import org.w3c.dom.Node;

/*
    Tran Trong Phu
    3121410387
    DCT1212
*/
public class AStar {
    
    public static int MAX_JUG1, MAX_JUG2, MAX_JUG3, GOAL;
    public int cost;
    public int heuristic;
    
    public static Queue<Vertex> open = new PriorityQueue<>(200, Comparator.comparingInt(s->s.cost ));
    //chuyen queue thanh priority queue
    //them cai g va h tinh theo khoang cach
    
    public static List<Vertex> closed = new LinkedList<Vertex>() {
        public boolean contains(Object obj) {
            Vertex vertex = (Vertex) obj;
            
            for (Vertex v: this) {
                if ((vertex.equals(v)) && (vertex.getPath().equals(v.getPath()))) {
                    return true;
                } 
            }
            return false;
        }
    };
    
    public static void main(String[] args) {
        //dat trang thai cua 3 binh nuoc va muc tieu can dong nuoc
        MAX_JUG1 = 3;
        MAX_JUG2 = 5;
        MAX_JUG3 = 8;
        GOAL = 4;
        
        Vertex.setMaxJugsCapacity(MAX_JUG1, MAX_JUG2, MAX_JUG3);
        //khoi tao trang thai ban dau cho 3 binh nuoc
        Vertex initialVertex = new Vertex(new State(0,0,0));
        open.add(initialVertex);
        
        while (!(open.isEmpty())) {
            Vertex currentVertex = open.poll();
            currentVertex.addToPath();
            System.out.println("Trang thai hien tai: ("+ currentVertex.getState().getJug1()+","+currentVertex.getState().getJug2()+","
            		+currentVertex.getState().getJug3()+")");
            
            //neu diem dang xet co trang thai cua binh 2 hoac binh 3 bang GOAL thi dung thuat toan
            if (currentVertex.getState().getJug2() == GOAL || currentVertex.getState().getJug3() == GOAL) {
//                currentVertex.printPath();
            	System.out.println(currentVertex);
                break;
            }
            
            closed.add(currentVertex);
            
            //tao 1 arraylist chua cac trang thai cua bai toan
            ArrayList<Vertex> newVertexs = new ArrayList<>();
            
            newVertexs.add(currentVertex.full_jug1());
            newVertexs.add(currentVertex.full_jug2());
            newVertexs.add(currentVertex.full_jug3());
                    
            newVertexs.add(currentVertex.empty_jug1());
            newVertexs.add(currentVertex.empty_jug2());
            newVertexs.add(currentVertex.empty_jug3());
            
            newVertexs.add(currentVertex.pour_jug1_jug2());
            newVertexs.add(currentVertex.pour_jug1_jug3());
            
            newVertexs.add(currentVertex.pour_jug2_jug1());
            newVertexs.add(currentVertex.pour_jug2_jug3());
            
            newVertexs.add(currentVertex.pour_jug3_jug1());
            newVertexs.add(currentVertex.pour_jug3_jug2());
            
            //voi moi trang thai trong mang newVertexs
            for (Vertex newVertex: newVertexs) {
                if (!closed.contains(newVertex)) {
                    if (!open.contains(newVertexs)) {
//                    	newVertex.setPath(currentVertex.getPath());
                        open.add(newVertex);
                    } else {
//                        System.out.print("OPEN = "+open);
//                        closed.add(newVertex);
//                        System.out.println("CLOSED = "+closed);
//                        System.out.println("Trang thai moi sinh ra: ("+newVertex.getState().getJug1()+","+newVertex.getState().getJug2()+","
//                        		+newVertex.getState().getJug3()+")");
                    }
                    
                }
                else {
                	System.out.println("Trang thai khong hop le: ("+newVertex.getState().getJug1()+","+newVertex.getState().getJug2()+","
                    		+newVertex.getState().getJug3()+")");
                }
            }
            
            
        }
        
    }
    
    
    
    
    
}
