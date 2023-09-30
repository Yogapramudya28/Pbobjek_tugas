#include <iostream>
using namespace std;

int main(){
	string nama;
	int nim;
	
	cout << "Masukkan nama: ";
	cin >> nama;
	cout << endl;
	
	cout << "Masukkan nim: ";
	cin >> nim;
	cout << endl;
	
	//for loop, tipe data, array 1 dimensi, cin, cout
	string a[50];
	string b[50];
	int c[50],d[50], isi;
	
	cout << "Masukkan isi himpunan a : ";
	cin >> isi;
	for(int i=0; i<isi; i++){
	cout << "Masukkan isi Himpunan a ke " << i+1 << " :";
	cin >> a[i];
	}
	cout<<endl;
	//if else
	int waktu = 22;
	
	if (waktu < 10) {
  	cout << "Good morning.";
	} else if (waktu < 20) {
  	cout << "Good day.";
	} else {
  	cout << "Good evening.";
	}
	cout << endl << endl;
	
	int i = 1; 

    // while
    while (i <= 5) {
        cout << i << " ";
        ++i;
    }
    
    cout << endl << endl;
	
	int k = 1; 

    // do...while
    do {
        cout << k << " ";
        ++k;
    }
    while (k <= 5);
    
    cout << endl <<endl;
    
    //array multidimensi
    
    int arr[3][2] = {{2, -5},
                      {4, 0},
                      {9, 1}};

    for (int i = 0; i < 3; ++i) {

        for (int j = 0; j < 2; ++j) {
            cout << "test[" << i << "][" << j << "] = " << arr[i][j] << endl;
        }
    }
	
	//program c++
	return 0;
}
