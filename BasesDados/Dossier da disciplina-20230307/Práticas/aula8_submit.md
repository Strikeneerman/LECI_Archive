# BD: Guião 8


## ​8.1. Complete a seguinte tabela.
Complete the following table.

| #    | Query                                                                                                      | Rows  | Cost  | Pag. Reads | Time (ms) | Index used | Index Op.            | Discussion |
| :--- | :--------------------------------------------------------------------------------------------------------- | :---- | :---- | :--------- | :-------- | :--------- | :------------------- | :--------- |
| 1    | SELECT * from Production.WorkOrder                                                                         | 72591 | 0.484 | 531        | 1171      | WorkOrderID (PK)         | Clustered Index Scan |            |
| 2    | SELECT * from Production.WorkOrder where WorkOrderID=1234                                                  |   1   | 0.003 | 278        | 479       | WorkOrderID (PK)          | Clustered Index Seek |            |
| 3.1  | SELECT * FROM Production.WorkOrder WHERE WorkOrderID between 10000 and 10010                               | 11,998| 0.003 | 278        | 422       | WorkOrderID (PK)           | Clustered Index Seek |            |
| 3.2  | SELECT * FROM Production.WorkOrder WHERE WorkOrderID between 1 and 72591                                   | 72591 | 0.484 | 810        | 1531      | WorkOrderID (PK)           | Clustered Index Seek |            |
| 4    | SELECT * FROM Production.WorkOrder WHERE StartDate = '2007-06-25'                                          |   1   | 0.523 | 554        | 244       | WorkOrderID (PK)           | Clustered Index Scan |            |
| 5    | SELECT * FROM Production.WorkOrder WHERE ProductID = 757                                                   |  11,4 | 0.037 | 300        | 569       | ProductID          | Non Clustered Index Seek e Clustered Key Lookup  |            |
| 6.1  | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 757                              |  11,4 | 0.003 | 290       | 148       |  ProductID Covered (StartDate)          | Non Clustered Index Seek |            |
| 6.2  | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 945                              | 1105  | 0.005 | 294      |280       |  ProductID Covered (StartDate)          | Non Clustered Index Seek |            |
| 6.3  | SELECT WorkOrderID FROM Production.WorkOrder WHERE ProductID = 945 AND StartDate = '2006-01-04'            |   1   | 0,003  | 292      | 50         |     ProductID Covered (StartDate)        |   Non Clustered Index Seek     |          |
| 7    | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 945 AND StartDate = '2006-01-04' |       |       |            |           |    ProductID and StartDate                      |        |            |
| 8    | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 945 AND StartDate = '2006-01-04' |       |       |            |           |     Composite (ProductID, StartDate)       |                    |            |

## ​8.2.

### a)

```
 create clustered index IndRid on mytemp(rid) with (fillfactor = 90);
```

### b)

```
Milliseconds used: 125626

percentagem de fragmentação dos índices: 99,4%
percentagem de ocupação das páginas dos índices: 68,6%
```

### c)

```
fillfactor: 65
Miliseconds used: 128800

fillfactor: 80
Miliseconds used: 133130

fillfactor: 90
Miliseconds used: 123536
```

### d)

```
Miliseconds used: 123536
```

### e)

```
Sem index
Milliseconds used: 123220
Com index
Milliseconds used: 109876
```

## ​8.3.

```
I
create unique clustered index ssn_pk on employee(ssn)
II
create nonclustered index Fullname_pk on employee(Fname, Lname)

```
