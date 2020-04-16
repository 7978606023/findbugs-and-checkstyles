package com.ip.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PRATAP
 *Wap to use map method
 */
final class SampleMap {
/**
 *This prevents the default parameter-less constructor
 *from being used elsewhere in your code.
 */
private SampleMap() {
throw new AssertionError("Instantiating utility class.");
}
/**
* @param args
**/
public static void main(final String[] args) {
List<Integer> l = new ArrayList();
l.add(0);
l.add(10);
l.add(30);
l.add(40);
l.add(50);

System.out.println("result is without using stream and filter:" + l);
List<Integer> l1 = l.stream().map(i -> i * i).collect(Collectors.toList());
System.out.println("the result is using stream and filter :" + l1);
}
}
