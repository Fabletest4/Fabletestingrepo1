# Copilot Coding Agent Instructions for Fabletestingrepo1

## Repository Overview

**Name:** Fabletestingrepo1  
**Purpose:** This is a minimal test repository used for testing and validation purposes.  
**Type:** Test/Example Repository  
**Size:** ~184KB  
**Primary Language:** None (minimal repository with only documentation)  
**Repository URL:** https://github.com/Fabletest4/Fabletestingrepo1

### High-Level Description

This is a minimal test repository containing only a README.md file. The repository serves as a testing ground and may be expanded with additional code, tests, and build configurations in the future.

## Repository Structure

```
Fabletestingrepo1/
├── .github/
│   └── copilot-instructions.md (this file)
└── README.md
```

### Key Files and Locations

- **README.md**: Root-level documentation file containing basic repository description
- **.github/**: Contains GitHub-specific configuration files

## Build, Test, and Validation

### Current State

**No build system currently configured.** This repository does not currently have:
- Build scripts or configuration
- Test frameworks or test files
- Linters or code quality tools
- Package managers (npm, pip, cargo, etc.)
- CI/CD pipelines beyond the GitHub Copilot coding agent workflow

### GitHub Actions Workflows

**Active Workflows:**
1. **Copilot coding agent** - Dynamic workflow for Copilot-assisted development
   - Path: `dynamic/copilot-swe-agent/copilot`
   - Status: Active
   - Purpose: Enables GitHub Copilot coding agent functionality

**Note:** There are no standard CI/CD workflows (build, test, lint) configured yet.

### If/When Dependencies Are Added

When this repository is expanded with actual code:

1. **Before adding any dependencies**, check what language/framework is being used
2. **Common patterns to expect:**
   - Node.js projects: Look for `package.json`, run `npm install` before `npm run build` or `npm test`
   - Python projects: Look for `requirements.txt` or `pyproject.toml`, run `pip install -r requirements.txt`
   - Go projects: Run `go mod download` before `go build`
   - Rust projects: Run `cargo build` (automatically handles dependencies)
   - Java/Maven: Run `mvn install` or `mvn clean install`

3. **Always run dependency installation before build/test commands**

## Development Workflow

### Making Changes

Since this is a minimal repository:

1. **No pre-commit hooks configured** - Changes can be committed directly
2. **No formatting requirements** - No automatic code formatters configured
3. **No tests to run** - Test infrastructure not yet present

### Git Workflow

- **Default branch:** `main`
- **Current working branch:** Feature branches follow pattern `copilot/*`
- **Protected branches:** None currently configured

## Important Notes and Gotchas

### What Works
✅ Direct file modifications  
✅ Git operations (commit, push, pull)  
✅ Creating new files and directories  

### What Doesn't Exist Yet
❌ Build system  
❌ Test framework  
❌ Linters or code quality checks  
❌ Dependency management  
❌ CI/CD validation pipelines  

### Environment Setup

**No special environment setup required.** Since this is a minimal repository:
- No runtime dependencies to install
- No environment variables to configure
- No IDE-specific configurations present

## Recommendations for Future Development

When expanding this repository:

1. **Add a build system:**
   - Create appropriate build configuration files (package.json, Cargo.toml, etc.)
   - Document build commands in this file
   - Add build time estimates if commands take >30 seconds

2. **Add testing:**
   - Set up test framework appropriate to the language
   - Document test execution commands
   - Note any test-specific environment requirements

3. **Add CI/CD:**
   - Create `.github/workflows/` directory
   - Add workflows for build, test, lint
   - Document expected CI behavior

4. **Add code quality tools:**
   - Configure linters (ESLint, Pylint, Clippy, etc.)
   - Add formatters (Prettier, Black, rustfmt, etc.)
   - Document required code quality standards

## Quick Reference Commands

**Current repository has no standard commands.** As the repository evolves, document key commands here:

```bash
# Example format for future use:
# Bootstrap: <command to set up environment>
# Install: <command to install dependencies>
# Build: <command to build the project>
# Test: <command to run tests>
# Lint: <command to run linters>
# Run: <command to start the application>
```

## Trust These Instructions

These instructions are accurate as of the last update. Only perform additional searches if:
- The information here is incomplete for your specific task
- You encounter errors that contradict these instructions
- The repository structure has significantly changed since this was written

When in doubt, verify file existence and current state, but trust that this document reflects the baseline repository configuration.

---

*Last Updated: 2026-01-21*  
*Repository State: Minimal/Initial - Single README.md file*
