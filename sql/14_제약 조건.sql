-- 14_���� ����.sql

/*
    # ������ ���Ἲ
        - �����Ͱ� �׻� �����ؾ� �ϴ� ����
        - ��Ȯ�� + �ϰ����� �����ϱ� ���� �ʿ��� ��
        
        - ��ü ���Ἲ 
            �ϳ��� ���� ������ �� �ִ� �÷��� �ݵ�� ���� �ؾ� �Ѵ�
            ���̺� �ݵ�� PK(Primary Key)�� �����ؾ� �Ѵ�
        - ���� ���Ἲ
            ���� ���迡 �ִ� �����Ͱ� �׻� �ϰ��� ���� ������ �Ѵ�
            �ܷ�Ű�� �ݵ�� �����ϴ� ���̺� �����ϴ� ���� ����ؾ� �Ѵ�
        - ������ ���Ἲ
            �ش� �÷��� ���� Ÿ���� �����ؾ� �Ѵ�          
    
    # ������ ���Ἲ ���� ����
        - ���̺� ���Ἲ�� ��ġ�� �������� �����Ͱ� �ԷµǴ°��� �����ϱ� ���� ��Ģ
        - NOT NULL : �ش� �÷��� NULL�� ������� �ʴ� ��Ģ
        - UNIQUE : �ش� �÷��� �ߺ����� ������� �ʴ� ��Ģ. �׻� ������ ���� ������ �Ѵ�.
        - PRIMARY KEY : NOT NULL + UNIQUE. �ش� �÷��� �⺻Ű�� �ȴ�.
        - FOREIGN KEY : �ܷ�Ű�� ������ �÷��� �����ϴ� �÷��� �����ϴ� ���� �߰��� �� �ִ�.
        - CHECK : �������� ������ ������ ���� �����Ͽ� ������ ���Ἲ�� �����Ҽ� �ִ�
    
*/

SELECT * FROM employees;
SELECT * FROM departments;
DESC employees;
-- # �������� ������ ��ųʸ� �並 ���� ���̺��� ���������� Ȯ���� �� �ִ�
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';
SELECT * FROM all_constraints WHERE OWNER = 'HR' AND table_name = 'DEPARTMENTS';

/*
    # ���� ���� ���̺� ���� ���
    
        - CONSTRAINT_TYPE
            P : Primary Key
            R : Foreign Key
            C : Check or Not null
            U : UNIQUE ( NULL�� ����)
        
        - OWNER : ���̺��� ������ (user)
        
        - R_�� ���� �÷����� �ش� �ܷ�Ű�� �����ϴ� �÷�(PK, UNIQUE)�� ������ ��� �ִ�
            R_OWNER : �ܷ�Ű�� �����ϴ� ���̺��� ������
            R_CONSTRAINT_NAME : �ܷ�Ű�� �����ϴ� �÷��� ��������
*/

-- # ���� ���� �����ϱ�
CREATE TABLE FRUITS(
    fid NUMBER(10) PRIMARY KEY ,
    fname VARCHAR2(30) NOT NULL
    );

DESC fruits
SELECT * FROM user_constraints WHERE table_name = 'FRUITS';

-- # �÷� �߰� �� �������� �����ϱ�
ALTER TABLE FRUITS ADD (color VARCHAR2(10) NOT NULL);
/*
    �� ���������� ������ �� �������Ǹ��� �������� ������ ����Ŭ�� �������Ǹ��� �ڵ����� �ο��Ѵ�
      ����Ŭ�� �ڵ����� �ο��� �������Ǹ����δ� � ���������� �����ߴ��� �˱� ����� ������
      �������Ǹ��� �ݵ�� �����ϴ� ���� ����.

    # �������� ��� ��Ģ : [���̺��]_[�÷���]_[�������� ����]
        ex : EMP_DEPT_FK
             DEPT_ID_PK
             DEPT_LOC_FK
             DEPT_NAME_NN
*/

-- # �������� �̸��� �Բ� ���� ���� �����ϴ� ���
ALTER TABLE fruits ADD (
    sweet NUMBER(4, 2) CONSTRAINT fruit_sweet_nn NOT NULL,
    fsize NUMBER(2) CONSTRAINT fruit_size_stan CHECK(fsize BETWEEN 10 AND 20)
);

-- # �ϳ��� �÷��� �������� ������ �߰��� ��
ALTER TABLE fruits ADD (
    fsize NUMBER(2)
    CONSTRAINT fruit_size_stan CHECK(fsize BETWEEN 10 AND 20) 
    CONSTRAINT fruit_size_nn NOT NULL 
);

DESC fruits;

SELECT * FROM user_constraints WHERE table_name = 'FRUITS';

INSERT INTO fruits VALUES(1, '��','brown', 8.88, -5);
INSERT INTO student VALUES(0002,'��õ��','M','F','010-1562-1534');
INSERT INTO student VALUES(1004,'�����ְ�','F','B','011-1721-1245');
INSERT INTO student VALUES(2500,'ȫ�浿�ٺ�','F','C','010-9181-1544');
INSERT INTO student VALUES(2700,'����ѹ��ź��̿͵η�','M','C','010-9181-1544');

SELECT * FROM user_constraints WHERE table_name = 'STUDENT';

SELECT * FROM student;

/*
    # DEFAULT ���� ����
        - �÷��� �ƹ� ���� �Է����� �ʾ��� �� ����� �⺻���� �����صд�
*/
ALTER TABLE student ADD (
    stu_kor NUMBER(3) DEFAULT 0
);

ALTER TABLE student MODIFY(
    stu_kor NUMBER(3) DEFAULT 3
    );

-- # ���̺� �÷� ������ ��ųʸ� �信�� �ش� �÷��� data_default�� Ȯ���� �� �ִ�
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENT';

/*
    �������� 01 : �л� ���̺��� �����ϵ� ������ ���� ���������� ���Ѽ� ��������
    
        �л���ȣ 4�ڸ� ����, PK
        �л��̸� 10����(->����Ʈ) ��������, NOT NULL
        �л����� 1���� ��������, �����δ� M �Ǵ� F�� ���
        �л����� 1���� ��������, �����δ� A,B,C,D,F �� ���, NOT NULL
        �ڵ�����ȣ 13���� ��������,����Ŭ ����ǥ���� �Լ��� �̿��� �ڵ��� ���Խ��� �����ϴ� ��츸 ���, NOT NULL
*/
DESC employees;
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';

/*
    # table-level���� �������� �����ϱ�
        - �÷��� ��� ������ �ڿ� ���� �������� �����ϱ�
        - DEFAULT�� NOT NULL�� Table Label���� ������ �� ����
*/

CREATE TABLE students2 (
    stu_id      NUMBER(4),
    stu_name    VARCHAR2(30) DEFAULT '��ö��' CONSTRAINT stu2_name_nn NOT NULL,
    stu_gender  CHAR(1),
    stu_grade   CHAR(1),
    stu_phone   CHAR(13),
    CONSTRAINT stu2_id_pk PRIMARY KEY( stu_id ),
--    CONSTRAINT STU2_id_pk PRIMARY KEY(stu_id, stu_phone), -- ���̺� ���� �̿��ϸ� ���� �⺻Ű�� ������ �� �ִ�
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
-- ��������
-- ALTER TABLE ���̺�� RENAME CONSTRAINT �ٲٱ� �� ���̺�� TO �ٲ� ���̺��;  
    
DROP TABLE students2;
    
DESC students2;
ALTER TABLE students2 DROP COLUMN stu_phone;

/*
    # Foreign Key �����ϱ�
        - ���������� ������ �� � ���̺��� � ���� ������ �������� �Բ� �����ؾ� �Ѵ�

*/

SELECT * FROM locations;
SELECT * FROM user_constraints WHERE table_name ='LOCATIONS'; --loc_id_pk

-- # �÷� ������ FK �����ϱ�

-- �ٸ� ���̺��� PKȤ�� UNIQUE�� ������ �÷��� �ܷ�Ű�� ������ �� �ִ�
ALTER TABLE student ADD(
    location_id NUMBER(4) CONSTRAINT stu_loc_fk REFERENCES locations(location_id)
);

-- PK Ȥ�� �ܷ�Ű�� �ƴ� �÷��� �����ϴ� ���
ALTER TABLE student ADD(
    stu_parent NUMBER(25) CONSTRAINT stu_pa_fk REFERENCES employees( last_name )
);

-- # ���̺� ������ FK �����ϱ�
--  - FK������ �ϴ� �÷��� FOREIGN KEY�� �����ϰ�, �����ϴ� ���̺� �� �÷��� REFERENCES�� �����Ѵ�
ALTER TABLE student ADD(
    department_id NUMBER(4), CONSTRAINT stu_dept_fk FOREIGN KEY(department_id) REFERENCES departments ( department_id)
);

SELECT * FROM student;

INSERT INTO student VALUES(1,'ȫ�浿','M','B','011-1211-1234', 90, 2500, 10);

SELECT *FROM locations;

SELECT * FROM student
INNER JOIN locations USING(location_id)
INNER JOIN departments USING( department_id)
;


DESC students2;
ALTER TABLE students2 ADD (
    stu_phone CHAR(13)
);

-- �̹� �����ϴ� �÷��� �������� �߰��ϱ�
ALTER TABLE students2 ADD CONSTRAINT stu2_ph_uk UNIQUE(stu_phone);

SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';

-- # �÷��� �̹� �����ϴ� �������� �����ϱ�
ALTER TABLE students2 DROP CONSTRAINT stu2_ph_uk;

-- # NOT NULL, DEFAULT�� ADD CONSTRAINT��� MODIFY�� �̿��� �÷��� �����Ѵ�
ALTER TABLE students2 MODIFY stu_phone CONSTRAINT stu2_ph_nn NOT NULL;
ALTER TABLE students2 MODIFY stu_phone DEFAULT '000-0000-0000';

-- # Ȯ�ο�
SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENTS2';

/*
    # ON DELETE ��
        - FK�� �����ϰ� �ִ� PK�� �����Ǿ��� �� �ش� FK�� ��� �������� �����Ѵ�
        - CASCADE : �����ϴ� PK�� ���� �Ǹ� FK�� ���� �Բ� �����Ѵ�
            ex : departments���� 50�� �μ��� �����ϸ� employees�� ��� 50�� �μ��� ���� ����� �����ȴ�
        - SET NULL : �����ϴ� PK�� �����Ǹ� FK�� ���� NULL�� ��ȯ�Ѵ�
            ex : departments���� 50�� �μ��� �����ϸ� employees�� ��� 50�� �μ��� ���� �����
                 department_id�� null�� ��ȯ�Ѵ�
        - RESTRICT : ON DELETE�� �������� ���� ��� �ڽ��� �ִ� �θ�Ű�� ������ �����Ѵ�
*/

CREATE TABLE empp AS SELECT * FROM employees;
CREATE TABLE depp AS SELECT * FROM departments;
CREATE TABLE jobb AS SELECT * FROM jobs;

SELECT * FROM user_constraints WHERE table_name = 'EMPP';
SELECT * FROM user_constraints WHERE table_name = 'DEPP';

SELECT * FROM empp;
SELECT * FROM depp;

-- ��������02 : empp���̺�� depp���̺��� �⺻Ű/�ܷ�Ű ���� ������ �����غ�����

-- ���ﶧ�� SYS_0000 <-- ��Ȯ�� ���ڸ� �־�� ���� ����
-- SYS_C0011776, SYS_C0011777, SYS_C0011778, SYS_C0011779
--  lastname         email         hire_date     job_id

-- �⺻Ű�� ���� �߰� �ؾ��Ѵ�
ALTER TABLE empp ADD CONSTRAINT empp_emp_ip_pk PRIMARY KEY(employee_id);
ALTER TABLE depp ADD CONSTRAINT depp_id_pk PRIMARY KEY(department_id);
ALTER TABLE jobb ADD CONSTRAINT jobb_id_pk PRIMARY KEY(job_id);

-- ���Ŀ� �ܷ�Ű �߰�.
ALTER TABLE empp ADD (
    CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) REFERENCES depp(department_id),
    CONSTRAINT empp_manager_fk FOREIGN KEY(manager_id) REFERENCES empp(employee_id),
    CONSTRAINT empp_job_fk FOREIGN KEY(job_id) REFERENCES jobb(job_id)
    -- Self References : �� ���̺��� employee_id�� ���Ե� ���� manager_id �÷��� �߰��� �� �ִ�
);

/*
ALTER TABLE empp MODIFY(
    hire_date CONSTRAINT empp_hire_date_nn NOT NULL,
    job_id CONSTRAINT empp_job_nn NOT NULL,
    email CONSTRAINT empp_email_nn NOT NULL,
    last_name CONSTRAINT empp_lat_name_nn NOT NULL
);
*/



-- # ON DELETE �׽�Ʈ

-- 1. �ܷ�Ű�� ON DELETE�� ����
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id)
    REFERENCES depp(department_id) ON DELETE CASCADE;

SELECT * FROM empp ORDER BY department_id;
SELECT * FROM depp;

-- 2. �θ�Ű�� ���� (30�� �μ��� ����)
DELETE FROM depp WHERE department_id = 30;

-- �� CASCADE�� �θ�Ű�� �����ϸ� ���� FK���� ��� �����ȴ�.


-- # ON DELETE SET NULL �׽�Ʈ

-- 1. �ܷ�Ű�� ON DELETE SET NULL�� ����
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id)
    REFERENCES depp(department_id) ON DELETE SET NULL;

-- 2. SET NULL�� ���·� 100�� �μ��� ����
DELETE FROM depp WHERE department_id = 100;

SELECT * FROM empp ORDER BY department_id DESC;

-- # ON DELETE �̼��� �׽�Ʈ

-- 1. �ܷ�Ű�� ON DELETE �⺻��(RESTRICT)���� ����
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id)
    REFERENCES depp(department_id);

-- 2. �⺻���� ���·� 50�� �μ��� ����
DELETE FROM depp WHERE department_id = 50;

SELECT * FROM empp ORDER BY department_id DESC;
-- �� ON DELETE���� �����Ǿ� ���� ���� ��쿡�� �ڽ� ���ڵ尡 �ִ� �θ�Ű�� ������ �� ����


