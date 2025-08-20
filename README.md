# 🚀 Selenium WebDriver Automation Suite

A comprehensive collection of Web UI Automation scripts using Selenium WebDriver with Java. This project demonstrates core automation fundamentals, advanced user interactions, and best practices for building robust test frameworks.

**📍 Key Highlight:** This isn't just theory! Every concept is implemented with practical, runnable examples that handle real-world web application behaviors.

---

## 🧰 Technologies Used

| Technology | Purpose |
| :--- | :--- |
| **Selenium WebDriver** | Core browser automation |
| **Java** | Programming language |
| **TestNG** | Test framework and assertions |
| **Maven** | Dependency management |
| **Actions Class** | Advanced mouse/keyboard interactions |

---

## ⚡ Features Demonstrated

### 🌐 Browser & Driver Management
- **Reusable `DriverSetup`** for cross-browser initialization (Chrome, Firefox, Edge).
- Browser operations: launch, maximize, minimize, fullscreen, and quit.
- Navigation: forward, back, refresh.

### 🧩 Web Element Interaction & Locators
- **Locator Strategies:** `id`, `name`, `className`, `xpath`, `cssSelector`, `linkText`.
- **Core Actions:** `click()`, `sendKeys()`, `getText()`, `getAttribute()`, `isDisplayed()`.
- **Custom Utility:** Implemented a reusable `getElement(By locator)` method for cleaner code.

### ⏳ Synchronization Strategies (Waits)
- **Implicit Wait:** Global wait for element presence.
- **Explicit Wait:** **`WebDriverWait`** with `ExpectedConditions` (e.g., waiting for element to be clickable, visible, or for specific text).
- Comparison of efficient explicit waits vs. static `Thread.sleep()`.

### 🖱️ Advanced User Interactions
- **Actions Class** for complex scenarios:
  - Mouse Hover (`moveToElement()`)
  - Right-Click & Double-Click
  - Drag and Drop
  - Handling iFrames
  - **Copy-Paste using Keyboard Actions** (`keyDown(Keys.CONTROL).sendKeys("c")...`)

### 📑 Dropdowns, Alerts, and Windows
- **Dropdown Handling** with `Select` class: `selectByIndex()`, `selectByValue()`, `selectByVisibleText()`.
- **Alert Handling:** accept, dismiss, get text, and send keys to prompt alerts.
- **Window Management:** Switching between multiple windows/tabs using `getWindowHandle()` and `getWindowHandles()`.

### 🔧 Test Framework Basics
- **TestNG** integration for structured test case design.
- Using **Assertions** (`Assert.assertEquals()`, `Assert.assertTrue()`) for validation.

---

## 📁 Project Structure

- src/test/java/org/example/
- ├── tests/ (All your test classes go here)
- │   ├── CopyPasteActionsTests.java
│   ├── ImplicitWaitTests.java
│   ├── InteractingWithAlert.java
│   ├── InteractingWithDropDownMenu.java
│   ├── InteractingWithWebBrowser.java
│   ├── InteractingWithWebElement.java
│   ├── ManagingBrowser.java
│   ├── TestNGExamples.java
│   ├── WebTestWithMainMethod.java // Consider renaming to e.g., BasicTest.java
│   ├── WebTestWithoutMethod.java   // Consider renaming or combining
│   └── iFrameActionsTests.java
│
├── base/ (Core setup classes)
│   └── DriverSetup.java // Perfect name!
│
└── utils/ (Helper classes)
    └── HelperMethods.java // Perfect name!
