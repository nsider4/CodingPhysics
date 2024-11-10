# Pythagorean Theorem Calculator with Visualization

This project implements the Pythagorean Theorem calculations, allowing users to calculate the length of the sides of a right triangle. It provides functionality to compute the hypotenuse or any of the two sides (a, b) based on the available information. The program operates via a command-line interface (CLI) and also includes a graphical visualization of the triangle using **JavaFX**, allowing users to input the side lengths interactively and view the calculated triangle.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
    - [TriangleSides](#trianglesides)
    - [PythagoreanCalculator](#pythagoreancalculator)
    - [PythagoreanTheorem](#pythagoreantheorem)
    - [TriangleVisualizer](#trianglevisualizer)
- [Contributing](#contributing)

## Features

- **Calculate Hypotenuse**: Calculate the hypotenuse of a right triangle given the two sides.
- **Calculate Side A**: Calculate side 'a' given the hypotenuse and side 'b'.
- **Calculate Side B**: Calculate side 'b' given the hypotenuse and side 'a'.
- **Interactive Menu**: A user-friendly CLI for choosing which side to calculate and entering the required values.
- **Triangle Visualization**: Graphically visualize the right triangle with labeled sides using JavaFX.

### Requirements

- **Java 17** or higher.
- **IDE**: IntelliJ IDEA, Eclipse, or any other Java IDE.
- **JavaFX**: Make sure JavaFX is configured correctly in your IDE. (imported through maven)


## Usage

Upon running the program, you'll be prompted with the following interactive menu:

```plaintext
Choose which side to calculate (a, b, or c):
```

### Option 1: Calculate Hypotenuse (c)
This option allows you to calculate the hypotenuse (c) by entering the lengths of the two sides (a and b). The program will then display the calculated hypotenuse. Then, it launches the visualization of the triange

### Option 2: Calculate Side a
This option allows you to calculate side 'a' by entering the hypotenuse (c) and side 'b'. The program will then display the calculated side 'a'. Then, it launches the visualization of the triange

### Option 3: Calculate Side b
This option allows you to calculate side 'b' by entering the hypotenuse (c) and side 'a'. The program will then display the calculated side 'b'. Then, it launches the visualization of the triange

### Option 4: Exit
Select this option to exit the program.


## Classes Overview

### `TriangleSides`
- Stores the three sides of a right triangle (a, b, and c).
- **Methods**:
    - `getA()`: Returns the length of side 'a'.
    - `setA(double a)`: Sets the length of side 'a'.
    - `getB()`: Returns the length of side 'b'.
    - `setB(double b)`: Sets the length of side 'b'.
    - `getC()`: Returns the length of side 'c'.
    - `setC(double c)`: Sets the length of side 'c'.

### `PythagoreanCalculator`
- Handles the core logic for calculating the sides of a right triangle using the Pythagorean Theorem.
- **Methods**:
    - `handleSideCalculation()`: Manages user input and calls the appropriate method for calculation.
    - `calculateHypotenuse()`: Calculates the hypotenuse (c) from sides a and b.
    - `calculateSideA()`: Calculates side 'a' from the hypotenuse (c) and side 'b'.
    - `calculateSideB()`: Calculates side 'b' from the hypotenuse (c) and side 'a'.
    - `displayResult()`: Displays the calculation steps and result for the chosen side.

### `PythagoreanTheorem`
- The entry point of the program that initializes the `TriangleSides` object and the `PythagoreanCalculator`, and starts the side calculation process.

### `TriangleVisualizer`
- A JavaFX application that visualizes the right triangle based on the calculated sides.
- **Methods**:
    - `setSides(TriangleSides sides)`: Sets the `TriangleSides` object for visualization.
    - `start(Stage stage)`: The main method that initializes the JavaFX application and visualizes the triangle.

## Contributing

Feel free to fork the repository, make improvements, and submit pull requests. If you find any bugs or have feature requests, please open an issue.