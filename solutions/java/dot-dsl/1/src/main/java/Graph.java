import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    
    private final Collection<Node> nodes = new ArrayList<>();
    private final Collection<Edge> edges = new ArrayList<>();
    private final Map<String, String> attributes = new HashMap<>();
    
    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return this.nodes;
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        this.nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        this.nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        this.edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        this.edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
}
