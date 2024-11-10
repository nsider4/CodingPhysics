# Rotation Calculator

Welcome to the **Rotation Calculator**! This program allows you to perform various geometric operations, such as finding the angle of rotation between two points, determining the perpendicular bisector of two points, and rotating a point around a specified center by a given angle.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#usage-example)
- [Classes Overview](#classes-overview)
    - [Point](#point)
    - [RotationCalculator](#rotationcalculator)
    - [RotationOperations](#rotationoperations)
- [Contributing](#contributing)

## Features

- **Angle of Rotation**: Calculate the angle of rotation between a base and transformed point, with an optional center of rotation.
- **Perpendicular Bisector**: Find the perpendicular bisector between two points.
- **Point Rotation**: Rotate a point around a center by a given angle (clockwise or counterclockwise).
- **Interactive Menu**: Choose options through a simple, user-friendly menu system.


### Requirements

- **Java 17** or higher.
- **IDE**: IntelliJ IDEA, Eclipse, or any other Java IDE.


## Usage

1. **Find the Angle of Rotation**  
   This option calculates the angle of rotation between two points (base and transformed), optionally rotating around a specified center.

    - You will be asked to enter the **base point (image)** coordinates (x, y).
    - You will then be asked to enter the **transformed point (pre-image)** coordinates (x, y).
    - If desired, you can also enter a **center of rotation** (default is (0, 0)).

   The program will calculate the angle of rotation based on these inputs.


2. **Find the Perpendicular Bisector**  
   This option finds the perpendicular bisector between two given points.

- You will be asked to enter the coordinates for **point 1** and **point 2**.
- The program will calculate and display the midpoint, which is the center of the perpendicular bisector.
- The equation of the perpendicular bisector will also be displayed.


3. **Rotate a Point Around a Center**  
   This option rotates a point around a specified center by a given angle (positive for counterclockwise, negative for clockwise).

- You will be asked to enter the **point to rotate** (x, y).
- Then, you will enter the **center of rotation** (x, y).
- Lastly, you will enter the **angle of rotation** in degrees.

The program will perform the rotation and display the new coordinates of the rotated point.


4. **Exit**  
   This option exits the program.


### Usage Example:
```plaintext
--- Rotation Calculator Menu ---
1. Find angle of rotation given base and transformed point (with optional center)
2. Find perpendicular bisector between two points
3. Rotate a point around a center by a given angle
4. Exit

Choose an option: 1

Enter the base point
x: 4
y: 4

Enter the transformed point
x: 0
y: 4

Enter the center of rotation cx (or press Enter to use (0,0)): 

Angle of rotation: 45.00°

--- Rotation Calculator Menu ---
1. Find angle of rotation given base and transformed point (with optional center)
2. Find perpendicular bisector between two points
3. Rotate a point around a center by a given angle
4. Exit

Choose an option: 2

Enter the first point
x: 4
y: 6

Enter the second point
x: 1
y: 7

Midpoint (center of perpendicular bisector): (2.5000, 6.5000)
Perpendicular bisector line equation: y = 3.0000x + -1.0000

--- Rotation Calculator Menu ---
1. Find angle of rotation given base and transformed point (with optional center)
2. Find perpendicular bisector between two points
3. Rotate a point around a center by a given angle
4. Exit

Choose an option: 3

Enter the point to rotate
x: 4
y: 4

Enter the center of rotation
x: 0
y: 0

Enter the angle of rotation in degrees (positive for counterclockwise, negative for clockwise): -90

Rotated point: (4.0000, -4.0000)

--- Rotation Calculator Menu ---
1. Find angle of rotation given base and transformed point (with optional center)
2. Find perpendicular bisector between two points
3. Rotate a point around a center by a given angle
4. Exit

Choose an option: 4

Goodbye!
```


## Classes Overview

### `Point`
- Represents a 2D point with `x` and `y` coordinates.
- **Methods**:
    - `getX()`: Returns the x-coordinate of the point.
    - `getY()`: Returns the y-coordinate of the point.
    - `setX(double x)`: Sets the x-coordinate of the point.
    - `setY(double y)`: Sets the y-coordinate of the point.
    - `distanceTo(Point other)`: Calculates the distance between this point and another point.
    - `rotateAround(Point center, double angleInDegrees)`: Rotates the point around a center by a given angle (in degrees).
    - `midpoint(Point other)`: Finds the midpoint between this point and another point.

### `RotationCalculator`
- The entry point of the program, responsible for displaying the main menu and running the program loop.
- **Methods**:
    - `run(String[] args)`: Runs the program, displaying the menu and handling user input.
    - `displayMenu()`: Displays the menu options to the user.

### `RotationOperations`
- Contains the core rotation and geometric operations, such as finding the angle of rotation, perpendicular bisector, and rotating points.
- **Methods**:
    - `findAngleOfRotation(Scanner scanner)`: Calculates the angle of rotation between a base point and a transformed point, with an optional center of rotation.
    - `findPerpendicularBisector(Scanner scanner)`: Finds the perpendicular bisector between two points.
    - `rotatePoint(Scanner scanner)`: Rotates a point around a center by a specified angle.
    - `promptPoint(Scanner scanner, String prompt)`: Helper method to prompt for a point's coordinates from the user.
    - `promptOptionalCenter(Scanner scanner)`: Helper method to prompt for an optional center point (default is (0, 0)).


## Contributing

I welcome contributions to improve this project! Feel free to submit a pull request or open an issue for suggestions or bug fixes.

To contribute, please fork the repository and create a new branch for your changes. Once your changes are ready, open a pull request with a description of your modifications.