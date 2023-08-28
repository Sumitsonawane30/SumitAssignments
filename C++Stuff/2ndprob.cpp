#include <iostream>
using namespace std;
int main()
{
    int n, rem, ans = 0, p = 1, octal = 0, placevalue = 1, cases = 0;
    cout << "What you want to do : \n1.Octal to decimal  \n2.Decimal to Octal \n";
    cin >> cases;

    switch (cases)
    {
    case 1:
        cout << "Enter any Octal No. to convert :";
        cin >> n;
        while (n > 0)
        {
            int rem = n % 10;
            ans = ans + (rem * p);
            p = p * 8;
            n = n / 10;
        }
        cout << "Decimal No. above Number is :" << ans << endl;
        break;

    case 2:
        cout << "Enter the Decimal No. to convert : ";
        cin >> n;
        while (n > 0)
        {
            octal += (n % 8) * placevalue;
            n /= 8;
            placevalue *= 10;
        }
        cout << "Octal of above is :" << octal;
        break;
    }
}