# Description
A console-based Java program which offers different information about given numbers (such as parity, sign, whether if they prime or not, whether they are a perfect square or not), meant to showcase the implementation of 5 different design patterns

This program could easily be extended to include different computations made on numbers, such as alculate and display factors of a number, check if a number is a Fibonacci number, determine if a number is a palindrome, check if the number is part of any other special series etc.

# Implemented Design Patterns

## Chain of Responsibility

This pattern is implemented in the series of `Processor` objects, each of which can process a number or pass it on to the next processor in the chain. By creating a chain of `Processor` objects, each with a specific responsibility (such as checking a number's sign or determining its parity), the number can be filtered and processed in a sequence of steps. For example, if a number is not negative, it means it could be zero or positive.

## Observer

This pattern is implemented with the `Subject` and `Chain` classes. The `Subject` holds a list of `Chains` and notifies them whenever a new number is set. This allows the `Chains` to respond to changes in the `Subject` without being tightly coupled to it. 

## Decorator

The decorator pattern is implemented with the `NumberDecorator` classes, which add additional behaviors (like checking if a number is prime or a perfect square) to `Number` objects without modifying their structure. 

## Factory

This pattern is implemented with the `ProcessorFactory` class, which encapsulates the creation of `Processor` chains. This separates the concerns of object creation from the main application, making it easier to change the configuration of `Processor` chains or to add new types of chains in the future.

## Interpreter

This pattern is used to interpret the user's input. It separates the interpretation logic from the main loop, making it easier to add new types of input in the future. Each type of input (like a number or the 'X' command to quit) is handled by a separate `Expression` class, allowing for better separation of concerns and easier maintenance.

