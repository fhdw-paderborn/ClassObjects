# ClassObjects

A simple Java project demonstrating object-oriented programming concepts with classes and objects. This project includes a Student class implementation and UML diagrams to visualize the class structure.

## Project Overview

This project demonstrates how to:
- Create and use Java classes
- Implement object instances
- Model real-world entities as code
- Visualize class structures with PlantUML

## Java Classes and Objects

### What are Classes and Objects?

In Java, a class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects of that class will have. An object is an instance of a class.

Think of a class as a cookie cutter, and objects as the cookies made from it - each cookie has the same shape but can have different decorations or flavors.

### Key Concepts

- **Class**: The template that defines attributes and methods
- **Object**: An instance of a class
- **Attributes**: Variables that store data about the object
- **Methods**: Functions that define the behavior of the object
- **Constructor**: Special method to initialize new objects
- **Encapsulation**: Hiding internal state through private variables and public methods

### Using Classes and Objects in Java

1. **Define a class**:
```java
public class Student {
    private int age;
    private String name;
    
    // Constructor
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    // Methods
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
```

2. **Create objects (instances)**:
```java
Student max = new Student(20, "Max Mustermann");
Student hannah = new Student(21, "Hannah Mustermann");
```

3. **Access methods and properties**:
```java
max.setAge(22);
hannah.setName("Hannah Schmidt");
```

## PlantUML

PlantUML is an open-source tool that allows you to create UML diagrams from a simple text language.

### Installation

1. **Prerequisites**:
   - Java Runtime Environment (JRE)
   - Graphviz (for some diagram types)

2. **Installation options**:
   - Download standalone JAR from [PlantUML website](https://plantuml.com/download)
   - Install via package managers:
     - macOS: `brew install plantuml`
     - Linux: `apt-get install plantuml` (Debian/Ubuntu)
   - Use as a plugin in IDEs:
     - IntelliJ IDEA (PlantUML integration plugin)
     - Visual Studio Code (PlantUML extension)
     - Eclipse (PlantUML plugin)

### How to Use PlantUML

1. **Create a .puml file** with your diagram definition:
```
@startuml Class_Example
class Student {
  - age: int
  - name: String
  + Student(int age, String name): void
  + setAge(int age): void
  + setName(String name): void
}
@enduml
```

2. **Generate the diagram**:
   - Command line: `java -jar plantuml.jar file.puml`
   - IDE: Use the plugin's preview or export functions
   - Online: Use the [PlantUML web server](http://www.plantuml.com/plantuml/uml/)

3. **PlantUML Syntax**:
   - Class members:
     - `+` public
     - `-` private
     - `#` protected
   - Relationships:
     - `--` association
     - `<|--` inheritance
     - `*--` composition
     - `o--` aggregation

For more details, visit the [PlantUML website](https://plantuml.com/).

## Code Formatting in VS Code

Visual Studio Code offers powerful code formatting capabilities to keep your Java code clean and consistent.

### Setting Up Java Formatter

1. **Install Java Extension Pack**:
   - Open VS Code
   - Go to Extensions (Ctrl+Shift+X or Cmd+Shift+X on macOS)
   - Search for "Java Extension Pack" and install it

2. **Configure Formatter Settings**:
   - Open Settings (Ctrl+, or Cmd+, on macOS)
   - Search for "java format"
   - Customize settings like tab size, indentation, and line wrapping

3. **Format Options**:
   - Format current file: Right-click and select "Format Document" or use Shift+Alt+F (Windows/Linux) or Shift+Option+F (macOS)
   - Format selection: Select code, right-click and choose "Format Selection" or use Ctrl+K Ctrl+F (Windows/Linux) or Cmd+K Cmd+F (macOS)
   - Format on save: Enable "Editor: Format On Save" in Settings

4. **Configure Java-specific formatting rules**:
   - Create a formatter profile XML file:
     - Export from Eclipse or download a template
     - In VS Code settings, set "java.format.settings.url" to the path of your XML file

5. **Keyboard Shortcuts for Formatting**:
   - Format document: Shift+Alt+F (Windows/Linux) or Shift+Option+F (macOS)
   - Format selection: Ctrl+K Ctrl+F (Windows/Linux) or Cmd+K Cmd+F (macOS)

Consistent formatting helps maintain code readability and makes collaboration easier across development teams.