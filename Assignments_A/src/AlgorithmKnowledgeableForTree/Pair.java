package AlgorithmKnowledgeableForTree;

public class Pair<T extends Comparable<T>, U> implements Comparable<Pair<T, U>>{
    public final T first;
    public final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <T extends Comparable<T>, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    @Override
    public int compareTo(Pair<T, U> other) {
        return this.first.compareTo(other.first);
    }
}