SELECT * FROM employees;

SELECT * FROM employees WHERE department_id = 50;


-- 1번
SELECT employee_id, first_name, '$'||salary*12 AS "연봉" FROM employees;

-- 2번
SELECT * FROM user_tables;
SELECT * FROM user_views;
SELECT * FROM user_sequences;

-- 3번 오라클 연습용 테이블인 employees 테이블에서,'직급ID/직급에 속한 사원 수/직급별 평균월급'을 평균 월급 내림차순으로 조회해보세요 (배점:20)
SELECT 

job_id,
COUNT(*) AS "직급에 속한 사원 수" ,
TRUNC(AVG(salary * (NVL(commission_pct, 0) + 1)),2)  AS "직급별 평균 월급 "

FROM employees
GROUP BY job_id
ORDER BY TRUNC(AVG(salary * (NVL(commission_pct, 0) + 1)),2) DESC;

SELECT * FROM employees WHERE job_id LIKE 'SH_CLERK';

-- 4번 [문항4] 50번 부서 사원들의 '사번/사원이름/사원 성/매니저번호/매니저이름/매니저 성'을 조회하는 뷰를 생성해보세요 (배점:20)
SELECT employee_id, first_name, last_name, manager_id, manager_ FROM employees WHERE salary > ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');

SELECT
    a.employee_id AS "사번",
    a.first_name AS"사원이름" ,
    a.last_name AS"사원 성",
    a.manager_id AS"매니저번호",
    b.first_name AS "매니저 이름",
    b.last_name AS "매니저 성"

FROM
    employees a, employees b
WHERE
      a.manager_id = b.employee_id
      AND
      a.department_id = 50
      ;
    
-- 5번 서브쿼리를 이용해 Purchasing부서에서 근무하는 사원의 이름과 부서번호를 조회해보세요 (배점:20)
SELECT first_name AS "이름", department_id AS "부서번호"
FROM employees
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'Purchasing');

SELECT * FROm departments;


-- 6번 다음 용어들을 모두 설명해보세요 (DBMS, 테이블, 인덱스, 뷰)


/*
DBMS : DB에 저장된 데이터를 손쉽게 사용하고 관리하기 위해 만든 프로그램으로 질의문(Query)으로 데이터를 관리하고, 쿼리문은 국제 표준을 따른다

테이블: 관계형 데이터베이스는 데이터를 표 형태로 저장한 형태 이며 테이블안에는 속성과 레코드가 있습니다.

인덱스 : 테이블 내의 빠른 검색을 위해 사용되며 새로운 데이터(행)가 추가되면 색인을 다시 생성해야 한다
	인덱스가 있는 컬럼과 없는 컬럼의 검색 속도(쿼리문 처리 속도가)가 많이 다르다
    
뷰 :   물리적인 기본 테이블들을 이용해 생성한 논리적인 가상의 테이블이며 기본 테이블에서 파생된 객체되었으며   
        사용자는 주어진 뷰를 통해 기본 테이블을 제한적으로 사용하게 된다
*/




-- 7번 다음 제약조건들을 모두 설명해보세요 (Primary Key, Foreign Key, Check)
/*
Primary Key : DB에서 테이블을 생성할 때 하나 또는 그 이상의 항목을 기본키(Primary Key)로 설정할 수 있으며 기본키는 해당 테이블에서 가장 기본적인 값을 가집니다.

Foreign Key : 외래키는 두 테이블을 서로 연결하는 데 사용되는 키이며 외래키가 포함된 테이블을 자식 테이블이라고 하고 외래키 값을 제공하는 테이블을 부모 테이블이라한다.

Check : 데이터의 범위나 조건을 직접 지정하여 도메인 무결성을 유지할수 있다
*/

-- 8번 다음과 같은 시퀀스 오브젝트를 생성하는 DDL을 작성하세요 (배점:30)

-- 시작값 207번, 1씩 증가, 최대값 5000번, 순환하지 않음, 캐시 없음, 시퀀스명은 자유

CREATE SEQUENCE free START WITH 207 MAXVALUE 5000 INCREMENT BY 1 NOCYCLE NOCACHE;