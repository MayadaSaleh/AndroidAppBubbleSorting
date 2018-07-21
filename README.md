# AndroidAppBubbleSorting
Bubble Sorting is android Application that contains two screens
* Main screen has Edit text where enable can enter a random number and two buttons, the first one to insert this number to database and the second to display all entered numbers from database
* Second screen that displays all inserted numbers in list view 
# Steps to Run project 
* create database schema with bubblesorting name has one table called bubblenumber has two columns id and number accepts int and not null.
* open API project https://github.com/MayadaSaleh/APIBubbleSortingTask and change database connectivity in APIBubbleSortingTask/src/java/database/connection/DatabaseConnection.java by your URL,USERNAME,PASSWORD configuration.
* Run APIBubbleSortingTask project.
* open AndroidAppBubbleSorting project and change BASE_URL  in AndroidAppBubbleSorting/BubbleSortingAndroid/app/src/main/java/main/screen/control/APIRetrofitUtils.java and 
AndroidAppBubbleSorting/BubbleSortingAndroid/app/src/main/java/show/numbers/screen/control/ApiRetrofitUtils.java by your IP address and port number 
* Run AndroidAppBubbleSorting project
