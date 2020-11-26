-- 02_SELECT.sql

/*
    # SELECT �÷��� FROM ���̺��;
        - �����͸� ��ȸ�ϴ� ������
        - �÷��� *�� ���� ���� ��� �÷��� ���Ѵ�
*/

-- tab���̺��� ��� �÷�(�Ӽ�, �ʵ�, ��)�� ��ȸ�Ѵ�
SELECT * FROM TAB; 

 -- ���� ���̺��� ��� �÷��� ��ȸ�Ѵ�
SELECT * FROM employees;
SELECT * FROM departments;

-- �÷����� ������ �ش� �÷��� �����͸� ��ȸ�Ѵ�
SELECT last_name, phone_number, hire_date FROM employees;

-- ������ ���̺� ����
/*
    COUNTRIES : ���������� ������ ���̺�
    EMPLOYEES : ��� ������ ������ ���̺�
    DEPARTMENTS  : �μ� ������ ������ ���̺�
    JOBS : ���� ������ ������ ���̺�
    LOCATIONS : ���� ������ ������ ���̺�
    REGIONS : ��� ������ ������ ���̺�
*/

-- ���̺��� �Ӽ� ���� ����
DESC employees;

DESC countries;

-- ����Ŭ�� ������ Ÿ��
/*
    # NUMBER(n) , NUMBER(��ü �ڸ���, �Ҽ��� �ڸ���)
        - ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
        - NUMBER(6) : 6�ڸ� ������ ������ �� �ִ� �÷��� �ȴ�
          -> 000000
        - NUMBER(6, 3) : 3�ڸ� ������ 3�ڸ� �Ҽ����� ������ �� �ִ� �÷��� �ȴ�
          -> 000.000
    # CHAR(n)
        - ���� ���� ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
        - ������ ���̺��� ���� ���� �����Ͱ� ��������
          ���������� ������ ���̸� �����Ѵ�
        - CHAR(10)�� ������ �÷��� 2���ڰ� �������� 10����Ʈ�� �����Ѵ�
    # VARCHAR2(n)
        - ���� ���� ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
        - ����� �������� ũ�⿡ ���� �˸��� ������ ����Ѵ�
        - ���� ������ ���� ���� �� �ִ�
        - VARCHAR2(10)�� ������ �÷��� 2���ڰ� ������ 2����Ʈ�� �����Ѵ�
    # DATE
        - ��¥ �� �ð��� �����ϴ� �÷� Ÿ��
        - ����/��/��/��/��/��/��/���� ���� �����Ѵ�
*/

SELECT * FROM countries;

-- ��������01 : ��� ����� ���/�̸�/����/�μ���ȣ�� ��ȸ�غ�����

SELECT employee_id, first_name, salary, department_id FROM employees;

-- �� �÷���, ���̺��, Ű����� ��ҹ��ڸ� �������� �ʴ´�.

-- ��������ڷ� ���� �� ����ϱ�
SELECT last_name, salary FROM employees;
SELECT last_name, salary + 500 FROM employees;
SELECT last_name, salary * 2 FROM employees;
SELECT last_name, salary / 10 FROM employees;

-- ���޿� ���ʽ� �����غ���
-- �÷����� ���� ������ ������� ��� AS�� �̿��� �÷����� ������ �� �ִ�
SELECT last_name, commission_pct * salary FROM employees;
SELECT last_name, commission_pct * salary AS ���ʽ� FROM employees;

-- ���� + ���ʽ� ����غ���
-- �� null�� �������� �ʴ� ���̱� ������ ������꿡 ���ԵǸ� ������ null�� �ȴ�
SELECT last_name, salary + commission_pct * salary AS �Ǽ��ɾ� FROM employees;

-- NVL(�÷���, ��ü��) �Լ� : �ش� �ķ����� NULL���� ������ �� ��ü���� ����Ѵ�
SELECT
    last_name, salary * (NVL(commission_pct, 0) + 1) AS total_salary FROM employees;

-- "�÷���"�� �̿��ϸ� �÷����� ��ҹ��ڸ� ������ �� �ִ�
SELECT last_name AS "Last_Name" FROM employees;
SELECT last_name AS "lastName" FROM employees;

-- ��������02 : ��� ������� ���/�̸�/������ ����غ�����(����� salary�� ����, ���� �÷����� �ѱ� ��Ī�� ���)
SELECT employee_id AS ���,last_name AS �̸�, salary * (NVL(commission_pct, 0) + 1) * 12 AS "����($)" FROM employees;

-- SELECT DISTINCT : �ߺ��Ǵ� ����� �־ �� ���� ��ȸ�ȴ�

-- ��� �������� ��å�� �ѹ����� �� �� �ִ�
SELECT DISTINCT job_id FROM employees;

-- ��� �������� ���� �μ���ȣ�� �ѹ����� �� �� �ִ�
SELECT DISTINCT department_id FROM employees;

-- �Ŵ��� ������ �ϰ� �ִ� ������� ����� �ѹ����� ��ȸ �� �� �ִ�
SELECT DISTINCT manager_id FROM employees;





