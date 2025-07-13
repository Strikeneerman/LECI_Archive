# BD: Guião 9


## ​9.1
 
### *a)*

```
create procedure DeleteEmployee @ssn char(9)
AS
	BEGIN
		Delete FROM dbo.dependent WHERE Essn=@ssn;
		Delete FROM dbo.works_on WHERE Essn=@ssn;
		UPDATE dbo.department SET Mgr_ssn = NULL WHERE Mgr_ssn=@ssn;
		UPDATE dbo.Employee SET Super_ssn = NULL WHERE Super_ssn = @ssn;
		Delete FROM dbo.Employee WHERE Ssn=@ssn;
	END


```

### *b)* 

```
go 
	create proc sp_record_set(@gestor_ssn char(9) output, @gestor_ano char(9) output)
as  
	begin 
		Select * from Employee as E inner join department as D on  D.Mgr_ssn = E.Ssn;
		Select @gestor_ssn = D.Mgr_ssn, @gestor_ano = DATEDIFF(YEAR, D.Mgr_start_date,GETDATE()) from dbo.department as D
		where D.Mgr_start_date = (Select min(Mgr_start_date) from department);
	end;

Declare @Mgr_ssn char(9);
Declare @work_year char(9);
Exec sp_record_set @Mgr_ssn output, @work_year output;
print @Mgr_ssn;
print @work_year;
```

### *c)* 

```
go 
create Trigger justOne on dbo.department
/*After*/ INSTEAD OF INSERT , update
as 
	Begin
		if(Select count(*) from inserted) > 0
			begin 
				Declare @ssn as char(9);
				Select @ssn = Mgr_ssn from inserted;

				if @ssn = null or ((select count(*) from Employee where Ssn = @ssn) ) = 0
						RAISERROR ('Funcionario inexistente',16,1)
				else
					  begin 
						  if (Select count(Dnumber) from department where Mgr_ssn = @ssn) >= 1 
								 RAISERROR ('O Funcionario já é gestor',16,1)
						   else
								Insert into department Select * from inserted;
					   end
			end
	end

INSERT INTO Department VALUES ('6', 'DETI', 21312332, '2023-05-12');
INSERT INTO Department VALUES ('6', 'Fisica', NULL, '2023-05-12');
INSERT INTO Department VALUES ('6', 'Demat', 321233765, '2023-05-12');	
INSERT INTO Department VALUES ('7', 'Quimica', 231327356, '2023-05-12');
```

### *d)* 

```
GO
CREATE TRIGGER check_salary ON employee
AFTER INSERT, UPDATE
AS
BEGIN
	DECLARE @Salary AS INT;
	DECLARE @MgrSalary AS INT;
	DECLARE @Ssn AS INT;
	DECLARE @Dno AS INT;
	DECLARE @Mgr_ssn AS INT;

	SELECT @Ssn=inserted.Ssn, @Salary=inserted.Salary, @Dno=inserted.Dno FROM inserted;

	SELECT @Mgr_Ssn = Mgr_ssn, @Salary = Salary
	FROM employee, department
	WHERE @Dno = Dnumber AND @Ssn = Ssn;

	SELECT @MgrSalary = Salary
	FROM employee
	WHERE Ssn = @Mgr_Ssn;
	
	IF @Salary > @MgrSalary
	BEGIN
		UPDATE employee SET Salary=@MgrSalary-1 WHERE Ssn=@Ssn;
	END
END
GO
```

### *e)* 

```
create function projetFunc (@ssn char(9)) returns @projeto Table(Pname varchar(60), Plocation varchar(60))
as
   begin
	   insert @projeto
			Select Pname,Plocation from project inner join works_on on Pnumber = Pno where Essn = @ssn;
		return;
   end;
--drop function projetFunc;

Go
select * from Employee;
SELECT * FROM Works_on;
SELECT * FROM Project;
Select * from projetFunc('12652121');
Select * from projetFunc('21312332');
```

### *f)* 

```
... Write here your answer ...
```

### *g)* 

```
GO
CREATE FUNCTION employeeDeptHighAverage(@departId  INT)
RETURNS @table TABLE (
	pname  VARCHAR(15), 
	pnumber INT, 
	plocation VARCHAR(15), 
	dnum INT, 
	budget FLOAT, 
	totalbudget FLOAT )
AS
BEGIN
	DECLARE C CURSOR
        FOR
            SELECT Pname, Pnumber, Plocation, Dnum, SUM((Salary*1.0*Hours)/40) AS Budget 
            FROM project JOIN works_on
            ON Pnumber=Pno
            JOIN employee
            ON Essn=Ssn
            WHERE Dnum=@departId
            GROUP BY Pnumber, Pname, Plocation, Dnum;
 
	DECLARE @pname AS VARCHAR(15), @pnumber AS INT, @plocation as VARCHAR(15), @dnum AS INT, @budget AS FLOAT, @totalbudget AS FLOAT;
	SET @totalbudget = 0;
    OPEN C;
	FETCH C INTO @pname, @pnumber, @plocation, @dnum, @budget;

	WHILE @@FETCH_STATUS = 0
	BEGIN
		SET @totalbudget += @budget;
		INSERT INTO @table VALUES (@pname, @pnumber, @plocation, @dnum, @budget, @totalbudget);
		FETCH C INTO @pname, @pnumber, @plocation, @dnum, @budget;
	END
	CLOSE C;
	DEALLOCATE C;
	RETURN;
END
GO
```

### *h)* 

```
--After
GO
CREATE TRIGGER delete_department_after ON department
AFTER DELETE
AS
BEGIN
	IF NOT (EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'dbo' AND TABLE_NAME = 'Department_Deleted'))
	BEGIN
		CREATE TABLE Department_Deleted(
			Dname VARCHAR(15) NOT NULL,
			Dnumber INT NOT NULL,
			Mgr_ssn CHAR(9) NOT NULL,
			Mgr_start_date DATE,
			PRIMARY KEY (Dnumber),
		);
		INSERT INTO Department_Deleted SELECT * FROM deleted;
	END
	ELSE
	BEGIN
		INSERT INTO Department_Deleted SELECT * FROM deleted;
	END
END



--Instead Off

GO
CREATE TRIGGER delete_department_instead ON department
INSTEAD OF DELETE
AS
BEGIN
	DECLARE @Dnumber AS INT;
	SELECT @Dnumber = Dnumber FROM deleted;

	IF NOT (EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'dbo' AND TABLE_NAME = 'Department_Deleted'))
	BEGIN
		CREATE TABLE Department_Deleted(
			Dname VARCHAR(15) NOT NULL,
			Dnumber INT NOT NULL,
			Mgr_ssn CHAR(9) NOT NULL,
			Mgr_start_date DATE,
			PRIMARY KEY (Dnumber),
		);
		INSERT INTO Department_Deleted SELECT * FROM deleted;
		DELETE FROM DEPARTMENT WHERE Dnumber = @Dnumber;
	END
	ELSE
	BEGIN
		INSERT INTO Department_Deleted SELECT * FROM deleted;
		DELETE FROM DEPARTMENT WHERE Dnumber = @Dnumber;
	END
END

```

### *i)* 

```
... Write here your answer ...
```
