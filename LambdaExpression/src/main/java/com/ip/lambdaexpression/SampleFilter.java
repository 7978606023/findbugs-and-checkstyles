package com.ip.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PRATAP
 *Wap to use filter method
 */
final class SampleFilter {
/**
 * This prevents the default parameter-less constructor
 * from being used elsewhere in your code.
 */
private SampleFilter() {
throw new AssertionError("Instantiating utility class.");
}

/**
* @param args is  argument
*/
public static void main(final String[] args) {
List<Integer> l = new ArrayList();
l.add(1);
l.add(2);
l.add(1);
l.add(2);
l.add(2);
System.out.println("using without stream " + l);
List<Integer> l1 = l.stream()
.filter(i -> i % 2 == 0)
.collect(Collectors.toList());
System.out.println(" using stream : " + l1);
}
}
