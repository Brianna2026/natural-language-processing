# natural-language-processing
# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project](UMLDiagram.png)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my project](thumbnail.jpg)]([youtube-URL-here](https://youtu.be/FKe5wwW9694))

## Project Description

Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text an how the user interacts with your project.
My project is meant to generate a list of names based on the preferred letter by the user. There is an arraylist transfered to text file through a file reader that is traversed through a for-loop. The for-loop's if statement checks if the first letter of the element matches the UserInput. The elements that fufill the conditional statement are then transferred to an array and printed onto the console.

## NLP Techniques

Write a description of what natural lanugage technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods word and how they are necessary in the NLP technique. 
The natural language processing technique we implemented was Filtering. The String Methods used in this project are .toUpperCase(), .equals(), and .substring (). These methods allow the algorithm to ensure that the userInput is in the correct format with .toUpperCase(). The .toUpperCase() method gets rid of the possible errors if the user would put a lowercase letter then the method wouldn't work because none of the names in the arrayList have a lower case. The .substring() method gets the first letter of the string in order to compare the elements in the arrayList with the .equals() method. The .substring() method is nescessary to get the specific letter to compare to the arrayList. While the .compare() method is important for checking if the conditional is true.