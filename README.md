OO Basics
=========

* Abstraction
* Encapsulation
* Polymorphism
* Inheritance

OO Principles
=============

* Encapsulate what varies
* Favor composition over inheritance
* Program to interfaces, not implementations
* Strive for loosely coupled designs between objects that interact
* Classes should be open for extension but closed for modification
* Depend on abstractions. Do not depend on concrete classes.

OO Patterns
===========

* **Strategy** - defines a family of algorithms encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

* **Observer** - defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

* **Decorator** - attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to sublcassing for extending functionality.

* **Abstract Factory** - provide an interface for creating families of related or dependent objects without specifying their concrete classes.

* **Factory Method** - define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instatiation to the subclasses.

* **Singleton** - ensure a class only has one instance and provide a global point of access to it.


Bullet Points
=============
* Knowing the OO basics does not make you a good OO designer
* Good OO designs are reusable, extensible and maintainable.
* Patterns show you how to build systems with good OO design qualities.
* Patterns are proven object-oriented experience.
* Patterns don't give you code, they give you general solutions to design problems. You apply them to your specific application.
* Patterns aren't *invented*, they are *discovered*.
* Most patterns and principles address issues of *change* in software.
* Most patterns allow some part of a system to vary independently of all other parts.
* We often try to take what varies in a system and encapsulate it.
* Patterns provide a shared language that can maximize the value of your communication with other developers.

---

* The Observer Pattern defines a one-to-many relationship between objects.
* Subjects, or as we also know them, Observables, update Observers using a common interface.
* Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer Interface.
* You can push or pull data from the Observable when using the pattern (pull is considered more "correct").
* Don't depend on a specific order of notification for your Observers.
* Java has several implementations of the Observer Pattern, including the general purpose java.util.Observable.
* Watch out for issues with the java.util.Observable implementation.
* Don't be afraid to create your own Observable implementation if needed.
* Swing makes heavy use of the Observer Pattern, as so do many GUI frameworks.
* You'll also find the pattern in many other places, including JavaBeans and RMI.

---

* Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.
* In our designs we should allow behavior to be extended without the need to modify existing code.
* Composition and delegation can often be used to add new behaviors at runtime.
* The Decorator Pattern provides an alternative to subclassing for extending behavior.
* The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components.
* Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)
* Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component.
* You can wrap a component with any number of decorators.
* Decorators are typically transparent to the client of the component; that is unless the client is relying on the component's concrete type.
* Decorators can result in many small objects in our design, and overuse can be complex.

---

* All factories encapsulate object creation.
* Simple Factory, while not a bona fide design pattern, is a simple way to decouple your clients from concrete classes.
* Factory Method relies on inheritance: object creation is delegated to subclasses which implement the factory method to create objects.
* Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
* All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
* The intent of Factory Method is to allow a class to defer instatiation to its subclasses.
* The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
* The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstractions.
* Factories are a powerful technique for coding to abstractions, not concrete classes.

---

* The Singleton Pattern ensures you have at most one instance of a class in your application.
* The Singleton Pattern also provides a global access point to that instance.
* Java's implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable.
* Examine your performance and resource constraints and carefully choose an appropriate Singleton implementation for multithreaded applications (and we should consider all applications multithreaded!).
* Beware of the double-checked locking implementation; it is not thread-safe in versions before Java 2, version 5.
* Be careful if you are using multiple class loaders; this could defeat the Singleton implmentation and result in multiple instances.
* If you are using a JVM earlier than 1.2, you'll need to create a registry of Singletons to defeat the garbage collector.