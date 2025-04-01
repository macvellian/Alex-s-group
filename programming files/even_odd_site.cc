#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream file;
    file.open("numbers.html");
    // format output file 
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n";
    // even versus odd headers of table
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    // loop through numbers
    for (int i = 1; i <= 50; i++) {
        // if even add to even section of table
        if (i % 2 == 0) {
            file << "<tr><td>" << i << "</td><td></td></tr>\n";
        }
        // if odd, add to odd section of table
        else {
            file << "<tr><td></td><td>" << i << "</td></tr>\n";
        }
    }
    file << "</table>\n</body>\n</html>";
    file.close();
    ifstream input("numbers.html");
    cout << input.rdbuf();
    input.close();
    return 0;
}
