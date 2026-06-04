# Java DSA Quick Revision Notes

## 1. Length vs Size

| Data Structure | Syntax         |
| -------------- | -------------- |
| Array          | `arr.length`   |
| String         | `str.length()` |
| ArrayList      | `list.size()`  |
| HashMap        | `map.size()`   |
| HashSet        | `set.size()`   |
| Queue          | `queue.size()` |
| Stack          | `stack.size()` |

### Remember

* Arrays use a property → `length`
* Strings use a method → `length()`
* Collections use a method → `size()`

---

## 2. Math Functions

### Absolute Value

```java
Math.abs(num)
```

Example:

```java
Math.abs(-5) // 5
```

Used In:

* LC2239 Find Closest Number to Zero

---

### Maximum

```java
Math.max(a, b)
```

Example:

```java
int max = Math.max(10, 20);
```

Used In:

* LC121 Best Time to Buy and Sell Stock

---

### Minimum

```java
Math.min(a, b)
```

Example:

```java
int min = Math.min(10, 20);
```

Used In:

* Running Minimum Pattern

---

## 3. StringBuilder

### Create

```java
StringBuilder sb = new StringBuilder();
```

### Append

```java
sb.append('a');
sb.append("hello");
```

### Convert To String

```java
sb.toString();
```

Used In:

* LC1768 Merge Strings Alternately

### Why Use It?

Avoid:

```java
result = result + ch;
```

inside loops.

StringBuilder is more efficient.

---

## 4. Enhanced For Loop

### Syntax

```java
for (int num : nums) {
}
```

Equivalent To:

```java
for (int i = 0; i < nums.length; i++) {
    int num = nums[i];
}
```

Use When:

* Index not required

Examples:

* Find Max
* Find Min
* Sum of Array

Do Not Use When:

* Need index
* Two Pointer Problems
* Sliding Window

---

## 5. Array Traversal

### Standard Loop

```java
for (int i = 0; i < nums.length; i++) {
}
```

### Reverse Traversal

```java
for (int i = nums.length - 1; i >= 0; i--) {
}
```

---

## 6. String Basics

### Character At Index

```java
word.charAt(i)
```

Example:

```java
"hello".charAt(1)
```

Output:

```java
e
```

---

### String Length

```java
word.length()
```

Example:

```java
"hello".length()
```

Output:

```java
5
```

---

## 7. Patterns Learned

### Pattern 1: Running Best Candidate

Problem:

* LC2239 Find Closest Number to Zero

Idea:

Keep track of the current best answer while traversing.

Template:

```java
int best = nums[0];

for (int num : nums) {

    if (betterThanCurrentBest) {
        best = num;
    }
}
```

---

### Pattern 2: Top K Tracking

Problem:

* LC414 Third Maximum Number

Idea:

Maintain only the top K values.

Example:

```java
first
second
third
```

Avoid sorting when only a few values are required.

---

### Pattern 3: Running Minimum

Problem:

* LC121 Best Time to Buy and Sell Stock

Idea:

Keep track of minimum value seen so far.

Template:

```java
minValue = Math.min(minValue, current);
answer = Math.max(answer, current - minValue);
```

---

### Pattern 4: Two Pointers

Problem:

* LC1768 Merge Strings Alternately

Idea:

Maintain two independent pointers.

Template:

```java
int i = 0;
int j = 0;
```

Used For:

* Merge Strings
* Valid Palindrome
* Reverse String
* Move Zeroes

---

## 8. Time Complexity Learned

### Single Loop

```java
for (...)
```

Time:

```text
O(n)
```

---

### Two Separate Loops

```java
for (...)
for (...)
```

Time:

```text
O(n + m)
```

---

### Nested Loops

```java
for (...)
    for (...)
```

Time:

```text
O(n²)
```

---

## 9. Common Interview Checklist

Before Coding Ask:

1. What is the brute force solution?
2. Can I do it in one pass?
3. What information do I actually need?
4. Can I maintain that information while traversing?
5. Is there a known pattern?
