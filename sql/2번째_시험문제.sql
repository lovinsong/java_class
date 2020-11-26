SELECT * FROM employees;

SELECT * FROM employees WHERE department_id = 50;


-- 1��
SELECT employee_id, first_name, '$'||salary*12 AS "����" FROM employees;

-- 2��
SELECT * FROM user_tables;
SELECT * FROM user_views;
SELECT * FROM user_sequences;

-- 3�� ����Ŭ ������ ���̺��� employees ���̺���,'����ID/���޿� ���� ��� ��/���޺� ��տ���'�� ��� ���� ������������ ��ȸ�غ����� (����:20)
SELECT 

job_id,
COUNT(*) AS "���޿� ���� ��� ��" ,
TRUNC(AVG(salary * (NVL(commission_pct, 0) + 1)),2)  AS "���޺� ��� ���� "

FROM employees
GROUP BY job_id
ORDER BY TRUNC(AVG(salary * (NVL(commission_pct, 0) + 1)),2) DESC;

SELECT * FROM employees WHERE job_id LIKE 'SH_CLERK';

-- 4�� [����4] 50�� �μ� ������� '���/����̸�/��� ��/�Ŵ�����ȣ/�Ŵ����̸�/�Ŵ��� ��'�� ��ȸ�ϴ� �並 �����غ����� (����:20)
SELECT employee_id, first_name, last_name, manager_id, manager_ FROM employees WHERE salary > ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');

SELECT
    a.employee_id AS "���",
    a.first_name AS"����̸�" ,
    a.last_name AS"��� ��",
    a.manager_id AS"�Ŵ�����ȣ",
    b.first_name AS "�Ŵ��� �̸�",
    b.last_name AS "�Ŵ��� ��"

FROM
    employees a, employees b
WHERE
      a.manager_id = b.employee_id
      AND
      a.department_id = 50
      ;
    
-- 5�� ���������� �̿��� Purchasing�μ����� �ٹ��ϴ� ����� �̸��� �μ���ȣ�� ��ȸ�غ����� (����:20)
SELECT first_name AS "�̸�", department_id AS "�μ���ȣ"
FROM employees
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'Purchasing');

SELECT * FROm departments;


-- 6�� ���� ������ ��� �����غ����� (DBMS, ���̺�, �ε���, ��)


/*
DBMS : DB�� ����� �����͸� �ս��� ����ϰ� �����ϱ� ���� ���� ���α׷����� ���ǹ�(Query)���� �����͸� �����ϰ�, �������� ���� ǥ���� ������

���̺�: ������ �����ͺ��̽��� �����͸� ǥ ���·� ������ ���� �̸� ���̺�ȿ��� �Ӽ��� ���ڵ尡 �ֽ��ϴ�.

�ε��� : ���̺� ���� ���� �˻��� ���� ���Ǹ� ���ο� ������(��)�� �߰��Ǹ� ������ �ٽ� �����ؾ� �Ѵ�
	�ε����� �ִ� �÷��� ���� �÷��� �˻� �ӵ�(������ ó�� �ӵ���)�� ���� �ٸ���
    
�� :   �������� �⺻ ���̺���� �̿��� ������ ������ ������ ���̺��̸� �⺻ ���̺��� �Ļ��� ��ü�Ǿ�����   
        ����ڴ� �־��� �並 ���� �⺻ ���̺��� ���������� ����ϰ� �ȴ�
*/




-- 7�� ���� �������ǵ��� ��� �����غ����� (Primary Key, Foreign Key, Check)
/*
Primary Key : DB���� ���̺��� ������ �� �ϳ� �Ǵ� �� �̻��� �׸��� �⺻Ű(Primary Key)�� ������ �� ������ �⺻Ű�� �ش� ���̺��� ���� �⺻���� ���� �����ϴ�.

Foreign Key : �ܷ�Ű�� �� ���̺��� ���� �����ϴ� �� ���Ǵ� Ű�̸� �ܷ�Ű�� ���Ե� ���̺��� �ڽ� ���̺��̶�� �ϰ� �ܷ�Ű ���� �����ϴ� ���̺��� �θ� ���̺��̶��Ѵ�.

Check : �������� ������ ������ ���� �����Ͽ� ������ ���Ἲ�� �����Ҽ� �ִ�
*/

-- 8�� ������ ���� ������ ������Ʈ�� �����ϴ� DDL�� �ۼ��ϼ��� (����:30)

-- ���۰� 207��, 1�� ����, �ִ밪 5000��, ��ȯ���� ����, ĳ�� ����, ���������� ����

CREATE SEQUENCE free START WITH 207 MAXVALUE 5000 INCREMENT BY 1 NOCYCLE NOCACHE;