-- 07_����.sql

-- ORDER BY
/*
    - ORDER BY ���� ���� ��ȸ�� ������ ���ϴ� �÷� �������� ������ �� �ִ�
    - ORDER BY �÷��� ASC : ASCENDING, ��������, ���� ����
    - ORDER BY �÷��� DESC: DESCENDING, ��������, ���� �Ұ���
*/

SELECT * FROM employees; -- �⺻�����δ� �ε��� �������� ��ȸ�� �ȴ�

SELECT * FROM employees ORDER BY salary; --  ���� ���� ��������
SELECT * FROM employees ORDER BY salary DESC; -- ���� ���� ��������

-- # ���� ������ ������ �� �� �ִ�
-- ex: ���� ���޼����� ������ ��, LAST_NAME ���ĺ� ������ ������ ��, ������� ����
SELECT * FROM employees ORDER BY job_id DESC, last_name, employee_id;

SELECT COUNT(*), job_id FROM employees GROUP BY job_id ORDER BY COUNT(*) DESC;

SELECT * FROM employees;
-- ��������01 : ��� ������� ��ȸ�ϵ� �μ���ȣ�� ������ �� ���� �μ� ������ FIRST_NAME ���ĺ������� �����غ�����
SELECT department_id AS "�μ���ȣ", first_name AS "�̸�" FROM employees GROUP BY department_id, first_name ORDER BY department_id, first_name;

-- ��������02 : ��� ������� �ֱ� �Ի��� ������� ��ȸ�غ�����
SELECT hire_date AS "�Ի���", first_name AS "�̸�" FROM employees GROUP BY hire_date, first_name ORDER BY hire_date DESC;

-- ��������03 : ���� ������ �ִ� ������� ������, ���� �������� �����Ͽ� ��ȸ�غ�����
SELECT last_name AS "���", salary AS "���ޱ���" FROM employees WHERE employee_id IN (SELECT DISTINCT manager_id FROM employees WHERE manager_id IS NOT NULL);

SELECT (SELECT last_name AS "���", salary AS "���ޱ���" FROM employees GROUP BY last_name, salary ORDER BY salary DESC) FROM employees WHERE manager_id IN ( 100, 101, 102);




