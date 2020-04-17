package com.ip.lambdaexpression;

import static org.testng.Assert.assertEquals;
import java.util.stream.Stream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindStringWithFirstCharacterTest {

/**
* Call to implement class of FindStirngWithFirstCharacter.
*/
private FindString findStirngWithFirstCharacter
= null;

/**
*Create the object of implement class.
**/
@BeforeTest
public final void setUp() {
findStirngWithFirstCharacter = new FindString();
}

/**
*First test case of first String with first character.
*/
@Test
public void findNameStartWithCharacter() {
Stream<String> names = Stream.of("Pankaj", "Amit", "David", "Lisa");
String name = "D";
assertEquals(findStirngWithFirstCharacter
.findFirstStringStartsWithOneCharacter(names, name), "David");
}
}
