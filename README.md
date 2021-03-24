# Design-Patterns
Design patterns have been evolved over a long period of time and they provide best solutions to certain problems faced during software development. Learning these patterns helps unexperienced developers to learn software design in an easy and faster way.

## Table of Contents
1. [Creational Patterns](#creational-patterns)
   - [Factory Pattern](#factory-pattern)
   - [Abstract Factory Pattern](#abstract-factory-pattern)
   - [Singleton Pattern](#singleton-pattern)
2. [Structural Patterns](#structural-patterns)
3. [Behavioral Patterns](#behavioral-patterns)

# Creational Patterns
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.

## Factory Pattern
"Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses." ([Gang Of Four](https://en.wikipedia.org/wiki/Design_Patterns))

Deals with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

## Abstract Factory Pattern
 "Provide an interface for creating families of related or dependent objects without specifying their concrete classes." ([Gang Of Four](https://en.wikipedia.org/wiki/Design_Patterns))
 
Creating objects directly within the class that requires the objects is inflexible because it commits the class to particular objects and makes it impossible to change the instantiation later independently from (without having to change) the class. It stops the class from being reusable if other objects are required, and it makes the class hard to test because real objects cannot be replaced with mock objects.

The Abstract Factory design pattern describes how to solve such problems:
   - Encapsulate object creation in a separate (factory) object. That is, define an interface (AbstractFactory) for creating objects, and implement the interface.
   - A class delegates object creation to a factory object instead of creating objects directly

## Singleton Pattern
The key idea in this pattern is to make the class itself responsible for controlling its instantiation (that it is instantiated only once).

# Structural Patterns

# Behavioral Patterns
