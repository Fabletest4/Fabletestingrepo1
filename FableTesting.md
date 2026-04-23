# Advanced Markdown File with UI Code Examples

This Markdown document demonstrates more complex examples, including UI components with buttons, headings, and interactivity.

#### Introduction

Below are richer code examples that go beyond simple scripts and show structured UI-like behavior.

---

## Example: HTML + CSS + JavaScript UI

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sample UI</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      padding: 20px;
      background-color: #f5f5f5;
    }

    .card {
      background: white;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 4px 10px rgba(0,0,0,0.1);
      max-width: 400px;
    }

    h1 {
      margin-top: 0;
    }

    button {
      padding: 10px 15px;
      border: none;
      border-radius: 6px;
      cursor: pointer;
      margin-top: 10px;
    }

    .primary {
      background-color: #007bff;
      color: white;
    }

    .secondary {
      background-color: #6c757d;
      color: white;
    }
  </style>
</head>
<body>
  <div class="card">
    <h1>Welcome</h1>
    <p id="message">Click a button to interact.</p>

    <button class="primary" onclick="sayHello()">Say Hello</button>
    <button class="secondary" onclick="resetMessage()">Reset</button>
  </div>

  <script>
    function sayHello() {
      document.getElementById("message").innerText = "Hello there! 👋";
    }

    function resetMessage() {
      document.getElementById("message").innerText = "Click a button to interact.";
    }
  </script>
</body>
</html>
```

---

## Example: React Component

```jsx
import React, { useState } from "react";

export default function App() {
  const [count, setCount] = useState(0);

  return (
    <div style={styles.container}>
      <h1>Counter App</h1>
      <h2>{count}</h2>

      <div style={styles.buttonGroup}>
        <button style={styles.primary} onClick={() => setCount(count + 1)}>
          Increment
        </button>

        <button style={styles.secondary} onClick={() => setCount(count - 1)}>
          Decrement
        </button>

        <button style={styles.reset} onClick={() => setCount(0)}>
          Reset
        </button>
      </div>
    </div>
  );
}

const styles = {
  container: {
    textAlign: "center",
    padding: "20px",
  },
  buttonGroup: {
    display: "flex",
    gap: "10px",
    justifyContent: "center",
  },
  primary: {
    padding: "10px",
    backgroundColor: "#007bff",
    color: "white",
    border: "none",
    borderRadius: "5px",
  },
  secondary: {
    padding: "10px",
    backgroundColor: "#6c757d",
    color: "white",
    border: "none",
    borderRadius: "5px",
  },
  reset: {
    padding: "10px",
    backgroundColor: "#dc3545",
    color: "white",
    border: "none",
    borderRadius: "5px",
  },
};
```

---

## Example: Python CLI Menu

```python
def menu():
    print("\n=== Menu ===")
    print("1. Say Hello")
    print("2. Add Numbers")
    print("3. Exit")


def say_hello():
    print("Hello! 👋")


def add_numbers():
    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    print(f"Result: {a + b}")


while True:
    menu()
    choice = input("Choose an option: ")

    if choice == "1":
        say_hello()
    elif choice == "2":
        add_numbers()
    elif choice == "3":
        print("Goodbye!")
        break
    else:
        print("Invalid choice.")
```

---

## Conclusion

This document now includes:

* Interactive UI (HTML/JS)
* Component-based UI (React)
* Command-line interaction (Python)

You can adapt these patterns for real projects like dashboards, tools, or apps.
