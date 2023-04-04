 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> ALTER TABLE PRO
  2  ADD MODE_NO VARCHAR(10) NOT NULL;

Table altered.

SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(
 MODE_NO                                   NOT NULL VARCHAR

SQL>                SELECT * RROM TAB;
               SELECT * RROM TAB
                        *
ERROR at line 1:
ORA-00923: FROM keyword not found where expected


SQL> SELECT * FROM TAB
  2  ;

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
DEPT                           TABLE
EMP                            TABLE
BONUS                          TABLE
SALGRADE                       TABLE
PRO                            TABLE

SQL> 
SQL> ALTER TABLE PRO
  2  DROP COLUMN MODE_NO;

Table altered.

SQL> ALTER TABLE PRO
  2  RENAME COLUMN PRICE TO MRP;

Table altered.

SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 MRP                                       NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> ALTER TABLE PRO
  2  RENAME COLUMN MRP TO PRICE;

Table altered.

SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> ALTER TABLE PRO 
  2  MODIFY PNAME NUMBER(3);

Table altered.

SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL NUMBER(
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> ALTER TBLE PRO MODIFY PNAME VARCHAR(20);
ALTER TBLE PRO MODIFY PNAME VARCHAR(20)
      *
ERROR at line 1:
ORA-00940: invalid ALTER command


SQL> ED
Wrote file afiedt.buf

  1* ALTER TABLE PRO MODIFY PNAME VARCHAR(20)
SQL> ;
  1* ALTER TABLE PRO MODIFY PNAME VARCHAR(20)
SQL> ;
  1* ALTER TABLE PRO MODIFY PNAME VARCHAR(20)
SQL> ;
  1* ALTER TABLE PRO MODIFY PNAME VARCHAR(20)
SQL> ALTER TABLE
  2  PRO
  3  MODIFY PAME VARVHAR(20);
MODIFY PAME VARVHAR(20)
                   *
ERROR at line 3:
ORA-01735: invalid ALTER TABLE option


SQL> ALTER TABLE PRO
  2  MODIFY PNAME VARCHAR(20);

Table altered.

SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> ALTER TABLE PRO
  2  MODIFY DIST NUMBER(8,2);

Table altered.

SQL> 
SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> ALTER TABLE PRO
  2  MODIFY DIST NUMBER(8,2) NOT NULL;

Table altered.

SQL> ALTER TABLE PRO
  2  
SQL> DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                      NOT NULL NUMBER(

SQL> ALTER TABLE PRO
  2  MODIFY DIST NUMBER(8,2);

Table altered.

SQL>  DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                      NOT NULL NUMBER(

SQL>  ALTER TABLE PRO
  2   MODIFY DIST NUMBER(8,2) NULL;

Table altered.

SQL>  DESC PRO
 Name                                      Null?    Type
 ----------------------------------------- -------- -------
 PID                                       NOT NULL NUMBER(
 PNAME                                     NOT NULL VARCHAR
 PRICE                                     NOT NULL NUMBER(
 DIST                                               NUMBER(

SQL> INSERT INTO VALUES ($PID,&PNAME,&PRICE,&DIST) ;
Enter value for pname: 
Enter value for price: 
Enter value for dist: 
old   1: INSERT INTO VALUES ($PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO VALUES ($PID,,,)
INSERT INTO VALUES ($PID,,,)
            *
ERROR at line 1:
ORA-00903: invalid table name


SQL> /
Enter value for pname: /
Enter value for price: 
Enter value for dist: 
old   1: INSERT INTO VALUES ($PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO VALUES ($PID,/,,)
INSERT INTO VALUES ($PID,/,,)
            *
ERROR at line 1:
ORA-00903: invalid table name


SQL> 
SQL> SQL> INSERT INTO VALUES (&PID,&PNAME,&PRICE,&DIST);
SP2-0734: unknown command beginning "SQL> INSER..." - rest 
SQL> INSERT INTO VALUES (&PID,&PNAME,&PRICE,&DIST) ;
Enter value for pid: 1
Enter value for pname: MI
Enter value for price: 20000
Enter value for dist: 999
old   1: INSERT INTO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO VALUES (1,MI,20000,999)
INSERT INTO VALUES (1,MI,20000,999)
            *
ERROR at line 1:
ORA-00903: invalid table name


SQL> INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST);
Enter value for pid: 1
Enter value for pname: MI
Enter value for price: 20000
Enter value for dist: 999
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (1,MI,20000,999)
INSERT INTO PRO VALUES (1,MI,20000,999)
                          *
ERROR at line 1:
ORA-00984: column not allowed here


SQL> 
SQL> /
Enter value for pid: 1
Enter value for pname: 'MI'
Enter value for price: 20000
Enter value for dist: 1000
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (1,'MI',20000,1000)

1 row created.

SQL> /
Enter value for pid: 2
Enter value for pname: 'VIVO'
Enter value for price: 16000
Enter value for dist: 500
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (2,'VIVO',16000,500)

1 row created.

SQL> /
Enter value for pid: 3
Enter value for pname: 'SAMSUNG'
Enter value for price: 35000
Enter value for dist: 2000
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (3,'SAMSUNG',35000,2000)

1 row created.

SQL> /
Enter value for pid: 4
Enter value for pname: 'REALME'
Enter value for price: 25000
Enter value for dist: NULL
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (4,'REALME',25000,NULL)

1 row created.

SQL> /
Enter value for pid: 5
Enter value for pname: 'ROG'
Enter value for price: 58000
Enter value for dist: 5000
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (5,'ROG',58000,5000)

1 row created.

SQL> /
Enter value for pid: 6
Enter value for pname: 'LG'
Enter value for price: 40000
Enter value for dist: NULL
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (6,'LG',40000,NULL)

1 row created.

SQL> /
Enter value for pid: 7
Enter value for pname: 'IQOO'
Enter value for price: 43000
Enter value for dist: 600
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (7,'IQOO',43000,600)

1 row created.

SQL> /
Enter value for pid: 8
Enter value for pname: 'ONE PLUS'
Enter value for price: 70000
Enter value for dist: 10000
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (8,'ONE PLUS',70000,10000)

1 row created.

SQL> 9
SP2-0226: Invalid line number
SQL> /
Enter value for pid: 9
Enter value for pname: 'NOKIA'
Enter value for price: 2500
Enter value for dist: NULL
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (9,'NOKIA',2500,NULL)

1 row created.

SQL> /
Enter value for pid: 10
Enter value for pname: 'APPLE'
Enter value for price: 100000
Enter value for dist: 20000
old   1: INSERT INTO PRO VALUES (&PID,&PNAME,&PRICE,&DIST)
new   1: INSERT INTO PRO VALUES (10,'APPLE',100000,20000)

1 row created.

SQL> SELECT *
  2  FROM PRO
  3  ;

       PID PNAME                     PRICE       DIST
---------- -------------------- ---------- ----------
         1 MI                        20000       1000
         2 VIVO                      16000        500
         3 SAMSUNG                   35000       2000
         4 REALME                    25000
         5 ROG                       58000       5000
         6 LG                        40000
         7 IQOO                      43000        600
         8 ONE PLUS                  70000      10000
         9 NOKIA                      2500
        10 APPLE                    100000      20000

10 rows selected.

SQL> 