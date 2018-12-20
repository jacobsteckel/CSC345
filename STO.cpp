//Jacob Steckel
//Homework 0 - References: C++

#include <iostream>

using namespace std;

//prototypes
int square(int& i);
int twice(int& i);
int once(int& i);
 //main
int main() 
{
   int x = 3;
   int y = square(x) + twice(x) + once(x);
   cout << y << endl;
}

//square value
int square(int& i) 
{
   return i = i * i;
}

//double value
int twice(int& i) 
{
   return i = 2 * i;
}

//value
int once(int& i) 
{
    return i;
}