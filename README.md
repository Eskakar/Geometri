----# Aplikasi Kalkulator Geometri 📐

  

A comprehensive desktop application built with Java Swing for calculating the properties of a wide variety of 2D and 3D geometric shapes. This project demonstrates advanced GUI concepts, object-oriented design, and multithreading for efficient bulk processing.

-----

## 📋 Table of Contents

  * [Key Features](https://www.google.com/search?q=%23-key-features)
  * [Screenshots](https://www.google.com/search?q=%23-screenshots)
  * [Technology Stack](https://www.google.com/search?q=%23-technology-stack)
  * [Project Structure](https://www.google.com/search?q=%23-project-structure)
  * [How to Run](https://www.google.com/search?q=%23-how-to-run)
  * [Code Modules Overview](https://www.google.com/search?q=%23-code-modules-overview)
  * [License](https://www.google.com/search?q=%23-license)

-----

## ✨ Key Features

  * **Dual Calculation Modes**:
      * **Manual Mode**: Select a specific shape, enter its parameters, and get instant calculations for its properties.
      * **Random Mode**: Generate a large number of random shapes and process them all at once.
  * **Extensive Shape Library**: 📚 Supports a total of **31 different geometric shapes**, including:
      * **2D Shapes**: Triangle, Square, Circle, Trapezoid, and more.
      * **3D Shapes**: Sphere, Cylinder, Cone, Pyramids (`Limas`), and Prisms (`Prisma`) with various bases.
      * **Complex Shapes**: Frustums, Segments and Sectors of Circles and Spheres.
  * **Parallel Processing**: ⚡️ Utilizes Java's Executor Framework (`ExecutorService`) to perform bulk calculations in the Random Mode across multiple CPU cores, significantly speeding up the processing time.
  * **Dynamic User Interface**: 🖥️ The UI dynamically adapts based on user selections, showing only the required input fields for the chosen shape, powered by Java Swing's `CardLayout` and `GridBagLayout`.

-----

## 📸 Screenshots

*(These are placeholder descriptions of what the application's UI looks like.)*

| Mode Selection                                     | Manual Input (Segitiga)                            | Random Mode Input                                 | Results View                                       |
| -------------------------------------------------- | -------------------------------------------------- | ------------------------------------------------- | -------------------------------------------------- |
|  |  |  |  |
| *Initial screen to choose between Manual or Random mode.* | *Dynamically generated fields for a Triangle's parameters.* | *Simple input for the number of random shapes to generate.* | *Formatted, scrollable results from the calculations.* |

-----

## 🛠️ Technology Stack

  * **Core Language**: Java
  * **User Interface**: Java Swing
  * **Concurrency**: Java Executor Framework

-----

## 📂 Project Structure

The project is organized into distinct packages to separate concerns (Model-View), making it clean and maintainable.

```
project-root/
├── src/
│   ├── geometri/
│   │   ├── BangunDatar.java      # Base abstract class for 2D shapes
│   │   ├── BangunRuang.java      # Base interface for 3D shapes
│   │   ├── Segitiga.java
│   │   ├── Bola.java
│   │   ├── LimasPersegi.java
│   │   └── ... (and 28+ other shape classes)
│   │
│   ├── view/
│   │   └── MainGUI.java          # The main class, controls all UI and events
│   │
│   └── threading/
│       └── ThreadExecutor.java   # Handles parallel processing of shapes
│
└── README.md
```

-----

## 🚀 How to Run

### Prerequisites

  * Java Development Kit (JDK) version 17 or higher.

### Steps

1.  **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/aplikasi-geometri.git
    cd aplikasi-geometri
    ```

2.  **Compile the source files:**
    Open a terminal in the project's root directory and run the following command. This will compile all `.java` files from the `src` directory and place the `.class` files into a `bin` directory.

    ```sh
    # For Windows
    javac -d bin src\geometri\*.java src\geometri\view\*.java src\threading\*.java

    # For macOS/Linux
    javac -d bin src/geometri/*.java src/geometri/view/*.java src/threading/*.java
    ```

3.  **Run the application:**
    Once compiled, run the `MainGUI` class from the `bin` directory.

    ```sh
    # For Windows
    java -cp bin geometri.view.MainGUI

    # For macOS/Linux
    java -cp bin geometri.view.MainGUI
    ```

    The application window should now appear.

-----

## 🧠 Code Modules Overview

  * **`geometri.view.MainGUI`**
    This is the heart of the application. It is a `JFrame` that manages all UI components, event listeners, and the `CardLayout` for switching between panels. It handles user input for both manual and random modes and orchestrates the calculation process.

  * **`geometri` (Package)**
    This package acts as the "Model". It contains the class definitions for all 31 geometric shapes.

      * Each class holds its own properties (e.g., `radius`, `height`).
      * Each class is responsible for its own calculation logic (e.g., `hitungLuas()`, `hitungVolume()`).
      * Inheritance is used effectively, with base classes like `BangunDatar` and interfaces like `BangunRuang`.

  * **`threading.ThreadExecutor`**
    This class contains the static `processShapes` method, which is responsible for the multithreaded calculations.

      * It creates a fixed-size thread pool (`Executors.newFixedThreadPool`).
      * It iterates through a list of `Geometri` objects, submitting each one as a separate task to the thread pool.
      * It collects the results asynchronously using `Future<String>` objects, ensuring the main UI thread remains responsive while calculations are performed in the background.:w
      

-----

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](https://www.google.com/search?q=LICENSE) file for details.