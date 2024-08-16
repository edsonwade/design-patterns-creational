### Q & A: Default vs. "No-Arg" Constructor

### Q:  What's the difference between a "default" and a "no-arg" constructor?

1. A "no-arg" constructor is one that lists no parameters (it takes no arguments).  
   A "default" constructor is a "no-arg" constructor that is created by the compiler, in the event that you don't
   explicitly create one yourself.

### Static Reference Variables and null

If the reference variable you are working with has a null value (meaning it is not referring to an object), it's in a
dangerous state.
Specifically, if you access an instance member with it, you will see the dreaded "NullPointerException."  
This is an exception created by the JVM and unless special exception handling code is written, will result in your
program quitting prematurely.  
For example, the following code will result in a NullPointerException:

```java
public static void main(String[] args) {
    String s = null;
    s = s.toUpperCase(); // Oops! s is null!
}
```

Static members are different.  
While you shouldn't write sloppy/confusing code like this, you should know (especially for the exam)
that accessing static members with a null Class reference will not throw a NullPointerException.
For example, the java.lang.Math class has a static method called floor:

```java
public static void main(String[] args) {
    Math m = null;
    double result = m.floor(28.15); // Confusing code, but it works.
}
```

I want to stress, while the preceding code won't throw a NullPointerException, you shouldn't write code like that.
It is much clearer to use the class name:

```java
public static void main(String[] args) {
    double result = Math.floor(28.15);
}
```

### Question 1:

1. What is the result of the following code:

```java
public class Person {
    String firstName;

    static void setFirstName(String newValue) {
        firstName = newValue;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Jason");
        System.out.println("firstName: " + p.firstName);
    }
}
```

1. A-The code will not compile.
2. B-firstName: Jason

A-Correct! Static methods cannot access instance variable or methods.
Plus, we really shouldn't call static methods with an object reference (p).
That, in itself isn't illegal, but it is considered poor coding.

### Question 2:

-**True or False**:  A static method can only be invoked after at least one object has been instantiated.
-**Answer** : False
Correct. Static methods and variables are available as soon as the class has been loaded.

## This is a static initialization block

## Este é um bloco de inicialização estático

```java
static {

}
```

### -What is static initialization?

### Isto significa que o código neste bloco só será executado uma vez, quando a classe for carregada. PT

-**It means that code in this block will only be executed once, when the class is loaded. EN**

### regular initialization

## Isto é executado toda vez que um novo objecto é instaciado.

```java
{
        }
```

### Question 1:

1. What's will be printed when this program is executed?

```java
public class Person {
    {
        personCount = 10;
    }

    static {
        personCount = 20;
    }

    private static int personCount = 1000;

    {
        personCount = 30;
    }

    static {
        personCount = 40;
    }

    public static void main(String[] args) {
        System.out.println(Person.personCount);
        Person p = new Person();
        System.out.println(Person.personCount);
        Person.personCount = 100;
        p = new Person();
        System.out.println(Person.personCount);
    }
}
```

```answer
output:
40
30
30
```

### Quiz Explanation

1. Let's look at the code again:

```java
public class Person {
    {
        personCount = 10;
    }

    static {
        personCount = 20;
    }

    private static int personCount = 1000;

    {
        personCount = 30;
    }

    static {
        personCount = 40;
    }

    public static void main(String[] args) {
        System.out.println(Person.personCount); // Line A 
        Person p = new Person(); // Line B
        System.out.println(Person.personCount); // Line C
        Person.personCount = 100; // Line D 
        p = new Person(); // Line E
        System.out.println(Person.personCount); // Line F
    }
}
```

When the program starts and this main method is kicked off, the Person class is loaded.  
This, in turn, makes the static personCount variable available, with a default value of 0 (remember, all instance and
static variables start with default values).

Next all the static initialization blocks, and the static variable's explicit initialization are executed in the order
they are listed, from top to bottom. Therefore, the personCount variable is set to 20, 1000, and finally 40. So Line A
prints "40."

On Line B, an object is instantiated, so that causes the instance initialization blocks to be executed in the order they
are listed, from top to bottom.
So now personCount is changed to 10 and finally 30. Line C prints the value "30."

Line D changes the personCount to 100, but Line E causes the instance initialization blocks to be executed again.  
Therefore, the final value printed in Line F is, once again, "30." So the answer to the quiz is:
40
30
30

### Primitives types

```java
boolean bool = 1;  //bit
byte by = 8; //bits ---- max range - 127 negative to 127  positive.
short sr = 16;  //bits
char c = 16;  //bits
int in = 32; //bits
float fl = 32;  //bits
long lo = 64; //bits
decimal dec = 64; //bits

byte b = 4;
int x = b; //correct assign 8 bits to 32 bits.

int x2 = 10;
byte b2 = x2; //wrong cannot assing 32 to 8 bits unless csating this value.

byte b3 = (byte) x2; //convert this int number into byte
````

````questions
/*Question 3:
True or False:  A byte, short, int, long, float, or double may be declared as "unsigned" (a range from zero to a positive number).
corret: All of these primitive types are "signed" in Java (a range from a negative number to a positive number).*/
````