# Chapter 5: Working With Records

## Data Aggregation Types

### Tuples

Tuples in different languages.

[`other/tuples.py` (Python)](other/tuples.py)  
[`other/tuples.swift` (Swift)](other/tuples.swift)

### POJOs

#### Example 5-1. Simple User POJO

Java class of a simple User POJO.

[`java/UserPOJO.java`](java/UserPOJO.java)

#### Example 5-2. Simple immutable User type

Java class of the User POJO converted to a simple immutable variant.

[`java/UserImmutable.java`](java/UserImmutable.java)

#### From POJO to Record

Java class of the User POJO as a Record.

[`java/UserRecord.java`](java/UserRecord.java)


## Records to the Rescue

### Behind the Scenes

#### Example 5-3. Disassembled User.class POJO versus Record

Disassembled Java classes of the immutable User POJO and Record.

[`other/UserImmutable.disassembled`](java/UserImmutable.disassembled)  
[`other/UserRecord.disassembled`](java/UserRecord.disassembled)


### Record Features

#### Component Accessors

JShell scripts of a User record and how to override a component accessor.

[`jshell/user-record.java`](jshell/user-record.java)  
[`jshell/user-record-component-override.java`](java/user-record-component-override.java)

#### Canonical, Compact, and Custom Constructors

JShell scripts illustrating the different constructor types for Records.

[`jshell/user-record-canonical.java`](jshell/user-record-canonical.java)  
[`jshell/user-record-compact.java`](jshell/user-record-compact.java)

#### Generics

JShell script of how to use generics in Records.

[`jshell/record-generics.java`](jshell/record-generics.java)

#### Reflection

TODO


### Missing Features

#### Additional State

JShell script showing how to add derived state to a Record.

[`jshell/record-derived-state.java`](jshell/record-derived-state.java)


#### Inheritance

JShell script illustrating the use of shared interfaces.

[`jshell/record-interfaces.java`](jshell/record-interfaces.java)


#### Component Default Values and Convenience Constructors

JShell scripts using additional constructors for sensible default values and factory methods for easier creation.

[`jshell/record-additional-constructors.java`](jshell/record-additional-constructors.java)  
[`jshell/record-factory-methods.java`](jshell/record-factory-methods.java)  

#### Step-by-Step Creation

JShell scripts demonstrating the builder pattern for the User Record.

[`jshell/record-builder.java`](jshell/record-builder.java)  
[`jshell/record-builder-nested.java`](jshell/record-builder-nested.java)


## Use-Cases and Common Practices

### Record Validation

JShell script using the compact constructor for validation purposes.

[`jshell/record-validation.java`](jshell/record-validation.java)  

### Data Scrubbing

JShell script using the compact constructor to normalize data.

[`jshell/record-data-scrubbing.java`](jshell/record-data-scrubbing.java)


### Increasing Immutability

JShell script showing how to increase the immutability of Record components.

[`jshell/record-increase-immutability.java`](jshell/record-increase-immutability.java)

### Creating Modified Copies

#### Wither Methods

JShell scripts showing `with` factory methods, and a nested `With` Record.

[`jshell/record-with.java`](jshell/record-with.java)  
[`jshell/record-with-nested.java`](jshell/record-with-nested.java)

#### Builder pattern

JShell script illustrating how to use the builder pattern for copying Records.

[`jshell/record-builder-pattern-copy.java`](jshell/record-builder-pattern-copy.java)


### Records as Local Nominal Tuples

JShell script showing a Record as a local nominal tuple.

[`jshell/record-local.java`](jshell/record-local.java)


### Better Optional Data Handling

#### Ensure non-null Container

JShell script validating an `Optional<T>` with a compact constructor.

[`jshell/record-non-null-container.java`](jshell/record-non-null-container.java)

#### Add Convenience Constructors

JShell script illustrating the use of a convenience constructor for `Optional<T>` components.

[`jshell/record-convenience-optional.java`](jshell/record-convenience-optional.java)


### Serializing Evolving Records

Java classes showing how to (de-)serialize Records with additional components.

You have to rename the files to compile them because the class name has to be identical for (de-)serialization.

[`java/PointSerialization.java`](jshell/PointSerialization.java)  
[`java/PointSerializationIdentical.java`](jshell/PointSerializationIdentical.java)
