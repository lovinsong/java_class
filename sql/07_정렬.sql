-- 07_정렬.sql

-- ORDER BY
/*
    - ORDER BY 절을 통해 조회한 내용을 원하는 컬럼 기준으로 정렬할 수 있다
    - ORDER BY 컬럼명 ASC : ASCENDING, 오름차순, 생략 가능
    - ORDER BY 컬럼명 DESC: DESCENDING, 내림차순, 생략 불가능
*/

SELECT * FROM employees; -- 기본적으로는 인덱스 기준으로 조회가 된다

SELECT * FROM employees ORDER BY salary; --  월급 기준 오름차순
SELECT * FROM employees ORDER BY salary DESC; -- 월급 기준 내림차순

-- # 정렬 조건을 여러개 줄 수 있다
-- ex: 먼저 직급순으로 정렬한 후, LAST_NAME 알파벳 순으로 정렬한 후, 사번으로 정렬
SELECT * FROM employees ORDER BY job_id DESC, last_name, employee_id;

SELECT COUNT(*), job_id FROM employees GROUP BY job_id ORDER BY COUNT(*) DESC;

SELECT * FROM employees;
-- 연습문제01 : 모든 사원들을 조회하되 부서번호로 정렬한 뒤 같은 부서 끼리는 FIRST_NAME 알파벳순으로 정렬해보세요
SELECT department_id AS "부서번호", first_name AS "이름" FROM employees GROUP BY department_id, first_name ORDER BY department_id, first_name;

-- 연습문제02 : 모든 사원들을 최근 입사한 순서대로 조회해보세요
SELECT hire_date AS "입사일", first_name AS "이름" FROM employees GROUP BY hire_date, first_name ORDER BY hire_date DESC;

-- 연습문제03 : 부하 직원이 있는 사원들의 정보를, 월급 기준으로 정렬하여 조회해보세요
SELECT last_name AS "사원", salary AS "월급기준" FROM employees WHERE employee_id IN (SELECT DISTINCT manager_id FROM employees WHERE manager_id IS NOT NULL);

SELECT (SELECT last_name AS "사원", salary AS "월급기준" FROM employees GROUP BY last_name, salary ORDER BY salary DESC) FROM employees WHERE manager_id IN ( 100, 101, 102);




