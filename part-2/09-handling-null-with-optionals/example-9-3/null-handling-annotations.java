//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-3. null handling with annotations
//
// This example requires a dependency containing the nullability
// annotations, therefore, it's just for illustration purposes.

interface Example {

    @NonNull List<@Nullable String> getListOfNullableStrings();

    @Nullable List<@NonNull String> getNullableListOfNonNullStrings();

    void doWork(@Nullable String identifier);
}