# Copilot Coding Agent Instructions for Fabletestingrepo1

## Repository Overview

**Name:** Fabletestingrepo1  
**Purpose:** This is a minimal test repository used for testing and validation purposes.  
**Type:** Test/Example Repository  
**Size:** ~184KB  
**Primary Language:** Java  
**Repository URL:** https://github.com/Fabletest4/Fabletestingrepo1

### High-Level Description

This is a test repository containing a Java source file and documentation. The repository serves as a testing ground and may be expanded with additional code, tests, and build configurations in the future.

## Repository Structure

```
Fabletestingrepo1/
├── .github/
│   └── copilot-instructions.md (this file)
├── src/
│   └── OddCounter.java
└── README.md
```

### Key Files and Locations

- **README.md**: Root-level documentation file containing basic repository description
- **.github/**: Contains GitHub-specific configuration files
- **src/OddCounter.java**: Java source file for counting odd numbers

## Design System Standards

> **Enforcement:** All code and UI contributions MUST adhere to the following design system standards. GitHub Copilot should proactively apply and enforce these standards when generating or reviewing code. Any suggestions that deviate from these standards should be flagged and corrected.

### Color Palette

Use only the approved color tokens below. Do **not** use raw hex, RGB, or named CSS colors outside of the token definitions themselves.

| Token | Value | Usage |
|---|---|---|
| `--color-primary` | `#0969DA` | Primary actions, links, focus rings |
| `--color-primary-hover` | `#0550AE` | Primary action hover state |
| `--color-secondary` | `#6E7781` | Secondary text, subtle UI elements |
| `--color-success` | `#1A7F37` | Success states, confirmations |
| `--color-warning` | `#9A6700` | Warnings, caution indicators |
| `--color-danger` | `#CF222E` | Errors, destructive actions |
| `--color-neutral-0` | `#FFFFFF` | Page/card backgrounds |
| `--color-neutral-100` | `#F6F8FA` | Subtle background fills |
| `--color-neutral-200` | `#EAEEF2` | Borders, dividers |
| `--color-neutral-900` | `#1F2328` | Primary body text |

**Rules:**
- Always reference tokens by their CSS custom-property name (e.g., `var(--color-primary)`).
- Support both light and dark themes by defining token overrides inside a `[data-theme="dark"]` selector.
- Never hard-code a color value inline in a component.

### Typography

| Token | Value | Usage |
|---|---|---|
| `--font-family-base` | `'Inter', system-ui, sans-serif` | All body text |
| `--font-family-mono` | `'JetBrains Mono', 'Fira Code', monospace` | Code, identifiers |
| `--font-size-xs` | `0.75rem` (12px) | Labels, badges |
| `--font-size-sm` | `0.875rem` (14px) | Secondary/helper text |
| `--font-size-md` | `1rem` (16px) | Base body text |
| `--font-size-lg` | `1.125rem` (18px) | Sub-headings |
| `--font-size-xl` | `1.25rem` (20px) | Section headings |
| `--font-size-2xl` | `1.5rem` (24px) | Page headings |
| `--font-size-3xl` | `2rem` (32px) | Display headings |
| `--font-weight-regular` | `400` | Body copy |
| `--font-weight-medium` | `500` | Emphasis, labels |
| `--font-weight-semibold` | `600` | Headings, CTAs |
| `--font-weight-bold` | `700` | Strong emphasis only |
| `--line-height-tight` | `1.25` | Headings |
| `--line-height-base` | `1.5` | Body text |

**Rules:**
- Use semantic HTML heading levels (`<h1>`–`<h6>`) in document order; never skip levels.
- Do not mix font families within a single component.
- Minimum body text size is `--font-size-sm` (14px).

### Spacing & Layout

The spacing scale is based on a **4px base unit**. Only use values from the scale below.

| Token | Value | Usage |
|---|---|---|
| `--space-1` | `4px` | Tight internal padding |
| `--space-2` | `8px` | Default icon gap, small padding |
| `--space-3` | `12px` | Compact component padding |
| `--space-4` | `16px` | Standard component padding |
| `--space-5` | `20px` | Medium separation |
| `--space-6` | `24px` | Section padding |
| `--space-8` | `32px` | Large section separation |
| `--space-10` | `40px` | XL separation |
| `--space-12` | `48px` | Page-level margins |
| `--space-16` | `64px` | Hero/display sections |

**Grid system:**
- Use a **12-column grid** with a `24px` gutter and `16px` outer margins on desktop.
- On mobile (< 768px): collapse to a single column with `16px` outer margins.
- Max page content width: `1280px`, centered.

**Rules:**
- Never use magic numbers for spacing; always reference a spacing token.
- Use CSS Grid for two-dimensional layouts and Flexbox for one-dimensional alignment.

### Component Design Patterns

#### Buttons

```
Primary   → filled background (--color-primary), white label
Secondary → outlined border (--color-primary), transparent background
Danger    → filled background (--color-danger), white label
Ghost     → no border/background, (--color-primary) label, hover fill
```

- Minimum touch target: **44×44px** (WCAG 2.5.5).
- Always include a visible `:focus-visible` ring using `--color-primary` with `2px` offset.
- Disabled state: `opacity: 0.5`, `cursor: not-allowed`, `pointer-events: none`.
- Loading state: replace label with a spinner; keep button dimensions stable.

#### Forms & Inputs

- Label every input with a visible `<label>` element; never rely solely on `placeholder`.
- Show validation errors inline below the field using `--color-danger` and an error icon.
- Group related fields with `<fieldset>` / `<legend>`.
- Required fields must be marked with `aria-required="true"`.

#### Cards

- Use `4px` (`--space-1`) border-radius for subtle rounding; `8px` for prominent cards.
- Card shadows: `0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.08)`.
- Always include a logical focus order within interactive card content.

#### Icons

- Use only SVG icons from the approved icon library (Octicons or equivalent).
- Decorative icons: `aria-hidden="true"`.
- Meaningful icons (used alone as actions): provide `aria-label` on the parent element.
- Default icon size: `16px`; large context: `24px`.

### Naming Conventions

#### Files & Directories

| Type | Convention | Example |
|---|---|---|
| Java class | `PascalCase` | `OddCounter.java` |
| JavaScript/TypeScript module | `camelCase` | `oddCounter.ts` |
| React component file | `PascalCase` | `OddCounter.tsx` |
| CSS/SCSS module | `kebab-case` | `odd-counter.module.css` |
| Test file | Same name + `.test` / `_test` | `OddCounter.test.java` |
| Config file | `kebab-case` | `build-config.json` |

#### Code Symbols

| Symbol type | Convention | Example |
|---|---|---|
| Java class / interface | `PascalCase` | `OddCounter`, `Countable` |
| Java method / variable | `camelCase` | `countOdd()`, `inputNumber` |
| Java constant | `UPPER_SNAKE_CASE` | `MAX_INPUT_SIZE` |
| CSS class | `kebab-case` | `.odd-counter__result` |
| CSS custom property | `--kebab-case` | `--color-primary` |
| JavaScript variable | `camelCase` | `oddCount` |
| JavaScript constant | `UPPER_SNAKE_CASE` | `MAX_INPUT_SIZE` |
| React component | `PascalCase` | `OddCounter` |

#### BEM for CSS

Follow **BEM** (Block–Element–Modifier) for all CSS class names:

```
.block {}
.block__element {}
.block--modifier {}
.block__element--modifier {}
```

### Accessibility (a11y) Requirements

All code MUST meet **WCAG 2.1 Level AA** as a minimum. Copilot should flag any generated code that violates these rules.

- **Color contrast:** text on background ≥ 4.5:1 (normal text), ≥ 3:1 (large text/UI components).
- **Keyboard navigation:** every interactive element must be reachable and operable by keyboard alone.
- **Focus management:** visible focus indicators on all interactive elements; manage focus on modal open/close.
- **ARIA usage:** prefer semantic HTML over ARIA; use ARIA only when no native HTML element is available.
- **Images:** all `<img>` elements must have descriptive `alt` text; decorative images use `alt=""`.
- **Motion:** wrap animations in `@media (prefers-reduced-motion: reduce)` and disable or simplify them.
- **Form errors:** errors must be announced to screen readers via `aria-live` or `role="alert"`.

### Code Quality & Style Standards

#### General

- Maximum line length: **120 characters**.
- Indentation: **4 spaces** (no tabs) for Java; **2 spaces** for JSON, YAML, HTML, CSS, JS/TS.
- All files must end with a single newline character.
- No trailing whitespace.

#### Java

- Follow the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html) (version current as of 2026; pin to a specific revision if the guide updates and introduces breaking conflicts).
- Every public class and method must have a Javadoc comment.
- Avoid raw types; always parameterize generic types.
- Use `try-with-resources` for all `Closeable` resources (e.g., `Scanner`).
- Prefer `final` variables and parameters where mutation is not needed.
- No `System.exit()` calls outside of `main()`; throw exceptions instead.

#### JavaScript / TypeScript

- Use **TypeScript** for all new JavaScript code.
- Enable `strict` mode in `tsconfig.json`.
- No `any` type; prefer `unknown` with type guards.
- Use `const` by default; `let` only when reassignment is necessary; never `var`.
- Arrow functions for callbacks; named functions for module exports.

#### CSS / SCSS

- Write styles in **CSS Modules** or **SCSS**; no global stylesheet pollution.
- Place design token imports at the top of each stylesheet.
- Mobile-first media queries.

### Git Commit Standards

Follow the **Conventional Commits** specification:

```
<type>(<scope>): <short summary>

[optional body]

[optional footer]
```

Allowed types: `feat`, `fix`, `docs`, `style`, `refactor`, `test`, `chore`, `ci`.

Examples:
```
feat(counter): add support for negative numbers
fix(ui): correct focus ring color to use --color-primary
docs(readme): update build instructions
```

- Subject line: imperative mood, ≤ 72 characters, no trailing period.
- Reference GitHub issues in the footer: `Fixes #42`.

## Build, Test, and Validation

### Current State

**Java source files present; no build system configured yet.**

| Area | Status |
|---|---|
| Build scripts | ❌ Not configured |
| Test framework | ❌ Not configured |
| Linters / formatters | ❌ Not configured |
| CI/CD pipelines | ❌ Only Copilot coding agent workflow |

### GitHub Actions Workflows

**Active Workflows:**
1. **Copilot coding agent** - Dynamic workflow for Copilot-assisted development
   - Path: `dynamic/copilot-swe-agent/copilot`
   - Status: Active
   - Purpose: Enables GitHub Copilot coding agent functionality

### When Dependencies Are Added

Before adding any dependency, check the security advisory database. Common patterns:

| Language | Install command | Build command | Test command |
|---|---|---|---|
| Java (Maven) | — | `mvn clean install` | `mvn test` |
| Java (Gradle) | — | `./gradlew build` | `./gradlew test` |
| Node.js | `npm install` | `npm run build` | `npm test` |
| Python | `pip install -r requirements.txt` | — | `pytest` |

Always run dependency installation before build/test commands.

## Development Workflow

### Making Changes

1. Apply all **Design System Standards** listed above before raising a PR.
2. Commit using **Conventional Commits** format (see Design System Standards → Git Commit Standards).
3. Keep changes small and focused; one logical change per commit.

### Git Workflow

- **Default branch:** `main`
- **Feature branches:** follow pattern `copilot/*` or `feature/<short-description>`
- **Protected branches:** None currently configured

## Quick Reference Commands

```bash
# Compile Java source (from repo root, once Maven is configured)
# mvn clean compile

# Run tests
# mvn test

# Package JAR
# mvn package
```

## Trust These Instructions

These instructions are accurate as of the last update. Only perform additional searches if:
- The information here is incomplete for your specific task
- You encounter errors that contradict these instructions
- The repository structure has significantly changed since this was written

When in doubt, verify file existence and current state, but trust that this document reflects the baseline repository configuration.

---

*Last Updated: 2026-02-26*  
*Repository State: Java source present; design system standards enforced*
