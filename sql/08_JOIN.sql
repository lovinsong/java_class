-- 08_JOIN.sql

/*
    # �ĺ�Ű (Candidate Key)
        - ���̺� ������ �� ���� �����ϰ� ������ �� �ִ� ��� �÷�(�����ȣ, ��ȭ��ȣ, �̸��� ..)
        
    # �⺻Ű (Primary Key, PK)
        - �ĺ�Ű�� �߿��� ���̺��� Ű�� ���õ� ��
        - �� ���̺� �� �⺻Ű�� �ϳ��ۿ� ������ �� ����
        
    # �ܷ�Ű( Foreign Key, KF)
        - �ٸ� ���̺����� �⺻Ű(Ȥ�� �ĺ�Ű)������,
          ���� ���̺����� �ߺ��Ǵ� ���� �÷�
          ex1: employees ���̺��� job_id�� jobs ���̺����� �⺻Ű��
          ex2: employees ���̺��� department_id�� departments ���̺����� �⺻Ű��
        - �ܷ�Ű�� ������ ���̺����� ���谡 �����ȴ�
        - �ٸ� ���̺��� �⺻Ű�� ������ ������ ���̺��� ���踦 �����Ѵ�
        
    #�ٸ� ���̺��� �⺻Ű ������ ����ϴ� ������ ���̺��� ���踦 �����Ѵ�

    ���	�μ���ȣ	����	��Ī	�ϴ���
    A 10	10	����	����	�ڵ�
    B 10	20	..	..	..
    C 20	30
    D 10	40

    ���̺��� ������ �������� �ߺ��� �ּ�ȭ �Ҽ� �ִ�

    ȸ��

    �̸�	�μ���ȣ	����	��Ī	�ϴ���
    A	 10	    ����	����	�ڵ�
    B	 10	    ����	����	�ڵ�
    C	 10	    ����	����	�ڵ�
    D	 10	    ����	����	�ڵ�

    ���̺��� ������ �⺻Ű�� �ܷ�Ű�� �����Ͽ� �� ���̺��� ������� �����Ѵ�
*/
SELECT
    *
FROM
    employees;

SELECT
    *
FROM
    jobs;

SELECT
    *
FROM
    departments;

/*
    # ���̺� JOIN
        - �⺻Ű�� �ܷ�Ű�� �̿��� ���谡 �����Ǿ� �ִ� ���̺����
          ������ �����Ͽ� ��ȸ�ϴ� ��

    # CROSS JOIN
        - �� ���̺��� �����͸� �����Ͽ� ���� �� �ִ� ��� ��츦 ����� JOIN
        - �׳� ��� ��츦 ������ ������� ����
*/

-- �� ���̺��� ������ ��� ��찡 ��µȴ� 

SELECT
    *
FROM
    employees,
    departments; -- 2,889(107 * 27) rows

SELECT
    *
FROM
    employees; -- 107 rows

SELECT
    *
FROM
    departments; -- 27 rows

/*
    # EQUI JOIN
        - �� ���̺� ���� ���� ������ ���� ���� �÷��� �̿��Ͽ�
          CROSS JOIN�� ������� �ǹ��ִ� �����͸� �ɷ����� JOIN
*/
-- ������ �μ��� ��Ī

SELECT
    last_name,
    department_name
FROM
    employees,
    departments
WHERE
    employees.department_id = departments.department_id
ORDER BY
    last_name ASC;

SELECT
    *
FROM
    employees;

SELECT
    *
FROM
    departments;

-- �������� 01 : LAST_NAME�� Bloom�� ����� ������ �μ����� ��ȸ�غ�����

SELECT
    employees.last_name,
    departments.department_name
FROM
    employees,
    departments
WHERE
    employees.department_id = departments.department_id
    AND last_name IN 'Bloom';

-- �������� 02 : JOB_ID�� IT_PROG�� ������� LAST_NAME/�μ���ȣ/�μ���

SELECT
    last_name,
    departments.department_id,
    department_name
FROM
    employees,
    departments
WHERE
    employees.department_id = departments.department_id
    AND employees.job_id IN 'IT_PROG';

-- �������� 03 : Seattle���� �ٹ��ϴ� ��� ����� �̸��� �޿��� ��ȸ�غ�����

SELECT
    employees.last_name,
    salary
FROM
    employees,
    departments,
    locations
WHERE
    departments.location_id = locations.location_id
    AND employees.department_id = departments.department_id
    AND city = 'Seattle';

SELECT
    *
FROM
    employees;

SELECT
    *
FROM
    departments; -- 

SELECT
    *
FROM
    locations; -- 1700�����̼� 

-- �������� 04 : ��å�̸��� Marketing�� �� ��� ����� �̸��� �޿��� ������� ��ȸ�غ�����

SELECT
    last_name,
    salary,
    hire_date
FROM
    employees,
    jobs
WHERE
    employees.job_id = jobs.job_id
    AND job_title LIKE '%Marketing%';

SELECT
    last_name,
    salary,
    hire_date
FROM
    employees,
    departments
WHERE
    employees.manager_id = departments.manager_id
    AND departments.manager_id IN 'Maketing';

-- ���̺��� �����ϰ� �� �ɰ������� �ʿ��Ҷ� �ϳ��� ���̺�� ���ļ� ����� �� �ְ�
-- ������ ���� ���� �� �ִ� (��� �ణ ����)

/*
-- # SELF JOIN
        - �ϳ��� ���̺� ������ �ڽŰ� JOIN�Ͽ� ���ϴ� �����͸� ���� ��
        - MANAGER_ID�� employees ���̺��� �⺻Ű�� �� �� �ִ� �ܷ�Ű�̴�
*/

-- ���� �̸��� �ش� ������ ����ϴ� �Ŵ��� �̸��� ��ȸ

SELECT
    a.first_name,
    a.last_name   AS "���̸�",
    b.last_name   AS "�Ŵ��� �̸�"
FROM
    employees   a,
    employees   b
WHERE
    a.manager_id = b.employee_id
ORDER BY
    a.last_name ASC;
    
-- �������� 05 : �Ŵ����� king�� ������� �̸��� job_title�� ��ȸ�غ�����
SELECT
--    a.last_name AS "��� �̸�",
--    b.manager_id,
    a.last_name AS "����̸�",
    job_title
FROM
    employees a,
    employees b,
    jobs
WHERE
    b.employee_id = a.manager_id
    AND
    a.job_id = jobs.job_id
    AND
    b.last_name = 'King'
ORDER BY
 a.last_name ASC;
    
    SELECT * FROM jobs;
    SELECT * FROM employees;
        
-- �������� 06 : Taylor�� ������ ��å�� ���� ����� ������ ��� ��ȸ�غ�����
SELECT 
    b.*
    FROM
    employees a,
    employees b
WHERE
    a.job_id = b.job_id 
    AND
    a.last_name = 'Taylor'
    ORDER BY
    b.last_name
    ;
    
/*
    # OUTER JOIN
        - JOIN ������ �������� ���ؼ� �������� ���� �����͵��� Ȯ���� �� ����ϴ� JOIN
        - �������� ���� ���� Ȯ���ϰ� �������� �ݴ��� ���ǿ� (+)�� ���δ�
        - (+)�� �������� �࿡ null�� �߰��Ͽ� �������� ���ߴ� ���� Ȯ���Ѵ�
*/
SELECT
    a.last_name AS "���̸�",
    b.last_name AS "�Ŵ��� �̸�"
FROM
    employees a, employees b
WHERE
      a.manager_id(+) = b.employee_id --���� ����
--    a.manager_id = b.employee_id(+) --�ְ� ����
    
ORDER BY
    a.last_name DESC;
    
    
        SELECT * FROM employees;
        SELECT * FROM jobs;
        SELECT * FROM departments;
        SELECT * FROM locations;
-- �������� 07 : �����/�μ���ȣ/�μ��̸�/����ID�� ����ϵ�
-- ����� �Ѹ� ������ ���� �μ��� �Բ� ��ȸ�غ�����
SELECT
    last_name,
    employees.department_id,
    department_name,
    location_id
FROM
    employees , departments
WHERE 
    employees.department_id = departments.department_id;

-- �������� 08 : �����/����ID/���޸��� ����ϵ�
-- ����� �Ѹ� ������ ���� ���޵� �Բ� ��ȸ�غ�����
    
SELECT
    a.last_name,
    a.employee_id,
    job_title
FROM
employees a, employees b, jobs
WHERE 
a.employee_id = b.employee_id
AND
a.job_id = jobs.job_id(+);

SELECT
    last_name, employees.job_id, job_title
    FROM
    employees, jobs
    WHERE
    employees.job_id(+) = jobs.job_id;
    
-- �������� 09: �μ���/�ּ�/���ø��� ����ϵ� �Ҽӵ� �μ��� ���� ���õ� ����غ�����  
        SELECT * FROM departments;
        SELECT * FROM locations;
SELECT
    department_name,
    street_address,
    city
FROM
departments d, locations l
WHERE
d.location_id(+) = l.location_id;
    
    
    
    