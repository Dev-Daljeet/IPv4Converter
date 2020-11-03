# IPv4ToDecimalConverter
> A converter which converts IPv4 address from 32 bit dotted-decimal format to decimal format and vice versa.

This project is an IPv4 converter which converts the IPv4 address from one format to another. 

It can convert from:
* 32 bit dotted-decimal format to decimal/Interger format 
* Decimal/Interger format to 32 bit dotted-decimal format

Programming language: Java

GUI: JavaFx

Location of Java classes: src\main\java\com\mycompany\ipv4conversion

Location of test classes: src\test\java\com\mycompany\ipv4conversion

## A sample screenshot of Project
![Screesshot of GUI](https://github.com/Dev-Daljeet/IPv4Converter/blob/master/Screenshots/GUI.jpg?raw=true)

## Run:
### Prerequisites: 

**(Note: As of JDK 7 update 6, JavaFX is included with the standard JDK and JRE bundles. Hence you don’t have to download it separately if you have a JDK version higher than JDK 7 update 6.)**

* Oracle JDK installed (recommended Java SE version 14.0.2 or latest release) 
* (optional) any Java IDE (recommened IntelliJ IDEA Version: 2020.2.1 or latest release)

Refer to this [link](https://www.tutorialspoint.com/javafx/javafx_environment.htm) for installation of Oracle JDK and setting up the path for windows.

**Note: This is a normal Java project (not a maven project).**

### Using IDE:

Step 1: Download the zip of the project or clone the project with HTTPS.

Step 2: Open the project in IDE. For zip file, unzip the project or import the project into IDE.

Step 3: Go to src\main\java\com\mycompany\ipv4conversion and compile and run the class UserInterface.

Step 4: At GUI window, enter an IPv4 address or IP decimal in the respective textfield and then, click on 'Convert' button to get the result. The result will be displayed in text area.


### Using command line:

Step 1: Download the zip of the project or clone the project with HTTPS.

Step 2: On Command Prompt, navigate to src\main\java\com\mycompany\ipv4conversion directory. For zip file, unzip the project and navigate to directory. 

Step 3: Execute the following command to compile the UserInterface.java file.
        
        javac -d . UserInterface.java
        
Step 4: To run the program, execute the following command.

        java  UserInterface
        
Step 5:  At GUI window, enter an IPv4 address or IP decimal in the respective textfield and then, click on 'Convert' button to get the result. The result will be displayed in text area.

## Usage example:
### Example 1:
Convert the IPv4 address "192.168.0.111" to IP decimal.

![Screenshot of convert1](https://github.com/Dev-Daljeet/IPv4Converter/blob/master/Screenshots/convert1.jpg?raw=true)

### Example 2:
Convert the IP decimal "3232235631" to IP address.

![Screenshot of convert2](https://github.com/Dev-Daljeet/IPv4Converter/blob/master/Screenshots/convert2.jpg?raw=true)

### Example 3: 
Error messages for wrong IPv4 address and IP decimal.

![Screesnhot of error message](https://github.com/Dev-Daljeet/IPv4Converter/blob/master/Screenshots/error%20message.jpg?raw=true)

# License
MIT License
Copyright (c) 2020 Dev-Daljeet

Refer to **LICENSE** file for full information.
