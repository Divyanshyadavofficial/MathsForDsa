public class Main {
}
// 1). And operator &
// both should be true for the entire expression to be true

// when you & 1 with any number digits remain the same

// 110010100 & 111111111 = 110010100

// 2). OR operator ||
// anyone is true then the whole expression is true.

// 3). XOR ^ if and only if --- exclusive or

// if you have two numbers only one should be true

//----->
// if i Xor any number with 1 i get compliment of that number
// a^0 = a
// a^a = 0

//4). compliment operator ~

// a = 10110
// compliment of a = 01001

// conversion into various bases

// 1 decimal number system 0,1,2,3,4,5,6,7,8,9 base 10
// 2 binary - 0 & 1 base 2
// 3 octal  - 0,1,2,3,4,5,6,7 base 8
// 4 hexadecimal - 0-9 A-F  base 16


// conversions

// 1 conversion from decimal to base b

//---> keep dividing by base take remainders and write them in opposite
// order

// 2 conversion of  any base b into binary

// ---> multiply & add the power of base with digits.


// 5). left shift operator(<<)

// 1010 << 1 = 10100 shifted by one place towards the right and the
// whenever you need an extra number add a zero in place of it
// this new number is equal to 16+4 = 20

// therefore  a<<1 = 2a.

// a<<b = a*2**b

// 6). Right shift operator(>>)

// 0011001 >> 1 = 001100.
// it is dividing a number by 2

// a>>b = a/2**b

// 00011234 = 11234 ---> same for all number systems.


// Que - given a no. n find if it is odd or even.
// --->
//    every no is calculated in binary form internally
//    12+7 = 1100+0111 = 10011 = 19
//    10011 -- leaving the last 1 every other digit is a power of 2
//    1001 - will always be even.
//    hence if 2**0 place ==1 then number is odd
//    otherwise the number is even.
//    n&1 ==1 ---> odd else even.
//
// the last digit of a  binary no  is known as least significant bit

// (5*3)*(5*4) = 5*5*3*4
//             = 5*4*3*5
// basically order does not matter Associative law


// lsb tells us whether a num is odd or even
// msb tells us whether a num is positive or negative
// 1---> negative
// 0---> positive

//steps to convert a positive to a negative no

// 1). take compliment of no and
// 2). add 1 to it.

// why these steps

// 11111111 - 00001010 +1

// range of numbers
// 1 byte
// total 256 unique no can be stored in 1 byte
// actual no is stored in bits = n-1
// in 1 byte the actual no is stored in 7 bits
// that is 128 no in the negative and 128 in positive
// zero will be ignored
//
// Range formula for n bits
// -2**n-1 to 2**n-1 - 1
// if the numbers are appearing 3 times find the number that
// appear one time
// their set bits are appearing 3 times calculate the modulo 3 with
// every no to find the unique no

//magic no
//n&1 this will give the last digit in binary.
// then multiply it with the num then n>>1.


// no of digits in base b
// 6 = 1 digit
// 110 = 3 digit
// keep a counter till num ==0.
// formula
// log2(6) = x
// 6 = 2**x
// x represents the number of digits in the representation of the base.

// no. of digits of base b of no. n
// == int(log(b)n)+1 here b is a log base

//pascals Triangle  sum of nth row =  1<<(n-1) = 1*2**n-1.
//
// power of 2
// the power of 2 is checked by checking the binary representation
// of a number if it contains only single one it is a power of 2.
// if n&(n-1) = 0 then it is a power of 2

// modulo properties

// (a+b)%m = ((a%m)+(b%m))%m

// (a-b)%m = ((a%m)-(b%m)+m)%m

// (a*b)%m = ((a%m)*(b%m))%m

// (a/b)%m = ((a%m)*(b**-1%m))%m

// (b**-1)%m ---> multiplicative modulo inverse
// basically means that b and m are co primes
// nothing else is common except for 1 in them

// (a%m)%m = a%m

// (m**x) % m = 0 for x = positive integers

// if p is prime no. which is not a divisor of b,
// then ab**p-1 % p = a%p due to fermat's little
// theorem

// Die hard example
// r = s'a + t'b = L --> r = ax+by
// put x & y as integers, what is the minimum +ve
// value you can have of equation

//3X+5y = 1
// this is called hcf.

//hcf of a&b = min. +ve value of eqn aX+by where
// x&y are integers.

// whatever hcf you will get that will come out as
// common

// euclid's algo
// gcd(a,b) = gcd(rem(b,a),a)