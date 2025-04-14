# 📘 nextLine and next in Java

In this project, we will learn how to correctly take input from a string that comprises multiple words in Java. This includes understanding the **difference between `next()` and `nextLine()`** and how to **clear the input buffer** when switching between different types of input.

---

## 📚 What You'll Learn
- How to read integer input
- How to read full-line string input
- Why `Scanner.nextLine()` behaves differently from `Scanner.next()`
- How to avoid common input-skipping bugs

---

## 🧠 Concept Overview

In Java, the `Scanner` class provides two commonly used methods:
- `next()` – reads input **until a space**
- `nextLine()` – reads the **entire line**, including spaces

When switching from `nextInt()` or `next()` to `nextLine()`, it's necessary to consume the remaining newline character (`\n`) to avoid input issues.

---

## 🔗 Additional Resource
Refer to this [StackOverflow post](https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextint) to better understand the problem and solution.

---

## 💻 Examples
`Input:`
5
Geeks For Geeks

`Output:`
5
Geeks For Geeks

---
### ✅ Example 1:
`Input:`
102
I am learning Java

`Output:`
102
I am learning Java

---
