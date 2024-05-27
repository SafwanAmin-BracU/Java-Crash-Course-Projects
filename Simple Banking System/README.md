# Project 1: Simple Banking System

## Project Description

Create a console-based banking application that allows users to create accounts, deposit money, withdraw money, and check their balance.

## Key Concepts

- OOP (Object-Oriented Programming)
- Basic file I/O
- Exception handling

## Classes: Attributes and Methods

### Account

#### Attributes

- String accountNumber
- String accountHolderName
- double balance

#### Methods

- Account(String accountNumber, String accountHolderName) (Constructor)
- String getAccountNumber()
- String getAccountHolderName()
- double getBalance()
- void deposit(double amount)
- void withdraw(double amount)

### Bank

#### Attributes

- Map<String, Account> accounts

#### Methods

- Bank() (Constructor)

- void createAccount(String accountNumber, String accountHolderName)
- Account getAccount(String accountNumber)

### Main

#### Attributes

- Bank bank
- Scanner scanner

#### Methods

- main(String[] args)
- Other helper methods for user interaction and input handling (optional)
