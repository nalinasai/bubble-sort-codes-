#include <iostream>
using namespace std;

int main(){
    cout<< "before sorted"<<endl;
    int array[5] = {2,4,1,6,3};

    for(int h=0; h<5; h++){
        cout << array[h]<<" ";
    }
    cout << endl;

    for (int i=0; i<4; i++){
        for (int j=0; j<5-i-1; j++){
            if(array[j]>array[j+1]){
                swap(array[j],array[j+1]);

            }
        }
    }

    cout << "after sorted"<<endl;
    for(int k=0; k<5; k++){
        cout << array[k]<< " ";
    }
}

