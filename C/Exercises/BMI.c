#include <stdio.h>

int main() {
    float weight, height, bmi;
    
    // Input weight and height
    printf("Enter your weight in kilograms: ");
    scanf("%f", &weight);
    
    printf("Enter your height in meters: ");
    scanf("%f", &height);
    
    // Calculate BMI
    bmi = weight / (height * height);
    
    // Display the result
    printf("\nYour BMI is: %.2f\n", bmi);
    
    // BMI Categories
    printf("\nBMI Categories:\n");
    printf("Underweight: < 18.5\n");
    printf("Normal weight: 18.5 - 24.9\n");
    printf("Overweight: 25 - 29.9\n");
    printf("Obesity: >= 30\n");
    
    return 0;
}