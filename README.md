## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Your First OOP Program

# Challenge: Build a Library Catalog

<u>Description</u>

Your Role: Software Developer

You have been tasked with building a simple library catalog system. The system should allow users to add books to the catalog, search for books by title or author, and display the available books. 

<u>Requirements</u>

1. Create a `Book` class with the following attributes: 

   - `title` (String): The title of the book. 

   - `author` (String): The author of the book. 

  

2. Create a `Library` class to manage the library catalog. It should have the following methods: 

   - `addBook(Book book)`: Adds a book to the library catalog. 

   - `searchByTitle(String title)`: Searches for a book by title and displays the book information if found. 

   - `searchByAuthor(String author)`: Searches for books by author and displays the book information if found. 

   - `displayAvailableBooks()`: Displays the information of all available books in the catalog. 

  

3. In the `main` method of your main Java class, demonstrate the functionality of the library catalog by performing the following actions: 

   - Create a few instances of `Book` and add them to the library catalog using the `addBook` method. 

   - Perform a search for books by title using the `searchByTitle` method. 

   - Perform a search for books by author using the `searchByAuthor` method. 

   - Display the available books in the catalog using the `displayAvailableBooks` method. 

  

Note: 

- You can choose whether to implement the classes in the same file or separate files. 

- Feel free to add additional features or functionality to enhance the library catalog system. 

<u>Output:</u> 

``` 

Book found: 

Title: 1984 

Author: George Orwell 

  

Books found: 

Title: Harry Potter and the Sorcerer's Stone 

Author: J.K. Rowling 

