-- 14_제약 조건.sql

/*
    # 데이터 무결성
        - 데이터가 항상 유지해야 하는 성질
        - 정확성 + 일관성을 유지하기 위해 필요한 것
        
        - 개체 무결성 
            하나의 행을 구분할 수 있는 컬럼이 반드시 존재 해야 한다
            테이블에 반드시 PK(Primary Key)가 존재해야 한다
        - 참조 무결성
            참조 관계에 있는 데이터가 항상 일관된 값을 가져야 한다
            외래키는 반드시 참조하는 테이블에 존재하는 값을 사용해야 한다
        - 도메인 무결성
            해당 컬럼의 값의 타입이 일정해야 한다          
    
    # 데이터 무결성 제약 조건
        - 테이블에 무결성을 해치는 부적절한 데이터가 입력되는것을 방지하기 위한 규칙
        - NOT NULL : 해당 컬럼에 NULL을 허용하지 않는 규칙
        - UNIQUE : 해당 컬럼에 중복값을 허용하지 않는 규칙. 항상 유일한 값을 갖도록 한다.
        - PRIMARY KEY : NOT NULL + UNIQUE. 해당 컬럼이 기본키가 된다.
        - FOREIGN KEY : 외래키로 설정된 컬럼은 참조하는 컬럼에 존재하는 값만 추가할 수 있다.
        - CHECK : 데이터의 범위나 조건을 직접 지정하여 도메인 무결성을 유지할수 있다
    
*/

SELECT * FROM employees;
SELECT * FROM departments;
DESC employees;
-- # 제약조건 데이터 딕셔너리 뷰를 통해 테이블의 제약조건을 확인할 수 있다
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';
SELECT * FROM all_constraints WHERE OWNER = 'HR' AND table_name = 'DEPARTMENTS';

/*
    # 제약 조건 테이블 보는 방법
    
        - CONSTRAINT_TYPE
            P : Primary Key
            R : Foreign Key
            C : Check or Not null
            U : UNIQUE ( NULL값 가능)
        
        - OWNER : 테이블의 소유자 (user)
        
        - R_이 붙은 컬럼들은 해당 외래키가 참조하는 컬럼(PK, UNIQUE)의 정보를 담고 있다
            R_OWNER : 외래키가 참조하는 테이블의 소유자
            R_CONSTRAINT_NAME : 외래키가 참조하는 컬럼의 제약조건
*/

-- # 제약 조건 정의하기
CREATE TABLE FRUITS(
    fid NUMBER(10) PRIMARY KEY ,
    fname VARCHAR2(30) NOT NULL
    );

DESC fruits
SELECT * FROM user_constraints WHERE table_name = 'FRUITS';

-- # 컬럼 추가 시 제약조건 정의하기
ALTER TABLE FRUITS ADD (color VARCHAR2(10) NOT NULL);
/*
    ※ 제약조건을 정의할 때 제약조건명을 지정하지 않으면 오라클이 제약조건명을 자동으로 부여한다
      오라클이 자동으로 부여한 제약조건명으로는 어떤 제약조건을 위반했는지 알기 힘들기 때문에
      제약조건명을 반드시 지정하는 것이 좋다.

    # 제약조건 명명 규칙 : [테이블명]_[컬럼명]_[제약조건 유형]
        ex : EMP_DEPT_FK
             DEPT_ID_PK
             DEPT_LOC_FK
             DEPT_NAME_NN
*/

-- # 제약조건 이름과 함께 제약 조건 정의하는 방법
ALTER TABLE fruits ADD (
    sweet NUMBER(4, 2) CONSTRAINT fruit_sweet_nn NOT NULL,
    fsize NUMBER(2) CONSTRAINT fruit_size_stan CHECK(fsize BETWEEN 10 AND 20)
);

-- # 하나의 컬럼에 제약조건 여러개 추가할 때
ALTER TABLE fruits ADD (
    fsize NUMBER(2)
    CONSTRAINT fruit_size_stan CHECK(fsize BETWEEN 10 AND 20) 
    CONSTRAINT fruit_size_nn NOT NULL 
);

DESC fruits;

SELECT * FROM user_constraints WHERE table_name = 'FRUITS';

INSERT INTO fruits VALUES(1, '배','brown', 8.88, -5);
INSERT INTO student VALUES(0002,'난천재','M','F','010-1562-1534');
INSERT INTO student VALUES(1004,'집이최고','F','B','011-1721-1245');
INSERT INTO student VALUES(2500,'홍길동바보','F','C','010-9181-1544');
INSERT INTO student VALUES(2700,'김수한무거북이와두루','M','C','010-9181-1544');

SELECT * FROM user_constraints WHERE table_name = 'STUDENT';

SELECT * FROM student;

/*
    # DEFAULT 제약 조건
        - 컬럼에 아무 값도 입력하지 않았을 때 사용할 기본값을 설정해둔다
*/
ALTER TABLE student ADD (
    stu_kor NUMBER(3) DEFAULT 0
);

ALTER TABLE student MODIFY(
    stu_kor NUMBER(3) DEFAULT 3
    );

-- # 테이블 컬럼 데이터 딕셔너리 뷰에서 해당 컬럼의 data_default를 확인할 수 있다
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENT';

/*
    연습문제 01 : 학생 테이블을 생성하되 다음과 같은 제약조건을 지켜서 만들어보세요
    
        학생번호 4자리 정수, PK
        학생이름 10글자(->바이트) 가변문자, NOT NULL
        학생성별 1글자 고정문자, 값으로는 M 또는 F만 허용
        학생성적 1글자 고정문자, 값으로는 A,B,C,D,F 만 허용, NOT NULL
        핸드폰번호 13글자 고정문자,오라클 정규표현식 함수를 이용해 핸드폰 정규식을 만족하는 경우만 허용, NOT NULL
*/
DESC employees;
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';

/*
    # table-level에서 제약조건 정의하기
        - 컬럼을 모두 정의한 뒤에 따로 제약조건 정의하기
        - DEFAULT와 NOT NULL은 Table Label에서 정의할 수 없다
*/

CREATE TABLE students2 (
    stu_id      NUMBER(4),
    stu_name    VARCHAR2(30) DEFAULT '김철수' CONSTRAINT stu2_name_nn NOT NULL,
    stu_gender  CHAR(1),
    stu_grade   CHAR(1),
    stu_phone   CHAR(13),
    CONSTRAINT stu2_id_pk PRIMARY KEY( stu_id ),
--    CONSTRAINT STU2_id_pk PRIMARY KEY(stu_id, stu_phone), -- 테이블 라벨을 이용하면 복합 기본키를 지정할 수 있다
    CONSTRAINT stu2_gender_chk CHECK ( stu_gender IN ( 'M', 'F')),
    CONSTRAINT stu2_grade_chk CHECK ( stu_grade IN ('A','B','C','D','F'))
    );

-- column-level CONSTRAINT 
--CREATE TABLE student (
--    stuid NUMBER(4) CONSTRAINT student_stuid_pk PRIMARY KEY,
--    sname VARCHAR2(30) CONSTRAINT student_sname_nn NOT NULL,
--    sgender CHAR(1) CONSTRAINT student_sgender_chk CHECK(sgender IN ('M' ,'F')),
--    sgrade CHAR(1) CONSTRAINT student_sgrade_chk CHECK(sgrade IN ('A','B','C','D','F')) CONSTRAINT student_sgrade_nn NOT NULL,
--    sphone CHAR(13) CONSTRAINT student_sphone_chk CHECK(REGEXP_LIKE(sphone, '01[01]-\d{4}-\d{4}')) CONSTRAINT student_sphone_nn NOT NULL CONSTRAINT student_sphone_ek UNIQUE
--    );
-- 수정가능
-- ALTER TABLE 테이블명 RENAME CONSTRAINT 바꾸기 전 테이블명 TO 바꿀 테이블명;  
    
DROP TABLE students2;
    
DESC students2;
ALTER TABLE students2 DROP COLUMN stu_phone;

/*
    # Foreign Key 설정하기
        - 제약조건을 설정할 때 어떤 테이블의 어떤 제약 조건을 참조할지 함께 설정해야 한다

*/

SELECT * FROM locations;
SELECT * FROM user_constraints WHERE table_name ='LOCATIONS'; --loc_id_pk

-- # 컬럼 레벨로 FK 설정하기

-- 다른 테이블의 PK혹은 UNIQUE로 설정된 컬럼만 외래키로 참조할 수 있다
ALTER TABLE student ADD(
    location_id NUMBER(4) CONSTRAINT stu_loc_fk REFERENCES locations(location_id)
);

-- PK 혹은 외래키가 아닌 컬럼을 참조하는 경우
ALTER TABLE student ADD(
    stu_parent NUMBER(25) CONSTRAINT stu_pa_fk REFERENCES employees( last_name )
);

-- # 테이블 레벨로 FK 설정하기
--  - FK역할을 하는 컬럼은 FOREIGN KEY로 설정하고, 참조하는 테이블 및 컬럼은 REFERENCES로 설정한다
ALTER TABLE student ADD(
    department_id NUMBER(4), CONSTRAINT stu_dept_fk FOREIGN KEY(department_id) REFERENCES departments ( department_id)
);

SELECT * FROM student;

INSERT INTO student VALUES(1,'홍길동','M','B','011-1211-1234', 90, 2500, 10);

SELECT *FROM locations;

SELECT * FROM student
INNER JOIN locations USING(location_id)
INNER JOIN departments USING( department_id)
;


DESC students2;
ALTER TABLE students2 ADD (
    stu_phone CHAR(13)
);

-- 이미 존재하는 컬럼에 제약조건 추가하기
ALTER TABLE students2 ADD CONSTRAINT stu2_ph_uk UNIQUE(stu_phone);

SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';

-- # 컬럼에 이미 존재하는 제약조건 제거하기
ALTER TABLE students2 DROP CONSTRAINT stu2_ph_uk;

-- # NOT NULL, DEFAULT는 ADD CONSTRAINT대신 MODIFY를 이용해 컬럼을 수정한다
ALTER TABLE students2 MODIFY stu_phone CONSTRAINT stu2_ph_nn NOT NULL;
ALTER TABLE students2 MODIFY stu_phone DEFAULT '000-0000-0000';

-- # 확인용
SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENTS2';

/*
    # ON DELETE 절
        - FK가 참조하고 있는 PK가 삭제되었을 때 해당 FK를 어떻게 변경할지 설정한다
        - CASCADE : 참조하던 PK가 삭제 되면 FK의 행을 함께 삭제한다
            ex : departments에서 50번 부서를 삭제하면 employees의 모든 50번 부서에 속한 사원이 삭제된다
        - SET NULL : 참조하던 PK가 삭제되면 FK의 값을 NULL로 변환한다
            ex : departments에서 50번 부서를 삭제하면 employees의 모든 50번 부서에 속한 사원의
                 department_id를 null로 변환한다
        - RESTRICT : ON DELETE를 설정하지 않은 경우 자식이 있는 부모키의 삭제를 금지한다
*/

CREATE TABLE empp AS SELECT * FROM employees;
CREATE TABLE depp AS SELECT * FROM departments;
CREATE TABLE jobb AS SELECT * FROM jobs;

SELECT * FROM user_constraints WHERE table_name = 'EMPP';
SELECT * FROM user_constraints WHERE table_name = 'DEPP';

SELECT * FROM empp;
SELECT * FROM depp;

-- 연습문제02 : empp테이블과 depp테이블의 기본키/외래키 제약 조건을 설정해보세요

-- 지울때는 SYS_0000 <-- 정확한 숫자를 넣어야 삭제 가능
-- SYS_C0011776, SYS_C0011777, SYS_C0011778, SYS_C0011779
--  lastname         email         hire_date     job_id

-- 기본키를 먼저 추가 해야한다
ALTER TABLE empp ADD CONSTRAINT empp_emp_ip_pk PRIMARY KEY(employee_id);
ALTER TABLE depp ADD CONSTRAINT depp_id_pk PRIMARY KEY(department_id);
ALTER TABLE jobb ADD CONSTRAINT jobb_id_pk PRIMARY KEY(job_id);

-- 그후에 외래키 추가.
ALTER TABLE empp ADD (
    CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) REFERENCES depp(department_id),
    CONSTRAINT empp_manager_fk FOREIGN KEY(manager_id) REFERENCES empp(employee_id),
    CONSTRAINT empp_job_fk FOREIGN KEY(job_id) REFERENCES jobb(job_id)
    -- Self References : 내 테이블의 employee_id에 포함된 값만 manager_id 컬럼에 추가할 수 있다
);

/*
ALTER TABLE empp MODIFY(
    hire_date CONSTRAINT empp_hire_date_nn NOT NULL,
    job_id CONSTRAINT empp_job_nn NOT NULL,
    email CONSTRAINT empp_email_nn NOT NULL,
    last_name CONSTRAINT empp_lat_name_nn NOT NULL
);
*/



-- # ON DELETE 테스트

-- 1. 외래키를 ON DELETE로 설정
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id)
    REFERENCES depp(department_id) ON DELETE CASCADE;

SELECT * FROM empp ORDER BY department_id;
SELECT * FROM depp;

-- 2. 부모키를 삭제 (30번 부서를 삭제)
DELETE FROM depp WHERE department_id = 30;

-- ※ CASCADE는 부모키를 삭제하면 관련 FK행이 모두 삭제된다.


-- # ON DELETE SET NULL 테스트

-- 1. 외래키를 ON DELETE SET NULL로 설정
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id)
    REFERENCES depp(department_id) ON DELETE SET NULL;

-- 2. SET NULL인 상태로 100번 부서를 삭제
DELETE FROM depp WHERE department_id = 100;

SELECT * FROM empp ORDER BY department_id DESC;

-- # ON DELETE 미설정 테스트

-- 1. 외래키를 ON DELETE 기본값(RESTRICT)으로 설정
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id)
    REFERENCES depp(department_id);

-- 2. 기본값인 상태로 50번 부서를 삭제
DELETE FROM depp WHERE department_id = 50;

SELECT * FROM empp ORDER BY department_id DESC;
-- ※ ON DELETE절이 설정되어 있지 않은 경우에는 자식 레코드가 있는 부모키를 삭제할 수 없다


