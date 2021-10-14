package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link Expand}
 *
 * @author com.lioyan
 * @date 2021/10/14  14:53
 */
public class Expand {
    public static void main(String[] args) {
        Node root = new Node("0");
        Node node1_1 = new Node("1-1");
        Node node1_2 = new Node("1-2");
        Node node2_1 = new Node("2_1");
        Node node2_2 = new Node("2_2");
        Node node2_3 = new Node("2_3");
        Node node2_4 = new Node("2_4");
        root.nodeRefs.add(node1_1);
        root.nodeRefs.add(node1_2);
        node1_1.nodeRefs.add(node2_1);
        node1_1.nodeRefs.add(node2_2);
        node1_2.nodeRefs.add(node2_3);
        node1_2.nodeRefs.add(node2_4);


        Mono.just(root)
                .expand(node ->  Flux.fromIterable(node.nodeRefs) )
                .subscribe(System.out::println);


        Mono.just(root)
                .expandDeep(node ->  Flux.fromIterable(node.nodeRefs) )
                .subscribe(System.out::println);
    }

    static class Node {


        public Node(String id) {
            this.id = id;
        }

        String id;
        List<Node> nodeRefs = new ArrayList<>();

        @Override
        public String toString() {
            return "Node{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }


}


