# Translation of Points

This project implements basic point translation operations in a 2D coordinate system. It provides functionality to translate points and calculate translations between two points. The program operates via a command-line interface (CLI), allowing users to input points, apply translations, and calculate translation vectors interactively.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
    - [Point](#point)
    - [TranslationManager](#translationmanager)
    - [TranslationDisplay](#translationdisplay)
    - [TranslationOfPoints](#translationofpoints)
- [Contributing](#contributing)

## Features

- **Translate Points**: Translate one or more points by specified vectors.
- **Calculate Translations**: Given two points, calculate the translation that moves the base point to the transformed point.
- **Interactive Menu**: Choose options from a user-friendly menu to perform various operations.


### Requirements

- **Java 17** or higher.
- **IDE**: IntelliJ IDEA, Eclipse, or any other Java IDE.


## Usage

Upon running the program, you'll be presented with the following interactive menu:

```plaintext
Menu:
1. Translate a point
2. Calculate translation
3. Exit
Enter your choice (1/2/3): 
```

### Option 1: Translate a point
This option allows you to translate a point by entering a translation (x, y). After entering the point and the translation, the program will display the original and translated points.

### Option 2: Calculate translation
This option calculates the translation required to move a base point to a transformed point. The program will ask for both points, and then display the translation vector.

### Option 3: Exit
Select this option to exit the program.


## Classes Overview

### `Point`
- Represents a 2D point with `x` and `y` coordinates.
- **Methods**:
    - `display()`: Displays the point in the format `(x, y)`.

### `TranslationManager`
- Handles the core logic for translation operations.
- **Methods**:
    - `translatePoint(Point point, double tx, double ty)`: Translates a point by the given vector `(tx, ty)`.
    - `calculateTranslation(Point basePoint, Point transformedPoint)`: Calculates the translation vector between two points.

### `TranslationDisplay`
- Manages user interaction and displays the menu.
- **Methods**:
    - `start()`: Starts the program, displays the menu, and handles user input.
    - `translatePoints(Scanner scanner)`: Handles the translation of multiple points.
    - `calculateTranslations(Scanner scanner)`: Handles the calculation of translation vectors between multiple points.

### `TranslationOfPoints`
- The entry point of the program, which starts the `TranslationDisplay`.

## Contributing

Feel free to fork the repository, make improvements, and submit pull requests. If you find any bugs or have feature requests, please open an issue.
