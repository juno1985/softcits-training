USE test;

CREATE TABLE continent( id INT AUTO_INCREMENT PRIMARY KEY, 
			NAME VARCHAR(255));

CREATE TABLE country(id INT AUTO_INCREMENT PRIMARY KEY,
			NAME VARCHAR(255),
			continentID INT,
			FOREIGN KEY(continentID) 
			   REFERENCES continent(id)
			   ON DELETE SET NULL);
			   
CREATE TABLE gold (id INT AUTO_INCREMENT PRIMARY KEY,
		   male INT,
		   female INT,
		   combine INT,
		   countryID INT,
		   FOREIGN KEY(countryID) 
		   REFERENCES country(id)
		   ON DELETE SET NULL
		   );
		   
INSERT INTO continent VALUES(NULL, 'American');
INSERT INTO continent VALUES(NULL, 'Asia');
INSERT INTO continent VALUES(NULL, 'Africa');
INSERT INTO continent VALUES(NULL, 'Europe');

SELECT * FROM continent;


INSERT INTO country VALUES(NULL,'USA',1);
INSERT INTO country VALUES(NULL,'UK',4);
INSERT INTO country VALUES(NULL,'China',2);
INSERT INTO country VALUES(NULL, 'Russian',4);
INSERT INTO country VALUES(NULL, 'Germany',4);

SELECT * FROM country;

SELECT c1.name AS continent_name, c2.name AS country_name
FROM continent c1, country c2
WHERE c1.id = c2.continentID

INSERT INTO gold VALUES(NULL, 18, 27, 1, 1);
INSERT INTO gold VALUES(NULL, 18, 7, 2, 2);
INSERT INTO gold VALUES(NULL, 12, 14, 0, 3);
INSERT INTO gold VALUES(NULL, 9, 10, 0, 4);
INSERT INTO gold VALUES(NULL, 10 ,5, 2, 5);

SELECT * FROM gold;

SELECT SUM(temp.male) AS num, temp.continentName AS Total_Male FROM(
SELECT c1.name AS continentName, c2.name AS countryName,
	g.male AS male, g.female, g.combine
FROM continent c1, country c2, gold g
WHERE c1.id = c2.continentID
	AND
	c2.id = g.countryID) temp 
	GROUP BY temp.continentName
	HAVING num > 15



SELECT c1.name AS continent_name, c2.name AS country_name
FROM continent c1, country c2
WHERE c1.id = c2.continentID

SELECT c1.name AS continent_name, c2.name AS country_name
FROM continent c1 
LEFT JOIN country c2 
ON c1.id = c2.continentID
			