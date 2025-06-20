
# QuizHelix — Java Console Quiz Application

Welcome to **QuizHelix**, a simple Java console application that quizzes users on South African general knowledge. The app asks for your name and age, then presents 10 randomized questions out of 15, with answer options shuffled each time.

---

## Features

* **15 questions** in the question bank.
* Each quiz session presents **10 random questions**.
* The **answer options are randomized** for each question.
* Input validation with error handling (e.g., for invalid age or answers).
* Score calculation with grading based on percentage:

  * 0–39%: Failed
  * 40–49%: Supplementary
  * 50–79%: Passed
  * 80–100%: Distinction

---

## Project Structure

| File                   | Description                                                                                  |
| ---------------------- | -------------------------------------------------------------------------------------------- |
| `Main.java`            | Entry point of the application. Calls welcome message.                                       |
| `Welcome.java`         | Handles user greeting, input collection, and starts quiz.                                    |
| `Quiz.java`            | Contains quiz logic: loads questions, randomizes, processes answers, and calculates results. |
| `CreateQuestions.java` | Stores and returns the list of questions.                                                    |
| `Question.java`        | Defines the Question class with question text, correct answer, and options.                  |

---

## How to Run

### Requirements

* Java JDK 8 or higher installed
* Command line or IDE to compile and run Java code

### Compile

Open a terminal in the project directory and run:

```bash
javac Main.java Welcome.java Quiz.java CreateQuestions.java Question.java
```

### Run

```bash
java Main
```

---

## How It Works

1. Program starts, prints a welcome message.
2. User enters their **name** and **age**.
3. Quiz begins immediately if age is valid.
4. The program picks 10 random questions from 15.
5. Each question’s answer options are shuffled.
6. User inputs their answer (A, B, C, or D).
7. Program scores the answers and calculates a percentage.
8. Displays the final score and grade category.

---

## Example

```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Welcome to QuizHelix
Twisting Questions, Sharpening Minds.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

What's your name?: Ndivho
What's your age?: 24

Awesome Ndivho, let the quiz begin!

Question 1: Who was South Africa’s first black president?
A: Jacob Zuma
B: Nelson Mandela
C: Cyril Ramaphosa
D: Thabo Mbeki
Your answer: B

... (questions continue)

You scored 8/10 (80%)
Result: Distinction
```

---

## Notes

* If invalid input is entered for age, the program will prompt an error and exit.
* If invalid option is entered during the quiz, the question is skipped.
* Future improvements may include input retry loops and result persistence.

---
