//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 4 - Immutabilty
//
// The State of Java Immtuability
// > Immutable Collections
//

BigDecimal theAnswer = new BigDecimal(42)

BigDecimal result = theAnswer.add(BigDecimal.ONE)

System.out.println("result = " + result)
System.out.println("theAnswer = " + theAnswer)
