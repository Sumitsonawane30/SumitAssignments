#include <iostream>
using namespace std;
int main()
{
    int a, b, c, ch;
    cout << "Enter a :" << endl;
    cout << "Enter b :" << endl;
    cin >> a >> b;
    do
    {
        cout << "\n\t1.Add";
        cout << "\n\t2.Subtraction";
        cout << "\n\t3.Multiplication";
        cout << "\n\t4.Division";
        cout << "\n\t5.Exit";
        cout << "\n\tEnter a choice :";
        cin >> ch;
        switch (ch)
        {
        case 1:
            c = a + b;
            cout << "\n\tAddition is:" << c;
            break;
        case 2:
            c = a - b;
            cout << "\n\tSubtraction is:" << c;
            break;
        case 3:
            c = a * b;
            cout << "\n\tMultiplication is:" << c;
            break;
        case 4:
            c = a / b;
            cout << "\n\tDivision is:" << c;
            break;
        case 5:
            cout << "\n\tWe are out of praogram";
            exit(0);
            break;
        }
    } while (ch != 5);

    return 0;
}