package com.lioyan.reactor.myTest;

/**
 * {@link Main}
 *
 * @author com.lioyan
 * @date 2021/10/19  16:26
 */
public class Main {

    public static void main(String[] args) {

        FluxTest<Object> objectFluxTest = new FluxTest<>();


        objectFluxTest.subscribe(s -> {
            System.out.println(s);
            return s;
        });
    }

}
