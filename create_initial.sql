CREATE OR REPLACE FUNCTION mean_deviation(column INTEGER)
RETURNS DOUBLE LANGUAGE PYTHON {
  mean = 0
  for i in range (0, len(column)):
    mean += column[i]
  mean = mean / len(column)
  distance = 0
  for i in range (0, len(column)):
    distance += column[i] - mean
  deviation = distance/len(column)
  return deviation;
};

CREATE TABLE integers(i INTEGER);
INSERT INTO integers VALUES (10), (200), (33), (400), (55);

select mean_deviation (i) from integers;