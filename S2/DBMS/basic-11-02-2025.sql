create database testnew;
use testnew;
CREATE TABLE regions (
    region_id INT ,
    region_name VARCHAR(50) NOT NULL,
    primary key(region_id)
);
CREATE TABLE countries (
    country_id INT AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(50) NOT NULL,
    region_id INT NOT NULL,
    FOREIGN KEY(region_id) REFERENCES regions(region_id)
);
CREATE TABLE jobs (
    job_id INT AUTO_INCREMENT PRIMARY KEY,
    job_title VARCHAR(50) NOT NULL,
    min_salary INT NOT NULL,
    max_salary INT NOT NULL
);
CREATE TABLE locations (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    street_address VARCHAR(50) NOT NULL,
    postal_code INT NOT NULL,
    city VARCHAR(30) NOT NULL,
    state_province VARCHAR(30) NOT NULL,
    country_id INT NOT NULL,
    FOREIGN KEY(country_id) REFERENCES countries(country_id)
);
CREATE TABLE departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL,
    location_id INT NOT NULL,
	FOREIGN KEY(location_id) REFERENCES locations(location_id)
);

#DESC regions; #desc stand for description to know about the table
#DESC countries;#when running this we get a MUL at key which statnd for forien key
#DESC locations;
#DESC jobs;
DESC departments;
#SELECT * FROM countries;
#select * from countries where country_name="india";