//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//

package main

import "fmt"

func safeReadString(path string) (string, error) {
	return path, nil
}

func main() {
	content, err := safeReadString("location/content.md")
	if err != nil {
		// error handling code
	}

	fmt.Println(content)
}
