# DevUDF : Increasing UDF development efficiency through IDE Integration.
The devUDF plugin is developed for the PyCharm IDE and facilitates the use of advanced IDE features for development of MonetDB/Python UDFs. 

It allows developers to create, modify and test UDFs without leaving their IDE environment. All features of the IDE can be used to develop UDFs, including the sophisticated interactive debugger and VCS support.

## Usage
The devUDF plugin can be accessed through the main menu of the IDE (See Figure below). In this menu, a submenu labeled "UDF Development" contains the three main aspects of the plugin. 

### Database Connection
Initially, devUDF must be configured so it can connect to an existing database server. 
This can be done through the settings window shown in the figure below 
The parameters required are the usual database client connection parameters (i.e., host, port, database, user and password).
<img src="https://github.com/pholanda/DevUDF/blob/master/img/main_menu.png" />
### Importing UDFs
After the devUDF plugin has been configured to connect to a running database server, the development process begins by importing the existing UDFs within the server into the development environment. 
This is done through the "Import UDFs" window, shown below. 
The developer has to select the function he wishes to import and to provide a problematic SQL query that uses said function.
<img src="https://github.com/pholanda/DevUDF/blob/master/img/import.png"/>
### Exporting UDFs
After the UDFs are imported, the code of the UDFs is exported from the database and imported into the IDE as a set of 
files in the current project (See below). 
<img src="https://github.com/pholanda/DevUDF/blob/master/img/imported_udf.png"  />

The developer can then modify the code of the UDFs in these files, 
use version control to keep track of changes to the UDFs and export the UDFs back to the database server for
 execution through the "Export UDFs" window (see below).
<img src="https://github.com/pholanda/DevUDF/blob/master/img/export.png"  />
## Future Features
* Creation of New UDFs from IDE;
* Support to Nested Queries;
* Support to different data transfer options (e.g., sampling, encryption, compression);
* Give the option to the user to never store data and use the client protocol in every debugging session.

## Papers
* [devUDF: Increasing UDF development efficiency through IDE Integration. It works like a PyCharm!](https://pholanda.github.io/assets/papers/devUDF.pdf)
