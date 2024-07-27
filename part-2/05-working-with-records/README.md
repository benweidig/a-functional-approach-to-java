# Chapter 5: Working With Records

## Data Aggregation Types

### Tuples

Tuples in different languages.

[tuples](tuples)

### POJOs

#### Example 5-1. Simple User POJO

Java class of a simple User POJO.

[Example 5-1](example-5-1)

#### Example 5-2. Simple immutable User type

Java class of the User POJO converted to a simple immutable variant.

[Example 5-2](example-5-2)


## Records to the Rescue

### Behind the Scenes

#### Example 5-3. Disassembled User.class POJO versus Record

Disassembled Java classes of the immutable User POJO and Record.

[Example 5-3](example-5-3)

### Record Features

Collection of examples of different Record features.

[Record Features](record-features)

### Missing Features

Collection of examples of features that Records are lacking.

[Missing Features](missing-record-features)


## Use-Cases and Common Practices

Examples of Record Use-Cases and Common Practices.

[Use-Cases and Common Practices](record-use-cases-common-practices)

### Creating Modified Copies

[Creating Modified Copies (wither)](record-wither)

### Better Optional Data Handling

How to handle optional components.

[Better Optional Data Handling](record-optional-data-handling)

### Serializing Evolving Records

Java classes showing how to (de-)serialize Records with additional components.

You have to rename the files to compile them because the class name has to be identical for (de-)serialization.

[Serializing Evolving Records](serializing-evolving-records)

### Example 5-10. Group membership as sealed types instead of `Optional<String>

Using sealed types instead of `Optional<T>`

[Example 5-10](example-5-10)

### Example 5-11. User Record with sealed interface Membership

Convenience methods for sealed types

[Example 5-11](example-5-11)
