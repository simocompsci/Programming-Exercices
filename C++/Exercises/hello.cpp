#include <iostream>
using namespace std;

int main(){
    cout << "Hello World !!!\n";
    cout << "My name is mohammed i am 21 years old and i am studying cs as a  degree !!!\n";
    std::cout << "i want to learn c++ to start making video games , it s a hard thing but i would love to make my own game\n";
    int count = 0;
    for (int i = 10; i > count; i--)
    {
        cout<< i;
        cout<< "\n";
    }
    cout<< "happy new year\n";
    int age;
    cout<< "Enter your age please to confirm :";
    cin >> age;
    age >= 18 ? cout<< "You are an adult !!" : cout<< "get the fuck out of here\n";

    return 0;
}