# Copilot Instructions for Fabletestingrepo1

## Repository Overview

This is a simple Java utility repository. It contains a single program, `OddCounter`, that reads a list of integers from the user and counts how many of them are odd.

## Project Structure

```
Fabletestingrepo1/
├── README.md
└── src/
    └── OddCounter.java   # Single source file with main entry point
```

## Language & Runtime

- **Language**: Java
- **Standard library only**: Uses `java.util.Scanner` for input; no external dependencies.
- **Minimum Java version**: Java 8+ (no features requiring a newer version are used).

## Build

There is no build tool (Maven, Gradle, Ant) configured. Compile manually with `javac`:

```bash
# From the repository root
javac src/OddCounter.java -d out/
```

## Run

```bash
# After compiling to out/
java -cp out OddCounter
```

The program will prompt:
1. Enter the number of elements.
2. Enter each number on a new line (or space-separated).
3. It prints the count of odd numbers.

## Testing

There is no test framework configured. When adding tests, prefer **JUnit 5** (add it as a dependency first). Place test files under `src/test/` following the standard Maven convention, e.g.:

```
src/
├── main/java/OddCounter.java
└── test/java/OddCounterTest.java
```

## Linting / Code Style

No linting or formatter is configured. Follow standard Java conventions:
- 4-space indentation.
- Class names in `UpperCamelCase`, method/variable names in `lowerCamelCase`.

## Key Source File

### `src/OddCounter.java`

- Reads an integer `n` (number of elements) from stdin.
- Reads `n` integers and counts those where `number % 2 != 0`.
- Prints the final count to stdout.
- Closes the `Scanner` before exiting.

## CI/CD

No GitHub Actions workflows exist yet. When adding one, place it under `.github/workflows/`. A minimal workflow to compile and run the program would use `actions/setup-java` to install a JDK.

## Contributing Guidelines

- Keep changes focused on the existing utility or clearly scope new utilities in their own classes.
- If adding a build tool (Maven/Gradle), update this file with the new build/test commands.
- Prefer backward-compatible Java features unless a newer baseline is explicitly adopted.
