#include <iostream>
#include <cmath>

int main()
{
    int choice;
    int num;

    std::cout << "1. Binary to Octal\n";
    std::cout << "2. Octal to Binary\n";
    std::cout << "Enter your choice: ";
    std::cin >> choice;

    switch (choice)
    {
    case 1:
    {
        std::cout << "Enter a any binary number: ";
        std::cin >> num;

        int octal = 0, decimal = 0, i = 0;
        while (num != 0)
        {
            decimal += (num % 10) * pow(2, i);
            ++i;
            num /= 10;
        }
        i = 1;
        while (decimal != 0)
        {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        std::cout << "Octal equivalent of above No.: " << octal << "\n";
    }
    break;

    case 2:
    {
        std::cout << "Enter a any octal number: ";
        std::cin >> num;

        int binary = 0, digit;
        while (num != 0)
        {
            int octDigit = num % 10;
            int binPart = 0, j = 1;
            while (octDigit > 0)
            {
                digit = octDigit % 2;
                binPart += digit * j;
                octDigit /= 2;
                j *= 10;
            }
            binary = binPart * pow(10, int(log10(num) + 1)) + binary;
            num /= 10;
        }
        std::cout << "Binary equivalent of above No.: " << binary << "\n";
    }
    break;

    default:
        std::cout << "Invalid choice\n";
        break;
    }

    return 0;
}
