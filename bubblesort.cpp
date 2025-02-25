#include <iostream>  // Includes the input-output stream library for printing to the console
#include <vector>
#include <sstream>
using namespace std; // To use standard C++ library functions like cout, endl without needing std:: prefix

int main(){

    cout<< "Enter the input: ";
    vector<int> numbers;
    string inputs;

    getline(cin , inputs);

    stringstream stream(inputs);

    int num;
    while(stream>>num){
        numbers.push_back(num);
    }
    
    
    int n = numbers.size();
    for (int i=0; i<n-1; i++){
        for (int j=0; j<n-i-1; j++){
            if(numbers[j]>numbers[j+1]){
                swap(numbers[j],numbers[j+1]);

            }
        }
    }

    cout << "after sorted: ";
    for(int k=0; k<n; k++){
        cout << numbers[k]<< " ";
    }
}

