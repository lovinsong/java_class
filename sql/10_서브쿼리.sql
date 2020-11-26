-- 10_��������.sql

/*
    # ��������
        - �ϳ��� SELECT ���忡 ���Ե� �� �ϳ��� SELECT ����
        - ���� ������ �����ϰ� �ִ� ������ ���� ������� �Ѵ�
        - ���� ������ �񱳿����� �ϴ� ��쿡�� �ݵ�� �������� �����ʿ� ����ؾ� �Ѵ�
        - �ݵ�� ��ȣ�� �ѷ��׾ƾ� �Ѵ�
        - ���������� ���� ������ ����Ǳ� ���� �ѹ��� ���� �ȴ�
        
    # ���� �� ���� ����
        - ���� ������ ���� ����� �� �ϳ��� �ุ ��ȯ�ϴ� ���� ����
        - =, >, >=, <, <=, <>���� �ϳ��� ���� �䱸�ϴ� �� ������ �̹Ƿ�
          ���� �� ���� ������ �Բ� ����ؾ� �Ѵ�
*/

SELECT * FROM employees where last_name = 'King';

-- King�� ���� �μ��� �ٹ��ϴ� ����� ������ ���������� �̿��� ��ȸ�غ���
SELECT * FROM employees WHERE department_id = (SELECT department_id FROM employees where last_name = 'King' AND first_name LIKE 'S%'); -- ������ �����ڴ� ���� ������ ����� ���� ���� �ƴ� ��� ������ �߻��Ѵ�

SELECT * FROM employees;
SELECT * FROM departments;

--���� ���� 01 : Ki Gee �� ������ ������ ���� ����� ��ȸ �غ�����
SELECT * FROM employees WHERE job_id = (SELECT job_id FROM employees WHERE last_name = 'Gee' AND first_name = 'Ki');

-- �������� 02 : ���������� �̿��� Ki Gee���� �޿��� ���� �޴� ������� �̸��� �޿��� ��ȸ�غ�����
SELECT 
    first_name, last_name, salary
    FROM employees
    WHERE salary > (SELECT salary FROM employees WHERE last_name = 'Gee' AND first_name = 'Ki');

-- �������� 03 : ���������� �̿��� purchasing�μ����� �ٹ��ϴ� ����� �̸��� �μ���ȣ�� ��ȸ�غ�����
SELECT
    first_name, last_name, department_id
    FROM employees
    WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'Purchasing');


/*
    # ���� �� ���� ����
        - ���� �������� ��ȯ�Ǵ� ����� �ϳ� �̻��� ���� ���� ����
        - ���� �� �����ڿ� �԰� ����ؾ� �Ѵ�
        - IN : ���� ������ ��� �߿��� �ϳ��� ��ġ�ϸ� ��
        - ANY, SOME : ���� ������ ����� �ϳ� �̻� ��ġ�ϸ� �� 
        - ALL : ���� ������ ����� ��� ���� ��ġ�ؾ� ��
*/

-- �޿��� 10000$ �̻��� ����� �Ҽӵ� �μ����� �ٹ��ϴ� ��� ����� ��ȸ
SELECT
    last_name,
    salary,
    department_id
FROM
    employees
WHERE
    department_id IN (SELECT DISTINCT department_id FROM employees WHERE salary >= 10000) -- (20, 30, 70, 80, 90, 100, 110) : ���� �� ���������� ���� �� �����ڿ� �Բ� ����ؾ� �Ѵ�
ORDER BY
    department_id ASC;
    
-- ALL ������

-- 50�� �μ��� ��� ������� �޿��� ���� �޴� ������� ��ȸ
-- => 50�� �μ����� ���� ���� �޴� ������� �� ���� �޴� ������� ��ȸ
SELECT * FROM employees WHERE salary > ALL (SELECT salary FROM employees WHERE department_id = 50);
SELECT * FROM employees WHERE salary > (SELECT MAX(salary) FROM employees WHERE department_id = 50);

-- 50���μ����� ���Թ޴� �׷��� ����..
SELECT * FROM employees WHERE salary < ALL(SELECT salary FROM employees WHERE department_id = 50);
SELECT * FROM employees WHERE salary < (SELECT MIN(salary) FROM employees WHERE department_id = 50);

-- �������� 04 : ���α׷��ӵ� ���� �޿��� ���� �޴� ������� �̸�/�޿�/��åID�� ����غ�����
-- ���α׷��Ӵ� ������� ������
SELECT first_name, last_name, salary, job_id FROM employees WHERE salary > ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');

-- ANY, SOME ������
--  - ���� ������ ��� ��� �� �� �ϳ� �̻� ��ġ�ϸ� ��

-- 50�� �μ��� ��� ����� �� ���� ���� �޴� ������� ���� �޴� ����� ��ȸ(�ּҰ�)
SELECT * FROM employees WHERE salary > ANY (SELECT salary FROM employees WHERE department_id = 50) ORDER BY salary ;
SELECT * FROM employees WHERE salary > SOME (SELECT salary FROM employees WHERE department_id = 50) ORDER BY salary ;

-- 50�� �μ��� ��� ����� �� ���� ���� �޴� ������� ���� �޴� ����� ��ȸ(�ִ밪)
SELECT * FROM employees WHERE salary < ANY (SELECT salary FROM employees WHERE department_id = 50) ORDER BY salary ;

-- �������� 05 : ���� ���� �޴� ���α׷��Ӻ��� ���� �޴� ��� ����� ��ȸ�غ�����
SELECT * FROM employees WHERE salary > ANY (SELECT salary FROM employees WHERE job_id = 'IT_PROG');

-- EXIST
--  - �ش� ���� ������ ����� �����ϸ� ���� �ȴ�
--  - ���� ������ �����ϴ� �߿� ���� �ϳ��� �߰ߵǸ� �ٷ� True�� �ȴ�

-- job_history ���̺� ����� �����ϴ� ����� ���� ���� ���
SELECT * FROM tab;
SELECT * FROM job_history;

SELECT * FROM employees WHERE EXISTS(SELECT * FROM job_history WHERE employees.employee_id = job_history.employee_id );
SELECT * FROM employees WHERE employee_id IN (SELECT DISTINCT employee_id FROM job_history);
SELECT * FROM employees WHERE employee_id = ANY (SELECT DISTINCT employee_id FROM job_history);






-- �������� 06 : 
