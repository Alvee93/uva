#include <iostream>
using namespace std;
int main()
{
    unsigned int a;
    cin >> a;
    while(a!=0){

        if (a<=100){
            cout << "f91("<<a <<") = ";
            cout << 91 << endl;
        }
        else if(a>100){
            cout << "f91("<<a <<") = ";
            a=a-10;
            cout << a << endl;
        }
        cin >> a;
    }
}
