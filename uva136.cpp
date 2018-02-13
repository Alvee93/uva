#include <iostream>
using namespace std;
int main()
{    
    unsigned int i, a, b=0;
    for (i=2; b<1499; i++) {
        a=i;
        while(i%2==0 ){
            i=i/2;
        }
        while(i%3==0 ){
            i=i/3;
        }
        while(i%5==0 ){
            i=i/5;
        }
        
        if(i==1 || i==2 || i==3 || i==5){
            b++;
            if(b==1499) cout << a << " ";
        }
        i=a;
    }
	//cout << endl;
    //cout << "The count is " << b+1;
	//859963392
    return 0;
}

