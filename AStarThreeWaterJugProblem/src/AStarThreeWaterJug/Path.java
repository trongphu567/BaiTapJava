package AStarThreeWaterJug;

import java.util.ArrayList;
import java.util.List;

/*
    Tran Trong Phu
    3121410387
    DCT1212
*/
public class Path<T> {
    private List<T> path;
    
    public Path() {
        path = new ArrayList<>();
    }
    
    public void addVertex(T vertex) {
        path.add(vertex);
    }
    
    public List<T> getPath() {
        return path;
    }
    
    public void setPath(List<T> path) {
        this.path.addAll(path);
    }
    
    //in duong di cua trang thai toi uu
    public void printPath() {
        for (int i=0;i<path.size();i++) {
            System.out.print(path.get(i).toString());
                    
        }
        System.out.println();
                
    }
}
