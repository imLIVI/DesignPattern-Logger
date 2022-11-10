# DesignPattern-Logger
## Logger task
### Description
In this task, we will practice with the <i>Singleton template</i>. We are writing a program that will log every step abundantly into the console, but not directly
through System.out.println, but through a logger object of our own singleton class.

#### The functionality of the program
1. The program greets the user, asks him to enter two numbers: the size of the list ```N``` and the upper bound of the values of the elements in the list ```M```.
2. The program creates an ```ArrayList``` list of ```N``` elements and fills them with random numbers from ```0``` to ```M```.
3. The program asks the user to enter the number ```f``` to filter the list.
4. The program creates a ```filter``` object of your ```Filter``` class by passing the value ```f``` to the constructor
5. The program calls the ```filter``` method ```List<Integer> filterOut(List<Integer> list)```, passing the created random list as a parameter and taking as a response 
a list that is identical to the original one, if you skip elements less than ```f```
6. The program displays the final list on the screen and completes its work
#### Logger
Every action of the program, whether it is incorrect input by the user or the decision not to add an element to the resulting list in the ```filterOut``` method, must be
logged. To do this, you need to create a singleton ```Logger``` class that will have a ```void log(String msg)``` method for displaying messages on the screen. The 
message should be displayed in the format: ```[<date and number of the message>] <message text>```, where ```<message number>``` this is the serial number of the message
output by the logger, and ```<message text>``` this is the value of the ```msg``` parameter.

### Result
```
[10.11.2022 15:17:54 1] Launching the program
[10.11.2022 15:17:54 2] Suggest the user to enter the input data for the list
Enter the size of the list (number): 5
Enter the maximum list item (number): 55
[10.11.2022 15:17:56 3] Creating and filling the list
Random list: [51, 53, 19, 38, 33]
[10.11.2022 15:17:56 4] Suggest the user to enter the input data for filtering
Enter the threshold for the filter: 35
[10.11.2022 15:18:02 5] Element 19 does not pass
[10.11.2022 15:18:02 6] Element 33 does not pass
[10.11.2022 15:18:02 7] Passed the filter 3 elements out of 5
[10.11.2022 15:18:02 8] Display the result on the screen
Filtered list: [51, 53, 38]
[10.11.2022 15:18:02 9] Completing the program
```

<a href="https://github.com/netology-code/jd-homeworks/blob/master/creational/task2/README.md">(RUS version of description)</a>
