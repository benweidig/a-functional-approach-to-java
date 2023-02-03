//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working With Records
//

typealias Fruit = (name: String, color: String)

let fruits: [Fruit] = [
    (name: "apple", color: "green"),
    (name: "banana", color: "yellow"),
    (name: "cherry", color: "red")
]

for fruit in fruits {
    println("The \(fruit.name) is \(fruit.color)")
}
