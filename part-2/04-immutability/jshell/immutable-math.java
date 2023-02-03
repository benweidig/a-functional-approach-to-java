/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 4 - Immutabilty
 */

var theAnswer = new BigDecimal(42);

var result = theAnswer.add(BigDecimal.ONE);

System.out.println(result);
System.out.println(theAnswer);
