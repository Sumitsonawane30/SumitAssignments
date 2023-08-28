#include <iostream>
using namespace std;
int main()
{
    int a[10], n, i, cases = 0, rem, ans = 0, p = 1;

    cout << "What you want to do: \n1.Binary to Decimal \n2.Decimal to Binary \n";
    cin >> cases;

    switch (cases)
    {
    case 1:
        cout << "Enter any Binary no. to convert:";
        cin >> n;
        while (n > 0)
        {
            rem = n % 10;
            ans = ans + (rem * p);
            p = p * 2;
            n = n / 10;
        }
        cout << "Decimal of above no. is :" << ans << endl;
        break;

    case 2:
        cout << "Enter the any Decimal No. to convert: ";
        cin >> n;
        for (i = 0; n > 0; i++)
        {
            a[i] = n % 2;
            n = n / 2;
        }
        cout << "Binary of Above number : ";
        for (i = i - 1; i >= 0; i--)
        {
            cout << a[i];
        }
        break;

    default:
        cout << "Invalid Choice!";
        break;
    }
}
