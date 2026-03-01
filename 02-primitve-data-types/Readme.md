# 📌 Variables, Identifiers & Literals

---

## 🧠 1️⃣ What is a Variable?

A **variable** is a named memory location used to store data.
It holds a value that can change during the execution of a program.

> A variable is a container that stores a value.

### Example

```java
int age = 25;
```

When Java executes this:

1. Memory is allocated.
2. The value `25` is stored.
3. The name `age` is associated with that memory location.

Because the value can change, it is called a _variable_:

```java
age = 30;
```

---

## 🏷 2️⃣ What is an Identifier?

An **identifier** is the name used to identify:

- Variables
- Methods
- Classes
- Packages
- Interfaces

It is simply a label in the program.

### Example

```java
int age = 25;
```

- `age` → Identifier
- `int` → Keyword (data type)
- `25` → Literal

---

## 🔢 3️⃣ What is a Literal?

A **literal** is the actual fixed value written directly in the code.

Examples:

- `25` → Integer literal
- `99.99` → Double literal
- `"Hello"` → String literal
- `true` → Boolean literal

Example:

```java
int age = 25;
```

Here, `25` is a literal.

---

# 🔎 Variable vs Identifier

| Feature           | Variable                           | Identifier                        |
| ----------------- | ---------------------------------- | --------------------------------- |
| What it is        | A memory location that stores data | A name used to identify something |
| Stores value?     | ✅ Yes                             | ❌ No                             |
| Exists in memory? | ✅ Yes                             | ❌ No (only a name)               |
| Can refer to      | Data                               | Variables, methods, classes, etc. |

---

# 🔎 Identifier vs Literal

| Identifier                  | Literal               |
| --------------------------- | --------------------- |
| Name of something           | Actual value          |
| Does not store value itself | Represents fixed data |
| Example: `age`              | Example: `25`         |

---

## ⚡ Important Insight

- Every **variable name** is an identifier.
- But not every identifier is a variable.

Example:

```java
class Student {
    int rollNumber;
}
```

Identifiers:

- `Student` (class name)
- `rollNumber` (variable name)

Only `rollNumber` is a variable.

---

# 🏗 Structure of a Variable in Java

```
dataType variableName = value;
```

Example:

```java
double price = 99.99;
```

---

## 🎯 One-Line Summary

- **Variable** → Stores data
- **Identifier** → Name given to something
- **Literal** → Actual value

---

# 📌 Data Types in Java

A **data type** defines:

- What type of data a variable can store
- How much memory it occupies
- What operations can be performed on it

Java has **two main categories** of data types:

1. **Primitive Data Types**
2. **Non-Primitive (Reference) Data Types**

---

# 🟢 1️⃣ Primitive Data Types

Primitive data types are basic data types built into Java.
They store **actual values directly in memory**.

Java has **8 primitive types**.

---

## 🔢 A) Integer Types (Whole Numbers)

Used to store numbers without decimal points.

| Type    | Size    | Range (Approx)      |
| ------- | ------- | ------------------- |
| `byte`  | 1 byte  | -128 to 127         |
| `short` | 2 bytes | -32K to 32K         |
| `int`   | 4 bytes | ±2 billion          |
| `long`  | 8 bytes | Very large integers |

### Example

```java
int age = 25;
long population = 8000000000L;
```

---

## 🔣 B) Character Type

Used to store a single character.

| Type   | Size    |
| ------ | ------- |
| `char` | 2 bytes |

```java
char grade = 'A';
```

⚠ Characters are written in **single quotes**.

---

## 🔬 C) Real Numbers (Decimal Values)

Used to store numbers with decimal points.

| Type     | Size    | Precision           |
| -------- | ------- | ------------------- |
| `float`  | 4 bytes | ~6-7 decimal digits |
| `double` | 8 bytes | ~15 decimal digits  |

```java
float price = 99.5f;
double pi = 3.14159265359;
```

⚠ `float` requires `f` at the end.

---

## 🔘 D) Boolean Type

Stores only two values:

- `true`
- `false`

```java
boolean isLoggedIn = true;
```

---

## 🧠 Summary of Primitive Types

- Store **actual values**
- Fixed size
- Faster
- Stored in stack memory (for local variables)

---

# 🔵 2️⃣ Non-Primitive (Reference) Data Types

Non-primitive data types do **not store the actual data directly**.
They store a **reference (memory address)** to the actual object.

They are created by the programmer or provided by Java.

---

## Common Non-Primitive Types

- `String`
- Arrays
- Classes
- Interfaces
- Enums
- Objects

---

## 🧵 Example: String

```java
String name = "Ashish";
```

Here:

- `name` stores a reference
- `"Ashish"` is stored in heap memory

---

## 📦 Example: Array

```java
int[] numbers = {1, 2, 3};
```

`numbers` stores a reference to the array object.

---

## 🔎 Key Differences

| Feature            | Primitive       | Non-Primitive       |
| ------------------ | --------------- | ------------------- |
| Stores             | Actual value    | Reference (address) |
| Memory             | Stack (usually) | Heap                |
| Size               | Fixed           | Variable            |
| Can be null?       | ❌ No           | ✅ Yes              |
| Methods available? | ❌ No           | ✅ Yes              |

---

# 🎯 Final Summary

- **Primitive → simple values**
  - byte, short, int, long
  - float, double
  - char
  - boolean

- **Non-Primitive → objects & references**
  - String
  - Array
  - Classes
  - Interfaces

---
