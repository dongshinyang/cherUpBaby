package cherUpBaby.basic;

public class Classification {}
       
class A {}

class B {}

class C {}

/**
 * JavaCompiler make .class that one for each class
 
 * in the class block name with the public, you must use the same name between the source file name and class block name  
 * you can use the source file name and the class block name differently but it is not recommended
 * you can have only one public class block in the source file
 * e.g. : public class Classification {} == Classification.java
 *               class Classification {} == Classification.java
 *        		          class Class {} == Classification.java

 * The Java compiler compiles the source file's character set
 * It is assumed to be the same as the default character set of the operating system.
 * e.g. : Windows_OS: MS949
             Mac_OSX: UTF-8

 * when compiling if it is not same with default character set
 * Using -encoding option, you must tell the compiler to that thing
 * e.g. : javac classification.java
 * e.g. : javac -encoding UTF-8 classification.java
 * e.g. : javac -d bin src/cherUpBaby/classification.java
 * e.g. : javac -encoding UTF-8 -d bin src/cherUpBaby/classification.java
 * 
 * after compiling, there are  4.class
 * e.g. : Classification.class
 *                     A.class
 *                     B.class
 *                     C.class
 * Classification.java
 * when staring .class file 
 * 
								[Java Compiler]				                                                      [Java Virtual Machine] 						
 * [source file] =============[compiling(source file)]========> [class file]=============> [MainMethod()]             
 * [Classification.java] =====[javac Classification.java]=====> [Classification.class]===> [java Classification]            
 */	

