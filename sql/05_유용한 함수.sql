--05_������ �Լ�.sql

/*
    # DUAL ���̺�
        - ��� �����ϴ� ���̺�
        - �ϳ��� �ุ ������ �ִ� �׽�Ʈ�� ���̺�
*/
SELECT
    1
FROM
    dual;


-- ABS(n) : ���밪

SELECT
    abs(- 99)
FROM
    dual;

-- FLOOR(n) : ����

SELECT
    3.55,
    floor(3.55)
FROM
    dual;

-- ROUND(n) : �ݿø�

SELECT
    3.55,
    round(3.55)
FROM
    dual;

-- CEIL(n) : �ø�

SELECT
    3.11,
    ceil(3.11)
FROM
    dual;

-- MOD(value, divider) : ������ ����

SELECT
    mod(5, 3)
FROM
    dual;

-- TRUNC(value, �ڸ�) : ������ �ڸ� �� ���ϸ� ������

SELECT
    trunc(1234.56789, 2)
FROM
    dual;

SELECT
    trunc(1234.56789, - 1)
FROM
    dual;

SELECT
    trunc(1234.56789, - 2)
FROM
    dual;

-- TRUNC�� sysdate����

SELECT
    sysdate
FROM
    dual; -- sysdate : ���� ��¥ �� �ð��� �����ش�

-- TRUNC�� ������ ���� Ÿ���� ������ �̿��Ѵ�

SELECT
    trunc(sysdate, 'YEAR')
FROM
    dual;

SELECT
    trunc(sysdate, 'MONTH')
FROM
    dual;

SELECT
    trunc(sysdate, 'DAY')
FROM
    dual;

-- LOWER

SELECT
    lower('ABC')
FROM
    dual;

-- UPPER

SELECT
    upper('abc')
FROM
    dual;

-- SUBSTR(str, start, numOFChar)
-- start���� �ش� ������ŭ�� ���ڸ� �ڸ���

SELECT
    substr('Hellow world!', 1, 4)
FROM
    dual; -- 1 base

SELECT
    substr('Hellow world!', 8)
FROM
    dual;

-- LENGTH

SELECT
    length('55555')
FROM
    dual;

-- LPAD(����, ����, ä�� ����)
-- RPAD(����, ����, ä�� ����)

SELECT
    lpad('MENU', 20, '#')
FROM
    dual;

SELECT
    rpad('MENU', 20, '#')
FROM
    dual;

-- LTRIM(����, ������ ����)

SELECT
    ltrim('#####MENU###', '#')
FROM
    dual;

SELECT
    '           MENU',
    ltrim('           MENU')
FROM
    dual;
-- RTRIM(����, ������ ����)

SELECT
    rtrim('##MENU#####', '#')
FROM
    dual;

SELECT
    'MENU           ',
    rtrim('MENU           ')
FROM
    dual;

-- TRIM() : �� ���� Ư�� ���ڸ� �����Ѵ�

SELECT
    TRIM('#' FROM '##########MENU########')
FROM
    dual;

-- ��¥ �ٷ��

SELECT
    sysdate - 1 ����,
    sysdate AS ����,
    sysdate + 1 AS ����,
    sysdate + 2 AS "���� ��"
FROM
    dual;

-- ��¥ - ��¥

SELECT
    last_name,
    floor((sysdate - hire_date) / 365) AS �ټӳ��
FROM
    employees;

-- ��¥ ���� �����ϱ�
/*
    YYYY : �⵵
    YY : �⵵ (2�ڸ�)
    MM : ���� ���ڷ�
    DD : ��¥
    MON : ���� ���ڷ�
    DAY : ����
    DY : ������ ���Ӹ���
    HH,HH12 : 12��
    HH24 : 24��
    mm,mi : ��
    ss : ��
    AM, PM : ���� ���� ǥ��
*/

SELECT
    last_name,
    to_char(hire_date, 'CC YYYY MONDD DY HH24:mm:ss PM')
FROM
    employees;


-- ROUND�� ��¥�� �Բ� �̿��ϱ�

SELECT
    last_name,
    to_char(round(hire_date, 'DD'), 'CC YY MM DD HH')
FROM
    employees;

SELECT
    last_name,
    trunc(hire_date, 'MONTH')
FROM
    employees;

SELECT
    last_name,
    hire_date
FROM
    employees;


-- TRUNC�� ROUND�� ��¥ ������ ����� �� �ִ�
-- ����� ��¥ ���˰����� ���� �Ǵ� �ݿø��� �Ѵ�
/*
    CC : ����(Centry), (51�� ���ķ� �ݿø�)
    YEAR : 7�� 1�� ���ĺ��� �ݿø�
    MONTH : 16�� �������� �� �ø�
    DAY : �� �� ������ �ݿø� (�� ���� ������������ ��)
*/

-- MONTHS_BETWEEN : �� ��¥ ������ ���� ���� ���Ѵ�

SELECT
    months_between(sysdate, hire_date)
FROM
    employees;

SELECT
    trunc(months_between(sysdate, hire_date))
FROM
    employees;

SELECT
    floor(months_between(sysdate, hire_date))
FROM
    employees;

-- ADD_MONTHS(date, num) : �ش� ��¥�� ������ ���� ���� �߰��Ѵ�

SELECT
    last_name,
    hire_date,
    add_months(hire_date, 6)
FROM
    employees;

-- NEXT_DAY(date, ����) : �ش� ��¥�� �������� ���� ������ ��¥�� ã�´�

SELECT
    next_day(sysdate, 'ȭ����')
FROM
    dual;

SELECT
    next_day(sysdate, '������')
FROM
    dual;

SELECT
    next_day(sysdate, '������')
FROM
    dual;

--LAST_DAY(date) : �ش� ��¥�� ���� ���� ������ ��¥�� ��ȯ�Ѵ�

SELECT
    last_day(sysdate)
FROM
    dual;

SELECT
    last_day('2024/02/01')
FROM
    dual;

-- �� ��ȯ �Լ���
/*
    Number  -  TO_CHAR  ->  Character  - TO_DATE ->  Date
    Number  <- TO_NUMBER -  Character  - TO_CHAR -   Date

*/
-- ��¥�� ���ڷ� ��ȯ (������ ������)

SELECT
    to_char(sysdate, 'YY/MM/DD HH:mi:ss day')
FROM
    dual;

-- ���ڸ� ���ڷ� ��ȯ�� ���� ����
/*
    0 : �ڸ����� ��Ÿ����. ���ڰ� ��� 0���� ä���
    9 : �ڸ����� ��Ÿ����. ���ڰ� ��� ��ĭ���� ä���
    L : �� ������ ��ȭ ��ȣ�� ���δ�
    . : �Ҽ����� ����Ѵ�
    , : õ ������ �����ϴ� ��ǥ�� ���
*/

SELECT
    to_char(123125, '00000,00.0')
FROM
    dual;

SELECT
    to_char(12345, '99999999')
FROM
    dual;

SELECT
    last_name,
    to_char(salary, '99,999L')
FROM
    employees;

-- TO_DATE : ���ڸ� ��¥�� ��ȯ

SELECT
    TO_DATE('1999/05/24', 'YYYY/MM/DD')
FROM
    dual;

SELECT
    TO_DATE('19990524', 'YYYYMMDD')
FROM
    dual;

-- TO_NUMBER : ���ڸ� ���ڷ� ��ȯ

SELECT
    to_number('123,455', '999,999')
FROM
    dual;

-- NVL : NULL�� �ٸ������� ġȯ

SELECT
    nvl(NULL, 'other value')
FROM
    dual;

SELECT
    last_name,
    nvl(commission_pct, '0.0')
FROM
    employees;

SELECT
    last_name,
    'CEO' AS manger_id
FROM
    employees
WHERE
    manager_id IS NULL;

-- DECODE() : switch case���� ������ �Ѵ�

SELECT
    *
FROM
    employees;

SELECT
    last_name AS myname,
    manager_id,
    decode(manager_id,
    -- subquery : ������ ���ο� ���Ǵ� ����
    100, (SELECT last_name FROM employees WHERE employee_id = 100),
    102, 'DE Haan',
    103,(SELECT last_name FROM employees WHERE employee_id = 103)) AS manager_name
FROM
    employees
WHERE
    manager_id IN (
        100,
        102,
        103
    );
    
SELECT * FROM employees;

-- �������� 01: ���޿� ���� �޿��� �λ��ؼ� ����غ�����
--      IT_PROG : 15% �λ�
--      FI_ACCOUNT : 10% �λ�
--      ��� ������ ���� CLERK : 20% �λ�

-- �� ������ �޿��� before_salary�� �λ�� �޿��� after_salary�� ����� ��
-- �޿��� ������ ����� �̸��� �Բ� ����� ��
SELECT
last_name,
job_id,
salary AS before_salary,
decode(job_id,
'IT_PROG', salary * 1.15, 
'FI_ACCOUNT', salary * 1.1,
'SH_CLERK',salary * 1.2,
'ST_CLERK',salary * 1.2,
'PU_CLERK',salary * 1.2) AS after_salary
FROM employees
--WHERE job_id IN ('it_prog', 'FI_ACCOUNT', 'SH_CLERK','ST_CLERK','PU_CLERK'); �Ʒ��� �Ѵ� ��밡��
WHERE job_id IN ('it_prog' , 'FI_ACCOUNT') OR job_id LIKE '%_CLERK';

-- FROM TABLE ���� SELECT���� ���������� �� �� �ִ�
-- �� ������������ ���� �÷��� ��Ī�� �ٱ� SELECT�������� ����� �� �ִ�
SELECT * FROM (SELECT
last_name,
job_id,
salary AS before_salary,
decode(job_id,
'IT_PROG', salary * 1.15, 
'FI_ACCOUNT', salary * 1.1,
'SH_CLERK',salary * 1.2,
'ST_CLERK',salary * 1.2,
'PU_CLERK',salary * 1.2) AS after_salary
FROM employees
WHERE job_id IN ('it_prog', 'FI_ACCOUNT', 'SH_CLERK','ST_CLERK','PU_CLERK'))
WHERE after_salary IS NOT NULL;
    
-- UNION �̿��ϱ�(���3)
SELECT
    last_name,
    job_id,
    salary as befroe_salary,
    salary * 1.15 as after_salary
FROM
    employees
WHERE
    job_id = 'IT_PROG'
UNION

SELECT
    last_name,
    job_id,
    salary ,
    salary * 1.1
FROM
    employees
WHERE
    job_id = 'FI_ACCOUNT'
UNION

SELECT
    last_name,
    job_id,
    salary,
    salary * 1.2
FROM
    employees
WHERE
    job_id LIKE '%CLERK';
    
-- DECODE�� �ش� �÷��� ���� ��Ȯ�ϰ� ��ġ�ϴ� ���� �̿��� �� �ִٴ� ������ �ִ�
-- �׷� ���� CASE���� �̿��Ѵ�

SELECT * FROM(
SELECT last_name, job_id, salary AS before_salary,
    CASE WHEN job_id = 'IT_PROG' THEN salary * 1.15
         WHEN job_id = 'FI_ACCOUNT' THEN salary * 1.1
         WHEN job_id LIKE '%_CLERK' THEN salary * 1.2
    END AS after_salary
FROM
         employees)
WHERE
    after_salary IS NOT NULL;