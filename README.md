# filesystem
FilesystemChained Hash Table Implementation

Overview

This repository contains a Java implementation of a hash table with chaining for collision resolution.

Features

- Hash table with chaining for collision resolution
- Fixed table size of 31
- Support for adding, searching, and deleting data
- Linked list implementation for collision resolution

Usage

To use the FilesystemChained class, simply instantiate it and call the appropriate methods (add, search, delete).

Example

// Create a new hash table
FilesystemChained hashTable = new FilesystemChained();

// Add data
hashTable.add("data1", 1);
hashTable.add("data2", 2);

// Search for data
boolean found = hashTable.search("data1", 1);

// Delete data
hashTable.delete("data2", 2);

License

This repository is licensed under the MIT License.
