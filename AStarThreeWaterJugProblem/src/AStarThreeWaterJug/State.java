package AStarThreeWaterJug;

/*
    Tran Trong Phu
    3121410387
    DCT1212
*/
public class State {
    private int jug1, jug2, jug3, cost;
    private static int MAX_JUG1 = 0;
    private static int MAX_JUG2 = 0;
    private static int MAX_JUG3 = 0;
    
    public State() {
        this.jug1 = 0;
        this.jug2 = 0;
        this.jug3 = 0;
    }
    
    public State(int jug1, int jug2, int jug3) {
        this.jug1 = jug1;
        this.jug2 = jug2;
        this.jug3 = jug3;
    }
    
    
    //tao trang thai day binh cua 3 binh nuoc
    public static void setMaxJugsCapacity(int maxJug1, int maxJug2, int maxJug3) {
        MAX_JUG1 = maxJug1;
        MAX_JUG2 = maxJug2;
        MAX_JUG3 = maxJug3;
    }
    
    public int getJug1() {
        return jug1;
    }
    
    public int getJug2() {
        return jug2;
    }
    
    public int getJug3() {
        return jug3;
    }
    
    //do day binh 1
    public State full_jug1() {
        return new State(MAX_JUG1, jug2, jug3);
    }
    
    //do day binh 2
    public State full_jug2() {
        return new State(jug1, MAX_JUG2, jug3);
    }
    
    //do day binh 3
    public State full_jug3() {
        return new State(jug1, jug2, MAX_JUG3);
    }
    
    //do nuoc ra ngoai binh 1
    public State empty_jug1() {
        return new State(0, jug2, jug3);
    }
    
    //do nuoc ra ngoai binh 2
    public State empty_jug2() {
        return new State(jug1, 0, jug3);
    }
    
    //do nuoc ra ngoai binh 3
    public State empty_jug3() {
        return new State(jug1, jug2, 0);
    }
    
    //do nuoc tu binh 1 qua binh 2
    public State pour_jug1_jug2() {
        if ((jug1 + jug2) >= MAX_JUG2) {
            return new State((jug1 + jug2 - MAX_JUG2), MAX_JUG2, MAX_JUG3);
        }
        else
            return new State(0, (jug1 + jug2), MAX_JUG3);
    }
    
    //do nuoc tu binh 1 qua binh 3
    public State pour_jug1_jug3() {
        if ((jug1 + jug3) >= MAX_JUG3) {
            return new State((jug1 + jug3 - MAX_JUG3), MAX_JUG2, MAX_JUG3);
        }
        else 
            return new State(0, MAX_JUG2, (jug1 + jug3));
    }
    
    //do nuoc tu binh 2 qua binh 1
    public State pour_jug2_jug1() {
        if ((jug1 + jug2) >= MAX_JUG1) {
            return new State (MAX_JUG1, (jug1 + jug2 - MAX_JUG1), MAX_JUG3);
        }
        else
            return new State((jug1 + jug2), 0, MAX_JUG3);
    }
    
    //do nuoc tu binh 2 qua binh 3
    public State pour_jug2_jug3() {
        if ((jug2 + jug3) >= MAX_JUG3) {
            return new State(MAX_JUG1, (jug2 + jug3 - MAX_JUG3), MAX_JUG3);
        }
        else
            return new State (MAX_JUG1, 0, (jug2 + jug3));   
    }
    
    //do nuoc tu binh 3 qua binh 1
    public State pour_jug3_jug1() {
        if ((jug1 + jug3) >= MAX_JUG1) {
            return new State(MAX_JUG1, MAX_JUG2, (jug1 + jug3 - MAX_JUG1));
            
        }
        else
            return new State((jug1 + jug3), MAX_JUG2, 0);
    }
    
    //do nuoc tu binh 3 qua binh 2
    public State pour_jug3_jug2() {
        if ((jug2 + jug3) >= MAX_JUG2) {
            return new State(MAX_JUG1, MAX_JUG2, (jug2 + jug3 - MAX_JUG2));
        }
        else
            return new State(MAX_JUG1, (jug2 + jug3), 0);
    }
    
    @Override
    public boolean equals(Object obj) {
        State s = (State) obj;
        
        if (!(s instanceof State)) {
            return false;
        }
        return ((s.getJug1() == this.getJug1()) && (s.getJug2() == this.getJug2()) && (s.getJug3() == this.getJug3()));
    }
    @Override
    public String toString(){
        return "(" + jug1 + "-" + jug2 + "-" + jug3 + ")";
    }
    
    //ham heuristic uoc luong khoang cach
    public int heuristic(State state, int target) {
    	return Math.abs(state.jug1 - 0) + Math.abs(state.jug2 - target) + Math.abs(state.jug3 - 0);
    }
}
