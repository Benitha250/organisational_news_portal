# Organizational news portal

A rest REST API for querying and retrieving scoped news and information. There should be news/articles/posts that are available to all employees without navigating into any department, and others that are housed/classified within departments (The “Further Exploration” section below explains the need for this set up).

## Author
Benitha Uwase


### The live link to the project

## Setup Requirements for Database
* CREATE DATABASE organisational_news_portal;
* \c organisational_news_portal
* CREATE TABLE departments (id SERIAL PRIMARY KEY, name VARCHAR, description VARCHAR, size int);
* CREATE TABLE news ( id SERIAL PRIMARY KEY, news_type VARCHAR, department_id INT, user_id INT, title VARCHAR, description VARCHAR );
* CREATE TABLE staff ( id SERIAL PRIMARY KEY, name VARCHAR, position VARCHAR, staff_role VARCHAR);
* CREATE TABLE users_departments ( id SERIAL PRIMARY KEY, user_id INT, department_id INT);
* CREATE DATABASE organisational_news_portal_test WITH TEMPLATE organisational_news_portal;


## Setup/Installation Requirements
* Fork this repo
* Clone this repo 
* Open terminal
* Navigate to appropriate directory using the cd command
* type in the command git clone and paste the url of clone and then press enter 


## Technologies Used
* Java
* Heroku
* CSS

## Copyright
Copyright 2020 Benitha Uwase

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
