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

DROP TABLE integers;
CREATE TABLE integers(i INTEGER, j INTEGER);
INSERT INTO integers VALUES (10,20), (200,300), (33,66), (400,900), (55,100);

CREATE OR REPLACE FUNCTION dif_sum(column_1 INTEGER,column_2 INTEGER)
RETURNS DOUBLE LANGUAGE PYTHON {
  sum_1 = 0
  sum_2 = 0
  for i in range (0, len(column_1)):
    sum_1 += column_1[i]
    sum_2 += column_2[i]
  dif = sum_2 - sum_1
  return dif;
};

-- select mean_deviation (i) from integers;