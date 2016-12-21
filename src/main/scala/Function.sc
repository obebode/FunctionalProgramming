
// 1. Write an anonymous function which takes in an Int(x) and returns (x*2)

var multiplyByTwo = (x: Int) => x * 2

/* 2. Call your function with a few values to see if it is working correctly. By giving
    the anonymous function an identifier (the def value) we can now pass into other
    functions and methods as if it was an object
*/
var a = multiplyByTwo(4)
var b = multiplyByTwo(8)
var c = multiplyByTwo(10)

def multiply(x: Int): Int = x * 2
var d = multiply(3)
var e = multiply(5)
var f = multiply(7)

// 3. Write a function that takes in two Ints and return their sum
def sumInts(x: Int, y: Int) = x + y

/* 4. Write a function which takes in an Int and a String and returns a Boolean
   based on whether the length of the String matches the Int value
*/
def check(n: Int, s: String): Boolean = {
  if (s.length == n) true
  else false
}

val p = check(5, "James")
val q = check(4, "john")

/* 5,6,7. Write an isEven function which takes in an Int and returns a boolean based on
   whether the Int was even or not
*/

def isEven(x: Int): Boolean = if (x % 2 == 0) true else false
val even = isEven(8)
def isOdd(x: Int): Boolean = !isEven(x)
val odd = isOdd(8)

/* 8. Write a function that takes in a minimum numbers, a maximum number and a
    function which applies the function to every number in the range min>= x >= max
    and outputs it as a collection (Hint: look at the for/yield construct)
*/

def squareAll(f: Int => Int, min: Int, max: Int) = {
  for (i <- min until max) yield f(i)
}

def square(x: Int): Int = x * x

val pg = squareAll(square, 2, 10)
val pq = squareAll(square, 3, 15)

/*  9. Write a function which takes in three Int values and add them all together.
    a. Now curry that function to turn it from a single three int function to three
    individual functions all wrapped inside one another.
    b. The curried version of the function returns a function in the first two steps.
    Call your function and explore how it works
 */

def add(x: Int, y: Int, z: Int): Int = x + y + z
val m = add(1, 3, 5)

def add1(x: Int)(y: Int)(z: Int) = x + y + z
val j = add1(1)(3)(5)

