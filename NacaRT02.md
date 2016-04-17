# What is Naca? -->[click here](Naca0201.md) #

# NacaRT - Tests #

## Introduction ##

> Many cobol like statements are unit-tested by the Naca sub-project NacaRTTests.

> These tests are not junit tests, but are in fact cobol-like hand written programs that checks semantics of transcoded verbs.

> The main.java is a launcher that executes all tests.
> If a test fails, then an excpetion is sent.

> It is mandatory that all tests performs correctly.
> If nacaRT is modified in some way, the tests must be checked. If a test fails dur to some modification of nacaRT, then either:

  * nacaRT has a bug that is shown by the test, so nacaRT must be corrected.
  * the test is wrong, then it must be corrected.

## Tests coverage ##

The various aspects covered by the tests are:

  * program support
  * copy support
  * Working storage variable allocation
  * Occurs item, Groups, Redefintio of variables
  * Variable typing support
  * Alphanumeric variable support
  * Right justification words
  * Numeric variable support, including Comp0, comp3, comp4 encoding, with(/out) sign
  * Numeric edited variables support
  * variable redefinition
  * program calling
  * program linking
  * parameter passing between programs, including linkage storage section
  * String, Unstring, Inspect, Concat handling
  * Maths
  * Conditions
  * Queues
  * Paragraph/section perform/goto
  * Screen map defintion
  * Screen map redefintion
  * SQL statement
  * misc cobol like verbs