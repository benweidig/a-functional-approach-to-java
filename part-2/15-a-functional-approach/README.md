# Chapter 15: A Functional Approach to Java

The final chapter contains mostly small snippets that are included in this file instead of dedicated ones.

## A Functional Mindset

### Avoiding Side Effects

#### Pure Functions

A simple function that create a greeting for a `User` instance:

```java
public String buildGreeting(User user)
```

The public contract doesn't highlight all its dependencies:

```java
public String buildGreeting(User user) {
    String greeting;
    if (LocalTime.now().getHour() < 12) {
        greeting = "Good morning";
    } else {
        greeting = "Hello"
    }

    return String.format("%s, %s", greeting, user.name());
}
```

An improved method signature would include the current time:

```java
public String buildGreeting(User user, LocalTime time)
```

Now, the function is pure and generates its output solely on its input arguments.


#### Pure Object Methods

Python makes it more visible that the current instance itself, in the form of `self`, is part of a method signature:

```python
class User:

  name = ''

  def __init__(self, name):
    self.name = name 

  def buildGreeting(self, time):
    # ...
```

#### Favor Expression Over Statements

The previous `buildGreeting` method can be improved by converting the `if-else`-statement to an expression:

```java
public String buildGreeting(User user, LocalTime time) {

    String greeting = time.getHour() < 12 ? "Good Morning"
                                          : "Hello";

    return String.format("%s, %s", greeting, user.name());
}
```

### Functional Data Processing with Map-Filter-Reduce

Typical data processing -- iterating, filtering, collecting -- can utilise Streams where appropriate:

```java
List<User> usersToNotify = new ArrayList<>();

for (var users : availableUsers) {

    if (user.hasValidSubscription()) {
        continue;
    }

    usersToNotify.add(user);
}

notify(usersToNotify);
```

A Stream pipeline makes the code more concise and reasonable:

```java
List<User> usersToNotify = availableUsers.stream()
                                         .filter(User::hasValidSubscription)
                                         .toList();

notify(usersToNotify);
```

### Building Functional Bridges

#### Using Retroactive Functional Interfaces

Many types available prior to Java 8 are functional interfaces and can be used as lambdas:

```java
// AS ANONYMOUS CLASS

users.sort(new Comparator<User>() {

    @Override
    public int compare(User lhs, User rhs) {
        return lhs.email().compareTo(rhs.email());
    }
});


// AS LAMBDA

users.sort((lhs, rhs) -> lhs.email().compareTo(rhs.email()));


// AS METHOD REFERENCE

users.sort(Comparator.comparing(User::email));
```

#### Lambda Factories for Common Operations

Types can provide lambdas for more concise higher-order functions:

```java
public class ProductCategory {

    public String localizedDescription(Locale locale) {
        return "...";
    }

    // LAMBDA FACTORY
    public static Function<ProductCategory, String> localizedDescriptionMapper(Locale locale) {
        return category -> category.localizedDescription(locale);
    }
}

var locale = Locale.GERMAN;

List<ProductCategory> categories = List.of(...);

// EXPLICIT LAMBDAS

List<String> descriptionsViaExplicitLambdas =
    categories.stream()
              .map(category -> category.localizedDescription(locale))
              .toList();

// LAMBDA FACTORY

List<String> descriptionsViaLambdaFactory =
    categories.stream()
              .map(ProductCategory.localizedDescriptionMapper(locale))
              .toList();
```

#### Implementing Functional Interfaces Explicitly

Interfaces can extend common functional interfaces to be usable in Stream of Optional pipeline operations:

```java
interface VideoConverterJob extends Function<Path, Path> {

  Path convert(Path sourceFile);

  default Path apply(Path sourceFile) {
        return convert(sourceFile);
  }
}
```

#### Functional null Handling with Optionals

Optionals are excellent to streamline multiple operations on a possibly `null` value:

```java
public Optional<User> tryLoadUser(long id) {
  // ...
}

boolean isAdminUser =
  tryLoadUser(23L).map(User::getPermissions)
                  .filter(Predicate.not(Permissions::isEmpty))
                  .map(Permissions::getGroup)
                  .flatMap(Group::getAdmin)
                  .map(User::isActive)
                  .orElse(Boolean.FALSE);
```

However, not every `null` should be done with Optionals:

```java
// BAD: wrapping a value for a simple lookup

var nicknameOptional = Optional.ofNullable(customer.getNickname())
                               .orElse("Anonymous");


// BETTER: simpler null-check

var nicknameTernary = customer.getNickname() != null ? customer.getNickname()
                                                     : "Anonymous";
```

Instead of a ternary operator, you could also use `Objects.requireNonNullElse`:

```java
var nickname = Objects.requireNonNullElse(customer.getNickname(), "Anonymous");

var nicknameWithSupplier = Objects.requireNonNullElse(customer.getNickname(),
                                                      () -> "Anonymous");
```

