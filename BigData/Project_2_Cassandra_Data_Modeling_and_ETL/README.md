# Sparkify Cassandra ETL

This project consists on putting into practice the following concepts:
- Data modeling with NoSQL (Apache Cassandra)
- Tables created based on the query demand 


## Context

A startup called Sparkify wants to analyze the data they've been collecting on songs and user activity on their new music streaming app. The analysis team is particularly interested in understanding what songs users are listening to. Currently, there is no easy way to query the data to generate the results, since the data reside in a directory of CSV files on user activity on the app.

They'd like a data engineer to create an Apache Cassandra database which can create queries on song play data to answer the questions, and wish to bring you on the project. Your role is to create a database for this analysis. You'll be able to test your database by running queries given to you by the analytics team from Sparkify to create the results.

Your role is to create a database schema and ETL pipeline for this analysis.

### Data
- For this project, you'll be working with one dataset under: *event_data*. The directory of CSV files partitioned by date. Here are examples of filepaths to two files in the dataset:
event_data/2018-11-08-events.csv
event_data/2018-11-09-events.csv


## Project structure

Files used on the project:
1. **event_data** folder at the home of the project, where all needed csv reside.
2. DataModelingWithNoSqlDB_Apache_Cassandra.ipynb is the main file to execute the ETL job and create table and run query on inserted data.
3. **README.md** current file, provides discussion on my project.

### Break down of steps followed

1 Wrote preprocessing of the multiple csv file and created a single csv file event_data_combined.csv at the home directory.

2. Used DataModelingWithNoSqlDB_Apache_Cassandra.ipynb Jupyter Notebook to execute the preprocessing logic.

3. Used DataModelingWithNoSqlDB_Apache_Cassandra.ipynb Jupyter Notebook to create the tables based in the query requirements, inserted the data and verified the results.
