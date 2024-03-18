# BMI Calculator: A Simple Approach in Kotlin

In this project, we have developed a mobile application to calculate the Body Mass Index (BMI) using Kotlin, a modern and widely used programming language for Android app development. BMI is a widely accepted measure to assess whether a person is within a healthy weight range in relation to their height. This application will allow users to input their height and weight and receive an evaluation of their BMI.

## Project Overview:
* Programming Language: Kotlin
* Development Platform: Android Studio

## Key Features:
* BMI Calculator
* Display of BMI result
* Interpretation of the result based on predefined value ranges
* Simple and intuitive user interface

### Implementation:
The implementation of this application follows a simple and straightforward approach:

User Interface (UI): The user interface will consist of two input fields for the user to enter their height and weight, along with a "Calculate BMI" button that will direct the user to another screen with the result.

Business Logic: When the user fills in the height and weight fields and clicks the calculate button, the application will calculate the BMI using the standard formula: BMI = weight (kg) / (height (m))^2.

Result Display: After the calculation, the application will display the BMI result and provide an interpretation of the calculated value, indicating whether the user is underweight, within normal weight, overweight, or obese.

Feedback: If the user does not fill in the fields, they will be alerted through a toast to fill them in correctly.
