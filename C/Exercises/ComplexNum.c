#include <stdio.h>

// Structure to represent a complex number
typedef struct {
    double real;
    double imag;
} Complex;

// Function to add two complex numbers
Complex addComplex(Complex a, Complex b) {
    Complex result;
    result.real = a.real + b.real;
    result.imag = a.imag + b.imag;
    return result;
}

// Function to display a complex number
void displayComplex(Complex num) {
    if (num.imag >= 0) {
        printf("%.2f + %.2fi\n", num.real, num.imag);
    } else {
        printf("%.2f - %.2fi\n", num.real, -num.imag);
    }
}

int main() {
    Complex num1, num2, sum;
    
    // Input first complex number
    printf("Enter first complex number:\n");
    printf("Real part: ");
    scanf("%lf", &num1.real);
    printf("Imaginary part: ");
    scanf("%lf", &num1.imag);
    
    // Input second complex number
    printf("\nEnter second complex number:\n");
    printf("Real part: ");
    scanf("%lf", &num2.real);
    printf("Imaginary part: ");
    scanf("%lf", &num2.imag);
    
    // Add the complex numbers
    sum = addComplex(num1, num2);
    
    // Display results
    printf("\nFirst complex number: ");
    displayComplex(num1);
    
    printf("Second complex number: ");
    displayComplex(num2);
    
    printf("Sum: ");
    displayComplex(sum);
    
    return 0;
}